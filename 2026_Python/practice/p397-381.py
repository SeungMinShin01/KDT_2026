# output = 10 +"개"  # 구문오류 # TypeError
# int("안녕하세요")  # 구문오류 # ValueError
# cursor.close)     # 구문오류 # SyntaxError
# [1, 2, 3, 4, 5][10] # 예외 # IndexError

numbers = [52, 273,32, 103, 90, 10, 275]

print("# (1) 요소 내부에 있는 값 찾기")
number = 10000
try : 
    number in numbers 
    print("성공")
except :
    print("실패")