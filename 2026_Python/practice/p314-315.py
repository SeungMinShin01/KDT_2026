앉힐수있는최소사람수 = 2
앉힐수있는최대사람수 = 10
전체사람의수 = 100
memo = {}

def 문제(남은사람수, 최소사람수) :
    key = str([남은사람수 , 최소사람수])
    # 종료조건
    if key in memo :
        return memo[key]
    if 남은사람수 < 0 :    
        return 0
    if 남은사람수 == 0 :
        return 1
    # 재귀처리
    result = 0
    for i in range(최소사람수, 앉힐수있는최대사람수 + 1):
        result += 문제(남은사람수 - i, i)
    # 메모화 처리
    memo[key] = result
    # 종료
    return result


print(문제(전체사람의수, 앉힐수있는최소사람수))

# 실행결과 437420