package test;

import org.testng.annotations.Test;

import base.bas_cls;
import page.login;
import util.excel_util;

public class Checkout_test extends bas_cls {

		
		
		@Test
		
		public void verifyLoginWithValidCread() throws InterruptedException {
			login p1 =new login(driver);
			
			String x1="C:\\AUTOMATION\\SELENIUM\\saucedemo1.xlsx";
			String sheet="Sheet1";
			int rowCount = excel_util.getRowCount(x1, sheet);
			System.out.println(rowCount);
			
			for (int i= 1; i <= rowCount;i++)
			{
				int cellCount = excel_util.getCellcount(x1, sheet, i);
				System.out.println("Cell Count: "+cellCount);
				
				
				for (int j = 0; j< cellCount; j += 2) { 
					String userName = excel_util.getCellValue(x1, sheet, i, j);
					System.out.println("UserName = " + userName);
				    String pwd = excel_util.getCellValue(x1, sheet, i, j + 1);
					System.out.println("Password = " + pwd);
					
				
					p1.setValues(userName, pwd);
				    p1.loginclick();//login cheyyan
				    
					
					
					String act_url=driver.getCurrentUrl();//login verification//correct username pw koduthal pinne logine pagilek vararth pinne direct thuranna pagilek ane pokandath
					String exp_url="https://www.saucedemo.com/inventory.html";
					
					if(act_url.equalsIgnoreCase(exp_url)){
						  System.out.println("login success");
						  break;
						}
						
						else {
							System.out.println("login failed");
						}
							Thread.sleep(1000);
							driver.get("https://www.saucedemo.com/");
						}
			
			}
			}
			}
			


