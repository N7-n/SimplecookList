package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.DBset;
import main.DTO;

public class GetDataListall {
	  private PreparedStatement pstmt;
	    private ResultSet rs;

	    public List<DTO> getListall() {
	    	List<DTO> results = new ArrayList<DTO>();

	    	try{
	    		Connection con = DBset.getConnection();
	    		Statement stmt = con.createStatement();
	    		rs = stmt.executeQuery("select * from dataLog");
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
