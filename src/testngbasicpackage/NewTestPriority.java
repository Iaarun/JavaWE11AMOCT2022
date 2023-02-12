package testngbasicpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestPriority {
  @Test(priority = -1)
  public void test1() {
	  System.out.println("NewTest2 test1");
  }
  
  @Test (priority = 3)
  public void test2() {
	  System.out.println("NewTest2 test2");
  }
  
  @Test(priority = 0)
  public void test3() {
	  System.out.println("NewTest2 test3");
  }
  
  @Test(priority = -5, invocationCount = 0)
  public void test4() {
	  System.out.println("NewTest2 test4");
  }
  
  
}
