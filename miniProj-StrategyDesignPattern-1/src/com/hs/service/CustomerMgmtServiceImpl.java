package com.hs.service;

import com.hs.bo.customerBO;
import com.hs.dao.ICustomerDAO;
import com.hs.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtSerivice {

	private ICustomerDAO dao;
	
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		
		this.dao = dao;
	}


	@Override
	public String calculateSimpleIntrest(CustomerDTO dto) throws Exception {
		// Business logic
		float intrAmt=(dto.getpAmt()*dto.getTime()*dto.getRate())/100;
		System.out.println(intrAmt);
		
		//Prepare CustomerBO object having persist-able data
		customerBO bo=new customerBO();
		bo.setcAdd(dto.getcAdd());
		bo.setcName(dto.getcName());
		bo.setpAmt(dto.getpAmt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrAmt(intrAmt);
		
		//use DAO
		int count=dao.insert(bo);
				
		return count==0?"Customer Registration Failed":"Customer Registration Successed :: Details - Principle Amount: "+dto.getpAmt()+" Time: "+dto.getTime()+" Rate of Intrest: "+dto.getRate()+" Intrest Amount: "+dto.getIntrAmt();
	}

}
