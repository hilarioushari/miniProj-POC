package com.hs.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.hs.controller.BankController;
import com.hs.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		//Create IOC Container
		DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/hs/cfgs/applicationContext.xml");
		//get controller class object from IOC container
		BankController controller=factory.getBean("controller",BankController.class);
		//read Inputs from end user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name");
		String name=sc.next();
		System.out.println("Enter customer address::");
		String addrs=sc.next();
		System.out.println("Enter Pinciple amount::");
		String pAmt=sc.next();
		System.out.println("Enter Rate of Intrest::");
		String rate=sc.next();
		System.out.println("Enter Time of Intrest::");
		String time=sc.next();
		//create CustomerVO class obj having all inputs
		CustomerVO vo=new CustomerVO();
		vo.setcName(name);
		vo.setcAdd(addrs);
		vo.setpAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		//invoke method
		try {
			//use controller classs
			String result=controller.processCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			  System.out.println("Problem in Customer Registration");
			e.printStackTrace();
		}
		
		

	}

}
