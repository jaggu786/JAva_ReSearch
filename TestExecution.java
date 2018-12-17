package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestExecution extends Repository 
{
  @Test(priority=1)
  public void verifyappointment() throws Exception 
  {
	  bookappointment();
  }
  @Test(priority=0)
  public void verifylaunchapp() throws Exception 
  {
	  launchapp();
  }

  @Test(priority=2)
  public void verifylogout()
  {
	  logout();
  }

}
