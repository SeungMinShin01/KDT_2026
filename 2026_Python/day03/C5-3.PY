# 튜플이란? 여러 자료들을 저장하는 리스트와 비슷한 자료형
# 특징: 초기화 이후 수정 불가능
# ( 요소, 요소, 요소 )
# 튜플선언
tuple_test = (10, 20, 30)
# 요소값 호출
print( tuple_test[0] , tuple_test[2] ) # 10, 30
# 요소값 수정
# tuple_test[0] = 40 # 오류 수정 불가능(튜플)
# 요소 하나의 경우
tuple_test2 = (273)
print(tuple_test2)
# 튜플은 소괄호 생략해도 된다.
( a, b ) = ( 10, 20 ) 
print( a, b )
a , b = 10 , 20
print( a , b ) 
# - 스왑 / 구조분해
a , b = b , a # a에 b값 대입 , b에 a값 대입
# - 리액트(JS)에서 비슷한 문법 존재 -> 구조분해( useState , props )
# name , age = { name : "유재석" , age : 10 }
# name , age = [ "유재석" , 10 ]
c , d = [ 30, 40 ]
print( c, d )

# 함수/연산 결과는 항상 1개
def test() :
    # return ( 10, 20 )
    return 10, 20 # 결과는 1개 (10 과 20 묶은 튜플 1개)

# 콜백함수: 함수 그 자체를 매개변수로 전달하여 전달받은 곳에서 함수 호출
# onClick( 회원가입() ) [X] ----> onClick( 회원가입 ) [O] 
def call_10_items( func ) : # 값 대신에 함수 받기
    func()
def print_hello() :
    print("안녕하세요")

call_10_items( print_hello() ) # 함수를 호출
call_10_items(print_hello ) 


# java : 리스트.stream.forEach() , 리스트.stream.map( ) , 리스트.stream.filter( )
# react : 리스트.forEach( ) , 리스트.map( ) , 리스트.filter( )
# python : for X in 리스트 , map( 코드 , 리스트 ) , filter( 코드 , 리스트 )
# forEach 단순반복(return 없다) , map 반복+반환(return 있다) , filter 반복+(참이면)반환
# 예제
def power( item ) :
    return item * item
def under_3( item ) :
    return item < 3 
list_a = [ 1, 2, 3, 4, 5 ]
output_a =  map( power , list_a )  # py map
print( list( output_a ))
# JS map : list_a.map( power ) , list_a.map( x -> return x*x )
output_b = filter( under_3 , list_a ) # py filter
print( list( output_b ) )
# JS filter : list_a.filter( under_3 ) , list_a.filter( x -> return x < 3 )

# 람다(화살표함수)? 코드 줄이기
# lamda 매개변수 : 리턴값   PY: def 함수명( ):
# JAVA람다 : () -> { }  JAVA: public void 함수명( ){ }
# JS 람다 : ( ) => { }  JS: function 함수명( ){ }
power = lambda item : item*item
output_a = map( power , list_a )
# 인라인 람다
output_a = map( lambda item : item*item , list_a )
#------------------------------------------------------------------
# React
# 1.
# const power = (item) => { return item*item }
# list_a.map( item => { return power })
# 2.
# list_a.map( (item) => { return item*item } )
#------------------------------------------------------------------
# 람다는 JAVA 등과 비교하면서 공부해볼 것
