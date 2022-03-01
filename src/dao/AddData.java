package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.DBset;
public class AddData {
	private PreparedStatement pstmt;
    private ResultSet rs;

    public void addData(String title,String text ,String item,int time) {
//    	String title = dto.getTitle();

    	try{
    		Connection con = DBset.getConnection();
    		String sql = "insert into dataLog (title,text,item,time) values(?,?,?,?)";
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, title);
            pstmt.setString(2, text);
            pstmt.setString(3, item);
            pstmt.setInt(4, time);

            pstmt.executeUpdate();
    	}catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally{
    		if( rs != null ){
    			try {
    				rs.close();
    			} catch (SQLException e) {
    				e.printStackTrace();
    			}
    		}
    		if( pstmt != null ){
    			try {
    				pstmt.close();
    			} catch (SQLException e) {
    				e.printStackTrace();
    			}
    		}
    		DBset.close();
    	}
    }

}

