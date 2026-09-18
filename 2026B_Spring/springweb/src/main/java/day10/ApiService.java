package day10;

import java.net.URI;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ApiService {
    // @Value("${application.properties속성명}")
    @Value("${api.public-data.service-key}")
    private String serviceKey;

    public Map<String, Object> test1() {
        // 1. API 주소
        String url = "https://api.odcloud.kr/api/15052602/v1/uddi:855807e2-fe8a-4e47-8a5a-ce1894e410d7_201909031553";
        url += "?page=";
        url += "1&perPage=" + 10;
        url += "&serviceKey=" + serviceKey;
        WebClient webClient = WebClient.builder().build();

        // 2. 요청 후 JSON 을 Map 으로 변환. block() 으로 결과가 올 때까지 기다린다.
        // serviceKey 가 이미 인코딩된 값이라 URI.create 로 넘겨 재인코딩을 막는다.
        Map<String, Object> response = webClient.get()
                .uri(URI.create(url))
                .retrieve()
                .bodyToMono(Map.class)
                .block();
        return response;
    }

}

/*
 * 클래스명.class : 리플렉션 (특정/해당 클래스정보 반환)
 */