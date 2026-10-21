"""
1번

list_a = [0,1,2,3,4,5,6,7] 이다. 다음 함수들을 실행했을때 list_a의 결과값

# (1)
list_a.extend(list_a)
-> [0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7]
# extend: 리스트에 리스트를 이어붙이는 메소드

# (2)
list_a.append(10)
-> [0,1,2,3,4,5,6,7,10]

# (3)
list_a.insert(3,0)
-> [0,1,2,0,3,4,5,6,7]

# (4)
list_a.remove(3)
-> [0,1,2,4,5,6,7]

# (5)
list_a.pop(3)
-> [0,1,2,4,5,6,7]

# (6)

list_a.clear()
-> []
"""

"""
2번
반복분 내부에 if 조건문의 조건식을 채워서 100이상의 숫자만 출력하게끔하세요

number = [273, 103, 5, 32, 65, 9, 72, 800, 99]

for number in numbers:
    if ________ :
        print(" 100 이상의 수:",number)

답: number >= 100

"""


"""
3번
다음 빈칸을 채워서 실행 결과에 해당하는 프로그램들을 완성해보세요

numbers = [273, 103, 5, 32, 54, 9, 72, 800, 99 ]


3-1. 홀/짝 구하기

답: 

for i in numbers :
    if i % 2 == 1 :
        print(f"{i}는 홀수입니다.")
    else :
        print(f"{i}는 짝수입니다.")


3-2. 자릿수

답: 

for i in numbers :
    if i/10 >= 10 :
        print(f"{i}는 3의 자릿수입니다.")
    elif i/10 >= 1:
        print(f"{i}는 2의 자릿수입니다.")
    elif i/10 < 1 :
        print(f"{i}는 1의 자릿수입니다.")
    else :
        pass
        
"""

"""
4번
다음 코드의 빈칸을 채워서 실행결과처럼 출력되도록 완성

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]
output = [[], [], []]

for number in numbers:
    output[____________].append(number)

print(output)

실행 결과 : [[1, 4, 7], [2, 5, 8], [3, 6, 9]]

답: number%3 - 1

"""

"""
5번
다음 코드의 빈칸을 채워서 실행 결과처럼 출력되도록 완성해 보세요. 

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]

for i in range(0, len(numbers) // 2):
    # j가 1, 3, 5, 7 이 나오려면
    # 어떤식을 사용해야할까
    j = ______________
    print(f"i = {i}, j = {j}")
    numbers[j] = numbers[j] ** 2

print(numbers)

답: j = i*2+1

"""

