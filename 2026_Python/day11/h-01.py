# httpx란? 외부 api 통신하는 라이브러리 , API 연동 / SPRING API
# 설치1 : pip install httpx
# httpx 라이브러리에는 .json() 타입변환 가능하지만 xml 변환 지원하지 않는다
# xmltodict란? xml 변환 지원 라이브러리
# 설치2 : pip install xmltodict
import httpx
import pandas as pd
# 0] 공공데이터포털 본인 인증키
service_key = "55839cf97c27042e7096944f8049d94a16a524362ba0dab7585e1500e90a3ec1"

# 1] 공공데이터포털 json 형식의 자료 요청 , 대구광역시 중구 맛집 현황
def test1() :
    # https://api.odcloud.kr/api/15052602/v1/uddi:855807e2-fe8a-4e47-8a5a-ce1894e410d7_201909031553?page=1&perPage=10&serviceKey=55839cf97c27042e7096944f8049d94a16a524362ba0dab7585e1500e90a3ec1
    # 2] 신청한 API의 주소 및 파라미터 분석 , page현재페이지 , perPage=페이지당자료수 , serviceKey
    url = "https://api.odcloud.kr/api/15052602/v1/uddi:855807e2-fe8a-4e47-8a5a-ce1894e410d7_201909031553"
    url += "?page=1"
    url += "&perPage=147"
    url += f"&serviceKey={service_key}"
    # 3] httpx 이용하여 통신하기 , import httpx
    # httpx.HTTP메소드명( 통신할주소 ) , 통신 결과 반환
    response = httpx.get(url)
    # print(response) # <Response [200 OK]> 성공했다는 뜻
    # 4] 응답 결과 JSON 변환 , .json()
    response_json = response.json()
    # print( response_json )
    # 5] 판다스에 저장하기 , import pandas as pd
    df = pd.DataFrame( response_json['data']) # {"currentCount": 10, "data" : [실질자료]}
    df.info() # 확인
    
test1()

