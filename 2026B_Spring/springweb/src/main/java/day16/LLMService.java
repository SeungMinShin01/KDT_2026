package day16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/*
    LLM : 대규모 언어 모델 => AI 모델
    LLM API : 각 LLM 회사에서 API 제공 , API(유료/무료)
*/
@Service
@RequiredArgsConstructor
public class LLMService {

    // 1. 서비스키 불러오기
    @Value("${api.gemini-ley}")
    public String geminiApiKey;

}
