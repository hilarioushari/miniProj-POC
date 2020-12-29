package com.hs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.hs.bo.customerBO;

public class CustomerDAOImpl implements ICustomerDAO {

	private static final String INSERT_QUERY="INSERT INTO LAYERED_CUSTOMER (CNAME,CADD,PAMT,RATE,TIME,INTRAMT) VALUES(?,?,?,?,?,?)";
	private DataSource ds;
	
	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(customerBO bo) throws Exception {
		
		//GET POOLED CONNECTION
		Connection con=ds.getConnection();
		
		//create perparedStatement object
		PreparedStatement ps= con.prepareStatement(INSERT_QUERY);
		ps.setString(1, bo.getcName());
		ps.setString(2, bo.getcAdd());
		ps.setFloat(3, bo.getpAmt());
		ps.setFloat(4, bo.getRate());
		ps.setFloat(5, bo.getTime());
		ps.setFloat(6, bo.getIntrAmt());
		
		//execute the sql query
		int count =ps.executeUpdate();
		
		//close JDBC connections
		ps.close();
		con.close();
		
		return count;
	}

}
