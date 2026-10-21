# 재귀함수, 재귀란 자기 자신을 호출하는것
# 1] 팩토리얼 반복문
def factorial1(n) :
    output = 1
    for i in range( 1, n+1 ) :
        output *= i
    return output
factorial1( 2 ) # 2! -> 1~2 
factorial1( 3 ) # 3! -> 1~3

# 2] 팩토리얼 재귀
def factorial2(n) :
    # 무한 재귀 방지
    if n == 0 :
        return 1
    else : # 재귀함수
        return n * factorial2( n - 1)
factorial2(2)
factorial2(3)



# 구구단 반복문
for 단 in range( 2, 10, 1 ) : # 단 : 2부터 9까지 1씩 증가
    for 곱 in range(1, 10, 1) : # 곱 : 1부터 9까지 1씩 증가
        print(단*곱)

# 3단 까지의 반복문 순서도 작성

# 구구단 재귀
def 구구단( 단 =2 , 곱 = 1) :
    # 무한재귀 방지
    if 단 > 9 : # 재귀 끝
        return
    if 곱 > 9 : # 곱하기 9까지 했으면 단 올리기
        구구단(단+1, 1)
        return
    print( 단 * 곱 )
    구구단( 단, 곱+1 ) # 곱올리기
구구단( )
# 3단/4곱 까지의 반복문 순서도 작성