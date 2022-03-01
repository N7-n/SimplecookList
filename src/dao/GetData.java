package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.DBset;

public class GetData {
    private PreparedStatement pstmt;
    private ResultSet rs;
    int a=0;
    public int getData(){
    	try{
    		Connection con = DBset.getConnection();
    		Statement stmt = con.createStatement();
  //  		pstmt = con.prepareStatement("insert  into datalog values(1,as,add,dff,20)");
    		rs = stmt.executeQuery("select * from dataLog");
    		while(rs.next()){
    			a=rs.getInt("time");
    		}
//    		int count = stmt.executeUpdate("update dataLog set time = 200 where id = 1");

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
    	return(a);
    }


}
