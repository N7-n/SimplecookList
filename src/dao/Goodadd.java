package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.DBset;
public class Goodadd {
	private PreparedStatement pstmt;
    private ResultSet rs;

    public void goodadd(int goodcount,int id) {
//    	String title = dto.getTitle();

    	try{
    		goodcount=goodcount+1;
    		Connection con = DBset.getConnection();
    		String sql = "update dataLog set goodcount=? where id=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, goodcount);
            pstmt.setInt(2, id);

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

