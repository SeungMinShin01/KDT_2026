print("hello coding python")
# shift + enter 한줄씩/문장 실행
# 파일내 오른쪽 클릭 -> run python -> 전체실행

import keyword
print( keyword.kwlist)

# 하나만 출력
print("하나만 출력합니다")
# 여러 개 출력 , 주의할점 : , 쉼표 기준으로 공백 자동포함
print("여러개", "출력합니다")
print( ) # 한줄 공백, 제어문자 \n

# 타입 확인하기 , type( 자료 )
print( type("안녕하세요")) # <class 'str'>
print ( type(123) ) # <class 'int'>
print( type(1.23) ) # <class 'float'>
print( type(True) ) # <class 'bool'>
print( type(None)) # <class 'NoneType'>
print( type( [ ] )) # <class 'list>
print(type( { } )) # <class 'dict>
print(type( ( ) )) # <class 'tuple'>

# 문자열 만들기
print( "ABC" ) # 큰따옴표 감싼
print( 'ABC' ) # 작은따옴표 감싼
print( """ A
B
C """ )        # """ 여러줄 """ 감싼
print( "A'B'C" ) # 작은따옴표 출력
print( 'A"B"C' ) # 큰 따옴표 출력
print( "\"A\'B\nC\tD\\E") # 제어문자