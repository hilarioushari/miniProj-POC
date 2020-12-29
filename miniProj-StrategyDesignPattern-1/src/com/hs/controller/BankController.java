package com.hs.controller;

import com.hs.dto.CustomerDTO;
import com.hs.service.ICustomerMgmtSerivice;
import com.hs.vo.CustomerVO;

public class BankController {

	private ICustomerMgmtSerivice service;

	public BankController(ICustomerMgmtSerivice service) {
	
		this.service = service;
	}
	
	public String processCustomer(CustomerVO vo)throws Exception{
		//convert customer VO to CustomerDTO
		CustomerDTO dto= new CustomerDTO();
		dto.setcName(vo.getcName());
		dto.setcAdd(vo.getcAdd());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		
		String result=service.calculateSimpleIntrest(dto);
		
		return result;
	}
	
}
