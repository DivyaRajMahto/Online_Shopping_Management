package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

public class StatisticsDao {
	
	
	
		Connection con = Myconnection.getConnection();
	    PreparedStatement ps;
	    Statement st;
	    ResultSet rs; 

	    
	    
	    private int total(String tableName) {
	    	  int total = 0;
	    	  try {
	    		  
	    		  st = con.createStatement();
	    		  rs = st.executeQuery("select count(*) as 'total' from "+ tableName +"");
	    		  if(rs.next()) {
	    			  total = rs.getInt(1);
	    			  
	    		  }
	    		  
	    	  } catch(SQLException ex) {
	    		  
	    		  ex.printStackTrace();
	    	  }
	    	  return total;
	      }
	    
	    
	    
	    
	    
	    private double totalSales() {
	    	  double total = 0.0;
	    	  try {
	    		  
	    		  st = con.createStatement();
	    		  rs = st.executeQuery("select sum(*) as 'total' from purchase");
	    		  if(rs.next()) {
	    			  total = rs.getDouble(1);
	    			  
	    		  }
	    		  
	    	  } catch(SQLException ex) {
	    		  
	    		  Logger.getLogger(StatisticsDao.class.getName()).log(Level.SEVERE, null, ex);
	    	  }
	    	  return total;
	      }
	    
	    
	    
	    
	    private double todaySales() {
	    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
	    	Date date = new Date();
	    	String today = df.format(date);
	    	  double total = 0.0;
	    	  try {
	    		  
	    		  st = con.createStatement();
	    		  rs = st.executeQuery("select sum(*) as 'total' from purchase where p_date = '"+today+"'");
	    		  if(rs.next()) {
	    			  total = rs.getDouble(1);
	    			  
	    		  }
	    		  
	    	  } catch(SQLException ex) {
	    		  
	    		  Logger.getLogger(StatisticsDao.class.getName()).log(Level.SEVERE, null, ex);
	    	  }
	    	  return total;
	      }
	    
	    
	    
	    
	    private double totalPurchase(int id) {
	    	  double total = 0.0;
	    	  try {
	    		  
	    		  st = con.createStatement();
	    		  rs = st.executeQuery("select sum(*) as 'total' from purchase where uid = "+id+"");
	    		  if(rs.next()) {
	    			  total = rs.getDouble(1);
	    			  
	    		  }
	    		  
	    	  } catch(SQLException ex) {
	    		  
	    		  Logger.getLogger(StatisticsDao.class.getName()).log(Level.SEVERE, null, ex);
	    	  }
	    	  return total;
	    
	    }	  
	    	  
	    private int totalDeliveries(String name) {
		    	  int total = 0;
		    	  try {
		    		  
		    		  st = con.createStatement();
		    		  rs = st.executeQuery("select count(*) as 'total' from purchases where supplier = '"+name+"' and status = 'Received");
		    		  if(rs.next()) {
		    			  total = rs.getInt(1);
		    			  
		    		  }
		    		  
		    	  } catch(SQLException ex) {
		    		  
		    		  Logger.getLogger(StatisticsDao.class.getName()).log(Level.SEVERE, null, ex);
		    	  }
		    	  return total;
		      }	  
	      
	    
	    
	    public void admin() {
	    	AdminDashboard.jCat.setText(String.valueOf(total("category")));
	    	AdminDashboard.jPro.setText(String.valueOf(total("product")));
	    	AdminDashboard.jUsers.setText(String.valueOf(total("user")));
	    	AdminDashboard.jSuppliers.setText(String.valueOf(total("supplier")));
	    	AdminDashboard.jSales.setText(String.valueOf(totalSales()));
	    	AdminDashboard.jTsales.setText(String.valueOf(todaySales()));
	    	
	    	
	    }
	    
	    
	    
	    public void user(int id) {
	    	UserDashboard.jCat.setText(String.valueOf(total("category")));
	    	UserDashboard.jPro.setText(String.valueOf(total("product")));
	    	UserDashboard.jPur.setText(String.valueOf(totalPurchase(id)));
	    	
	    }
	    
	    
	    
	    public void supplier(String name) {
	    	SupplierDashboard.jDel.setText(String.valueOf(totalDeliveries(name)));
	    	
	    }
	    
	    

}

