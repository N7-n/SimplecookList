package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBset {
    // データベース接続と結果取得のための変数
    private static Connection con;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // 1. ドライバのクラスをJava上で読み込む
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2. DBと接続する
        con = DriverManager.getConnection(
            "jdbc:mysql://us-cdbr-east-05.cleardb.net/heroku_8006aeea56fc414?reconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf8&characterSetResults=utf8",
            "bd40076db02a2b",
            "c90a5279"
        );
        // "password"の部分は，ご自身でrootユーザーに設定したものを記載してください。

        return con;
    }

    public static void close() {
        // 7. 接続を閉じる
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
