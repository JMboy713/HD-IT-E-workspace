package jdbcTest;

import java.sql.*;

// 1. jdbc driver class를 사용할 수 있어야 함.
// 해당 class를 다운로드 받아서 이걸 우리 프로젝트의 build path 에 포함시켜야 함.
public class BasicJdbcConnect {
    public static void main(String[] args) {
        // MySQL에 연결. 당연히 MySQL 에 연결하기 위한 JDBC Driver 를 프로그램 안응로 로딩해야 한다.
        //  Driver Loading
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");
            // 3가지 정보 - 계정 ID, PW, URL
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?characterEncoding=UTF-8&serverTimezone=Asia/Seoul&useUnicode=true", "root", "admin1234");
            System.out.println("데이터 베이스 접속 성공");
            // Connection 객체를 얻었으면, sql 쿼리를 작성해서 전달해야 하는데 이 sql을 실어서 보낼 객체가 필요.
            // statement 라고 한다. 3가지 종류


            String sql = "select first_name, last_name, gender from employees where gender='F' limit 10";
            PreparedStatement ps = conn.prepareStatement(sql);
            // 이렇게 전달한 statement 를 만들었으면, 이제 실행하면 된다.
            // select 문을 사용하면, 결과 레코드를 가져옴 
            // 이때 사용하는 method 는 excuteQuery() 라는 메서드
            // 실행시 resultset이라는 포인터를 받는다.
            // return 값은 resultset으로 받는다.

            // 5. 데이터 추출
            ResultSet rs = ps.executeQuery();
            while(rs.next()){ // 1행부터 시작.
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
//                String gender = rs.getString("gender");

                System.out.println(firstName + "," + lastName );
            }
            rs.close(); //6. 사용한 자원 반납.
            ps.close();
            conn.close();


        } catch (Exception e) {
            System.out.println("잘못됨.");
        }

    }
}
