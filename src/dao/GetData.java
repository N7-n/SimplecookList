package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import main.DBset;
import main.DTO;
public class GetData {
    private PreparedStatement pstmt;
    private ResultSet rs;
    public List<DTO> getData(){
    	List<DTO> results = new ArrayList<DTO>();
    	try{
    		Connection con = DBset.getConnection();
    		String sql = "select * from dataLog";
    		pstmt = (PreparedStatement) con.prepareStatement(sql);
    		rs = pstmt.executeQuery();

    		while (rs.next()) {
                // 1件ずつCountryオブジェクトを生成して結果を詰める
                DTO dataset = new DTO();
                dataset.setId(rs.getInt("id"));
                dataset.setTitle(rs.getString("title"));

                // リストに追加
                results.add(dataset);
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
