package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 public class Repository 
{
	 ChromeDriver driver;
    public  void launchapp()throws Exception
	{
    //System.setProperty("webdriver.firefox.driver","‪‪‪‪E:\\jagadeeshselenium\\geckodriver.exe");
     driver=new ChromeDriver();
     driver.get(Testdata.Url);
	 driver.findElement(Locators.menu).click();
	
     driver.findElement(By.linkText(Testdata.login)).click();
     driver.findElement(Locators.username).sendKeys(Testdata.username);
     driver.findElement(Locators.password).sendKeys(Testdata.password);
     driver.findElement(Locators.submit).click();
	}
    public void bookappointment() throws Exception
    {
    	   new Select(driver.findElement(Locators.healthcare)).selectByVisibleText(Testdata.center);
    	   driver.findElement(Locators.hospital_readmission).click();
    	   driver.findElement(Locators.program).click();
    	   driver.findElement(Locators.appointment_date).click();
    	  
    	    WebElement  table=driver.findElement(Locators.table);
    	    List<WebElement> trows=table.findElements(Locators.rows);
    	    boolean flag=false;
    	    for(int i=1;i<trows.size();i++)
    	    {
    	    	//1
    	    
    	         List<WebElement> tcols=trows.get(i).findElements(Locators.cols);
    	    
    	          for(WebElement e:tcols)
    	        	  //2
    		        {
    		
    			      String date=e.getText();
    			
    			      if(date.equalsIgnoreCase(Testdata.appointment_date))
    			         {
    				       e.click();
    				       flag=true;
    				        break;
    			          }
    		          
    		          //2
    		        }
    		 if(flag==true)
    		 {
    			 break;
    		 }
    		  
    	    }
    	    
            driver.findElement(Locators.feedback).sendKeys(Testdata.feedback);
    	    driver.findElement(Locators.bookappointment).click();
    	    
    
    }
    public void logout()
    {
    driver.findElement(Locators.menu).click();
    driver.findElement(Locators.logout).click();
    // driver.close();
     
	}
  
   

 }
