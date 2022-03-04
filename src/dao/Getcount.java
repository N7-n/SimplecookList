package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.DBset;

public class Getcount {
	  private PreparedStatement pstmt;
	  private ResultSet rs;

	    public int getcount(int id) {
	    	int results =0;

	    	try{
	    		Connection con = DBset.getConnection();
//	    		Statement stmt = con.createStatement();
	            String sql ="select * from dataLog where id = ?";
	            pstmt = con.prepareStatement(sql);
	    		pstmt.setInt(1, id);
	    		rs = pstmt.executeQuery();
	    		while(rs.next()){
	    			results=rs.getInt("goodcount");
	    		}

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
			return results;
	    }

}
