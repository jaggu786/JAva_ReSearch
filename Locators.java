package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators 
{
   
public static By menu =By.id("menu-toggle");
public static By login=By.linkText("Login");
public static By username= By.id("txt-username");
public static By password =By.id("txt-password");
public static By  submit =By.id("btn-login");
public static By healthcare= By.id("combo_facility");
public static By hospital_readmission =By.id("chk_hospotal_readmission");
public static By program=By.id("radio_program_medicare");
public static By appointment_date=By.id("txt_visit_date");
public static By table=By.xpath( "/html/body/div/div[1]/table");
public static By rows=By.tagName("tr");
public static By cols=By.tagName("td");
public static By feedback=By.id("txt_comment");
public static By bookappointment=By.id("btn-book-appointment");
public static By logout =By.linkText("Logout");


}
