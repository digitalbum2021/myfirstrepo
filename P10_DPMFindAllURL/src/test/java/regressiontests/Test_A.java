package regressiontests;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.fbhome;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class Test_A extends baseclass {
  
  @Test
  public void f() throws IOException {
	  fbhome ob = new fbhome(driver);
	  ob.emailid("abc@yahoo.com");
	  ob.password("aaaaaaaa");
	
  }
}

