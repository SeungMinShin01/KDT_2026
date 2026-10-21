"""
1번
다음 표에서 dict_a의 결과가 나오도록 빈칸을 채워보세요

dict_a의 값     |       dict_a에 적용할 코드        | dict_a의 결과
{}                        _____________             {'name' : '구름'}
{'name' : '구름'}         ______________                {}


답: 
dict_a['name']
del dict_a['name']
"""

"""
2번
딕셔너리와 리스트를 조합하면 다음 코드의 변수 pets처럼 다양한 정보를 축적할 수 있습니다.
이를 실행 결과처럼 출력되도록 빈칸에 반복문과 print() 함수를 조합해 보세요.

pets = [
    {"name" : "구름", "age" : 5},
    {"name" : "초코", "age" : 3},
    {"name" : "아지", "age" : 1},
    {"name" : "호랑이", "age" : 1}
]

실행 결과
# 우리 동네 애완동물들 
구름 5살
초코 3살
아지 1살
호랑이 1살

답 : for pet in pets :
    print(f"{pet['name']} {pet['age']}")
"""

"""
3번
다음 빈칸을 채워서 numbers 내부에 들어 있는 숫자가 몇 번 등장하는지를 
출력하는 코드 작성
numbers = [1,2,6,8,4,3,2,1,9,5,4,9,7,2,1,3,5,4,8,9,7,2,3]
counter = {}

for number in numbers :

답: if number in counter :
        counter[number] += 1
    else :
        counter[number] = 1

"""

"""

"""

character = {
    "name" : "기사",
    "level" : 12,
    "items" : {
        "sword": "불꽃의 검",
        "armor": "풀플레이트"
    },
    "skill": ["베기", "세게 베기", "아주 세게 베기"]
}

for key in character:
    if type(character[key]) is str or type(character[key]) is int:
        print(f"{key} : {character.get(key)}")
    elif type(character[key]) is list :
        for value in character[key]:   
            print(f"{key} : {value}")
    elif  type(character[key]) is dict:
        for value in character[key]:   
            print(f"{value} : {character.get(key)[value]}")
 