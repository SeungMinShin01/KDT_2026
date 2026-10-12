package day13;

import java.net.URLEncoder;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cookie")
public class CookieController {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/add")
    public String save(
            @RequestParam(name = "data") String data,
            @CookieValue(value = "list", required = false) String value,
            HttpServletResponse response) {
        try {
            List<String> list = new ArrayList<>();
            if (value != null) {
                list = objectMapper.readValue(value, List.class); // .class 리플렉션
            }

            System.out.println(List.class.getFields());
            list.add(data);
            String str = objectMapper.writeValueAsString(list);
            String encoded = URLEncoder.encode(str, "UTF-8");
            ResponseCookie cookie = ResponseCookie.from("list", encoded)
                    .path("/").maxAge(Duration.ofDays(1))
                    .httpOnly(true).secure(false)
                    .sameSite("Lax").build();
            response.setHeader(HttpHeaders.SET_COOKIE, cookie.toString());
            return "쿠키저장성공";
        } catch (Exception e) {
            return "쿠키저장실패";
        }
    }

    @GetMapping("/all")
    public List<String> getList(@CookieValue(value = "list", required = false) String value) {
        try {
            List<String> list = new ArrayList<>();
            if (value == null)
                return list;
            list = objectMapper.readValue(value, List.class);
            return list;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

}
