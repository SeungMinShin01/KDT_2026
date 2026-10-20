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

# 문자열 연산
# 1. + 연결연산자
print("안녕" + "하세요")
# print( "안녕" + 1) # 주의할점 : 문자열 과 숫자 연결 불가능
# 2. *반복연산자
print( "안녕" * 3) # 안녕안녕안녕
# 3. 인덱싱 , 문자열은 배열
# 인덱스란? 0부터 요소들이 저장된 순서, **음수도 가능**
# "안녕하세요" , 양수: 0~4 , 음수 : -1 ~ -5
print( "안녕하세요"[0] ) # 안
print( "안녕하세요"[3] ) # 세
# print( "안녕하세요"[5] ) # 오류:IndexError: string index out
print( "안녕하세요"[-1] ) # 요 # 역순 인덱스
print( "안녕하세요"[-3] ) # 하
# print( "안녕하세요"[-6] ) # 오류:IndexError: string index out

# 4. 슬라이싱 , 문자열 자르기/일부 추출 , [ 시작인ㄷ게스 : 끝인덱스-1 ]
print( "안녕하세요"[0:2] ) # 0~1 # 안녕
print( "안녕하세요"[1:3] ) # 1~2 # 녕하
print( "안녕하세요"[2:4] ) # 2~3 # 하세
# 시작인덱스 생략시 0, 끝인덱스 생략시 마지막인덱스
print( "안녕하세요"[1:] ) # 1~끝까지 # 녕하세요
print( "안녕하세요"[:3] ) # 0~2 # 안녕히

# 5. 문자열의 길이 , len( 문자열 )
print( len("안녕하세요") ) # 5


# 숫자 연산자
print( 5+7 ,  5-7 , 5*7 , 5/7 ) #사칙연산자
print( 3//2 , 3%2 , 3**2 ) # 몫 // , 나머지 % , 제곱 **
print( 5 + 3 * 2 ) # 11
print( (5+3) * 2 ) # 16
print( 2 + 2 -2 * 2 / 2 * 2 )
# 1. 2 * 2 -> 4  , 2. 4/2 -> 2 , 3. 2*2 -> 4 
# 4 2+2 -> 4 , 5. 4-4 -> 0
