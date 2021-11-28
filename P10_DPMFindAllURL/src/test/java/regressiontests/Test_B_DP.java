package regressiontests;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.fbhome;

import org.testng.annotations.DataProvider;

public class Test_B_DP extends baseclass {
  @Test(dataProvider = "dp")
  public void f(String emailid, String pass) throws InterruptedException {
	  fbhome ob = new fbhome(driver);
	  
	  ob.emailid(emailid);
	  ob.password(pass);
	  ob.loginclick();
	  driver.navigate().back();
	  Thread.sleep(5000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaaaaaaa" },
      new Object[] { "def@yahoo.com", "bbbbbbbbb" },
    };
  }
}
