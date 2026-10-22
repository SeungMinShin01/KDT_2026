numbers = [1,2, 3, 4, 5, 6]

print("::".join(map(str, numbers)))

# 실행결과 1::2::3::4::5::6


numbers = list(range(1, 10 + 1 ))

print("# 홀수만 추출하기")
print(list(filter(lambda item : item % 2 == 1, numbers)))

print("# 3 이상, 7 미만 추출하기")
print(list(filter(lambda item : item >= 3 and item < 7, numbers)))
print()

print("#제곱해서 50 미만 추출하기")
print(list(filter(lambda item : item ** 2 < 50, numbers)))