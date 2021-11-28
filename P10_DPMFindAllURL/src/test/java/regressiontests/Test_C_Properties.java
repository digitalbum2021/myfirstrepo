package regressiontests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.fbhome;

public class Test_C_Properties extends baseclass{
  @Test
  public void f() throws IOException {
	
	  Properties myProps = new Properties();
	  FileInputStream propFile = new FileInputStream("/Users/skynet/Documents/eclipse-workspace/P10_DPMFindAllURL/DataSet.properties");
	  myProps.load(propFile);
	  
	  String emailText = myProps.getProperty("email");
	  String passText = myProps.getProperty("pass");
	  
//	  System.out.println(emailText);
//	  System.out.println(passText);
//	  
	  fbhome obj = new fbhome(driver);
//	  obj.emailid(emailText);
//	  obj.password(passText);
	  obj.findLinks();
	  
	  
  }
}
