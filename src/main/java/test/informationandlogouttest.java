package test;

import org.testng.annotations.Test;

import base.bas_cls;
import page.Checkout_page;
import page.Informationandlogoutpage;
import page.Product_page;
import page.login;
import util.excel_util;

public class informationandlogouttest extends bas_cls {

	@Test
	public void addtocart() throws InterruptedException {
		login p1 =new login(driver);
	String x1="D:\\automation\\seleniunm\\Saucedemowork.xlsx";
	String sheet="Sheet1";
	int rowCount = excel_util.getRowCount(x1, sheet);
	System.out.println(rowCount);
	
	for (int i= 1; i <= rowCount;i++)
	{
		int cellCount =excel_util.getCellcount(x1, sheet, i);
		System.out.println("Cell Count: "+cellCount);
		
		
		for (int j = 0; j< cellCount; j += 2) { 
			String userName = excel_util.getCellValue(x1, sheet, i, j);
			System.out.println("UserName = " + userName);
		    String pwd =excel_util.getCellValue(x1, sheet, i, j + 1);
			System.out.println("Password = " + pwd);
			
		
		p1.setValues(userName, pwd);
		    p1.loginclick();
		    
			
			
			String act_url=driver.getCurrentUrl();
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
		

	Product_page  pdt=new Product_page (driver);
	    pdt.loginclick();
	    
	    Checkout_page pdt1=new Checkout_page(driver);
		 pdt1.cartclick();
		pdt1.checkout();
		Informationandlogoutpage pdt2=new Informationandlogoutpage(driver);
    	pdt2.setValues("achu", "ps", "670591");
    	pdt2.countinueclick();
    	pdt2.finishclick();
    	pdt2.backtohmeclick();
    	pdt2.dotclick();
    	pdt2.logout();
    }

    }
	
	    