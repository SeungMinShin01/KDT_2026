import pandas as pd
df = pd.read_csv( './ML_pracitce/total_practice/insurance.csv' )


print( df.shape )  # 크기
print( df.head() )

df.info() # 열 이름 , 자료형 , 결측 아닌 개수 확인

print( df.isnull().sum() ) # 결측치 확인
print( '중복 행 수 : ' , df.shape[0] - df.drop_duplicates().shape[0] ) # 중복 행 확인
print( df.describe() )   # 숫자 열 범위 확인


print( df['sex'].value_counts() )      # 문자 열 값 종류 확인
print( df['smoker'].value_counts() )
print( df['region'].value_counts() )

# 중복값 제거
df = df.drop_duplicates().reset_index( drop=True )

df['sex'] = df['sex'].str.strip()
df['smoker'] = df['smoker'].str.strip()
df['region'] = df['region'].str.strip()

print( df.shape )       
print( '수정된 중복 행 수 : ' , df.shape[0] - df.drop_duplicates().shape[0] )   
print( df.isnull().sum() )

X = df.drop( columns=['charges'] )
Y = df['charges']

# 데이터 분할
from sklearn.model_selection import train_test_split
X_train, X_test, Y_train, Y_test = train_test_split( X , Y , test_size=0.2 , random_state=42 )

# 전처리 수치형 / 범주형 특성 분리 
from sklearn.preprocessing import StandardScaler, OneHotEncoder, PolynomialFeatures
from sklearn.compose import ColumnTransformer

num_features = [ 'age', 'bmi', 'children' ]
cat_features = [ 'sex', 'smoker', 'region' ]
pp = ColumnTransformer(
    transformers=[
    ( 'num' , StandardScaler() , num_features ) ,                                   # 수치형 특성
    ( 'cat' , OneHotEncoder( drop='first' , sparse_output=False ) , cat_features )  # 범주형 특성 # sparse_output=False : 변환된 자료들을 numpy 배열로 반환 
] )

# 파이프라인 
from sklearn.pipeline import Pipeline
from sklearn.linear_model import Ridge
pipe = Pipeline( [
    ( 'pp' , pp ) ,
    ( 'poly' , PolynomialFeatures( include_bias=False ) ) ,  
    ( 'model' , Ridge() )              
])

# K-Fold , GridSearchCV 
from sklearn.model_selection import KFold, GridSearchCV
param_grid = {
    'poly__degree' : [ 1 , 2 , 3 ] ,
    'model__alpha' : [ 0.01 , 0.1 , 1.0 , 10.0 , 100.0 ]
}
kf = KFold( n_splits=5 , shuffle=True , random_state=42 )
grid = GridSearchCV( estimator=pipe , param_grid=param_grid , scoring='r2' ,
                     cv=kf , n_jobs=-1 )

grid.fit( X_train , Y_train )

# 최적 모델 평가
best_model = grid.best_estimator_
print( grid.best_params_ )   # 최적 파라미터
print( grid.best_score_ )    # 교차검증 평균 R²
print( 'train r2 : ' , best_model.score( X_train , Y_train ) )
print( 'test  r2 : ' , best_model.score( X_test , Y_test ) )


import joblib

joblib.dump( best_model , './ML_pracitce/total_practice/insurance_pipe.pkl' )

metrics = {
    'test_r2'     : round( best_model.score( X_test , Y_test ) , 4 ) ,   # 테스트(검증) 데이터 R²
    'cv_r2'       : round( float( grid.best_score_ ) , 4 ) ,             # 교차검증 평균 R²
    'best_params' : grid.best_params_                                    # 최적 파라미터
}

joblib.dump( metrics , './ML_pracitce/total_practice/insurance_metrics.pkl' )

print( metrics )


# handle_unknown='ignore' 	처음 보는 값이 와도 에러 없이 0으로 처리
