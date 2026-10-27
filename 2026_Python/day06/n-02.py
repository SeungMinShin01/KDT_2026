import numpy as np
# 1] 배열의 인덱싱
x = np.array( [10,20,30,40,50] )
print(x[0])
print(x[-2])
print(x[[0,2]])

# 2]
x = np.array( [[1,2,3] , [4,5,6] , [7,8,9] ])
print( x[0,0] ) # 1
print(x[1,2]) # 6
print(x[-1, -2]) # 8
print(x[x>5])

# 3] 슬라이싱 , [시작인덱스 : 끝인덱스-1 : 단계]
x = np.array( [10,20,30,40,50])
print( x[ 1:4]) # 20 30 40
print( x[:3]) # 시작인덱스 생략시 0
print(x[-3 : ]) # 끝인덱스 생략시 마지막인덱스 # 30 40 50
print( x[::2]) # 2칸씩 이동 # [10 30 40]

# 4]
x = np.array( [[1,2,3] , [4,5,6] , [7,8,9]])

# print(x[ 행슬라이싱 , 열슬라이싱 ])
print(x[:1]) # 행:전체 , 열: 1 # [2 5 8]
print(x[ 1, :]) # 행:1행 , 열 : 전체 # [4 5 6 ]
print(x[0:2 , 1:3 ]) # 0~1행 , 1~2열 , #[ [2,3] [5,6]


# 5]
x = np.array( [10,20,30,40,50] )
y = x[1:4] #[20,30,40]
y[0] = 100
print(x) # 원본 확인했더니 원본도 같이 변경
y2 = x[1:4].copy()
y2[0] = 1000
print(x) # 원본 바뀌지 않음

# 6] 배열의연산
x = np.array( [1,2,3] )
y = np.array( [4,5,6] )
print( x + y ) # 같은 위치끼리 더함
print( x*y ) # [ 4 10 18]
print( x**2 ) # [ 1 4 9 ]
print( x-2) # [-1 0 1]
print( np.sqrt(x)) # 제곱근/뤁,
print(x>2) # [False False True]
print((x>1) & (x<3)) # (조건1) & (조건2) , AND
print((x==1) | (x==3)) # (조건1) | (조건2) , OR
print(x > y) # 같은 위치끼리 비교연산 # [False False False]

# 배열 간 비교/연산 : 같은 위치끼리 연산/비교
# 스칼라(단일숫자) 와 배열 비교/연산 : True / False : 스칼라와 연산/비교 결과
