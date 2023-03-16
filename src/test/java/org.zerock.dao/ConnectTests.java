
package org.zerock.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTests {
    @Test
    public void testConnection() throws Exception {
        //JDBC 드라이버 클래스를 메모리로 로딩하는 역할
        Class.forName("org.mariadb.jdbc.Driver");

        //DB와 네트워크 연결 = DB 접속 정보
        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/webdb",
                "doom",
                "ska123");

        //DB와 정상적으로 연결되면 객체는 null이 아니다라고 확신
        Assertions.assertNotNull(connection);

        //DB 연결  종료
        connection.close();
    }
}