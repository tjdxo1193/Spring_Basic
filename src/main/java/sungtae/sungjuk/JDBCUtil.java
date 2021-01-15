package sungtae.sungjuk;

import java.sql.*;

public class JDBCUtil {

    // JDBC 드라이버 초기화 및 Connection 객체 생성
    public static Connection makeConn() {
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.cmhqke6zpvyh.us-east-2.rds.amazonaws.com:3306/playground";
        String USR = "master";
        String PWD = "bigdata2020";

        Connection conn = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USR,PWD);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버가 없어요!");
        } catch (SQLException e) {
            System.out.println("JDBC 연결 실패!");
        }
        return conn;
    }

    // JDBC 관련 객체 해제
    public static void destoryConn(Connection conn, PreparedStatement pstmt) {
        if (pstmt != null) try {
            pstmt.close();
        } catch (SQLException ex) { }

        if (conn != null) try {
            conn.close();
        } catch (SQLException ex) { }
    }

    public static void destoryConn(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        if (rs != null) try {
            rs.close();
        } catch (SQLException ex) { }

        destoryConn(conn, pstmt);
    }
}
