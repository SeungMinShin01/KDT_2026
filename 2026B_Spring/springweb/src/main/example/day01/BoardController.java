package example.day01;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// 1. 해당 컨트롤러에게 HTTP(웹기술) 적용하기 <- 서블릿필요 (톰캣 포함(스프링부트내장 포함))
// 2. 서블릿에게 상속(해당 클래스로부터 멤버변수와 메소드를 물려받기 ) , extends HttpServlet
// 3. 물려받은 기능( init , service , destroy ) 재정의 --> 오버라이딩
// 4. HTTP doXXX 메소드 오버라이딩 하여 기능 구현
// 5. 해당 컨트롤러에게 HTTP 주소 등록하기 , @WebServlet("/주소정의ㅎ")
public class BoardController extends HttpServlet {

    // [1] 서블릿이 최초 실행 된 경우 딱 1번 실행되는 메소드
    @Override
    public void init() throws ServletException {
        super.init();
    }

    // [2] 클라이언트 요청이 들어올 때마다 실행되는 메소드
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.service(req, resp);
    }

    // [3] 서블릿이 사라질 때(서버 종료될 때) 1번 실행되는 메소드
    @Override
    public void destroy() {
        super.destroy();
    }

    // ****************************** HTTP METHOD CRUD **************************//
    // [4-1] doGet : Http 요청이 GET 이면
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Dao를 호출하여 로그인 처리
        super.doGet(req, resp);
    }

    // [4-2] doPost : HTTP 요청이 POST 이면
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    // [4-3] doPut : HTTP 요청이 PUT 이면
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    // [4-4] doDelete : HTTP 요청이 DELETE 이면 실행
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

}
