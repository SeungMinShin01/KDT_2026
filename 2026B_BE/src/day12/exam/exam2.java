package day12.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class exam2 {

    public static void main(String[] args) {
        // JDBC 란? 자바 와 데이터베이스 연동 제공하는 인터페이스
        // 1. 프로젝트내 lib 폴더에 'mysql-connector-j-26.7.0.jar' 파일 저장한다.
        // [연동]
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC 드라이버 있음!");
            // [2] 데이터베이스 서버 연동
            // DriverManager.getConnection( "jdbc:mysql://localhost:3306/데이터베이스명" , "계정명" ,
            // "비밀번호")

            String url = "jdbc:mysql://127.0.0.1:3306/mydb0813";
            String user = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연동성공");

            // [3] 연동된 데이터베이스 내 DML(insert,select,update,delete) 조작
            String sql = "insert into test( name ) values( '유재석' ) "; // 자바 문자열에 SQL 작성(자동완성 안됨)
            PreparedStatement ps = conn.prepareStatement(sql);
            // conn(연동된인터페이스).prepareStatement( 기재할SQL ); , 기재된 인터페이스 반환
            // PreparedStatement( SQL 기재된 인터페이스 )
            int result = ps.executeUpdate(); // ps.executeUpdate(), (SQL기재된 인터페이스에서 SQL 실행 ), 실행한 레코드수 반환
            System.out.println(result); // 1: 성공 0 : 실패

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 없음 - 라이브러리 추가 필요");
        } catch (SQLException e) {
            System.out.println("DB 서버 연동 실패");
        }

    }
}
