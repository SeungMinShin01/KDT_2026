# 비교연산자
    # == , != , > , < , >= , <=
# 범위논리
x = 25
print(10 < x < 30)
# 논리연산자
    # not, and , or
print( not True)    #False
print( True and True ) # True
print( True and False ) # False
print( True or False ) # True

# if 조건문
#if 조건식:
#    (tab 들여쓰기)참이면
# else :
#    (tab 들여쓰기)거짓이면 
age = 10
if age >= 19 :
    print('성인입니다')
else :
    print( '홀수입니다')
# if ~ elif ~ elif ~ else :
point = 85
if point >= 90:
    print('A')
elif point >= 80:
    print('B')
elif point >= 70 :
    print('C')
else :
    print('재시험')

# 주의할점 : if ~ if ~ if ~ else [VS] if ~ elif ~ elif ~ elif

# 자바와 다르게 (조건식){ } 없이 : 콜론과 들여쓰기 구분

# if중첩
x = 10
if x > 5 :
    if x > 10 :
        print ("10보다 크다")
    else :
        print('5보다 크고 10보다 작거나 같다')
else :
    print('5보다 작거나같다')


# None, 0, 0.0 , 빈문자열, 빈리스트, 빈객체 등
# 그외 True