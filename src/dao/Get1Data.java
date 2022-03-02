package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.DBset;
import main.DTO;

public class Get1Data {
	  private PreparedStatement pstmt;
	  private ResultSet rs;

	    public List<DTO> get1Data(int id) {
	    	List<DTO> results = new ArrayList<DTO>();

	    	try{
	    		Connection con = DBset.getConnection();
//	    		Statement stmt = con.createStatement();
	            String sql ="select * from dataLog where id = ?";
	            pstmt = con.prepareStatement(sql);
	    		pstmt.setInt(1, id);
	    		rs = pstmt.executeQuery();
	    		while(rs.next()){
	                DTO dto = new DTO();
	                dto.setId(rs.getInt("id"));
	                dto.setTitle(rs.getString("title"));
	                dto.setText(rs.getString("text"));
	                dto.setItem(rs.getString("item"));
	                dto.setTime(rs.getInt("time"));
	                results.add(dto);
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
	    	return(results);
	    }

}
