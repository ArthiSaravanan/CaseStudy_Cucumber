package CucumberCasestusy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy1 {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arthi.a.saravanan\\ChromeDriver\\chromedriver.exe");
	}
	WebDriver driver = new ChromeDriver();
	@Given("user is on Registration page")
	public void user_is_on_Registration_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
		  WebElement signin=driver.findElement(By.linkText("SignIn"));
		  signin.click();
	
	}

	@When("user enters the details for registration & click on register")
	public void user_enters_the_details_for_registration_click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement reg=driver.findElement(By.xpath("//div[@class='row form-group ']/div/a"));
		  reg.click();
		  //driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
		  //WebElement reg= driver.findElement(By.className("btn btn-lg btn-success col-xs-3 col-md-offset-0"));
		  //reg.click();
		//  System.out.println("Registration Successful");
		  //driver.get("http://10.232.237.143:443/TestMeApp/register.htm?userName=LalithaKumar&firstName=Lalitha&lastName=Kumar&password=Password123&confirmPassword=Password123&gender=Female&emailAddress=lalitha%40gmail.com&mobileNumber=9998887765&dob=01%2F12%2F1995&address=+90+south+car+st%2C+Delhi&securityQuestion=411010&answer=TamilNadu&Submit=Register");
		  WebElement name=driver.findElement(By.name("userName"));
		  name.sendKeys("LalithaKumar");
		  WebElement firstName=driver.findElement(By.name("firstName"));
		  firstName.sendKeys("Lalitha");
		  WebElement lastName=driver.findElement(By.name("lastName"));
		  lastName.sendKeys("Kumar");
		  WebElement pa=driver.findElement(By.name("password"));
		  pa.sendKeys("Password123");
		  WebElement cpd=driver.findElement(By.name("confirmPassword"));
		  cpd.sendKeys("Password123");
		  WebElement female=driver.findElement(By.xpath("//label[contains(@class,'form-control')]/input[2]"));
		  female.click();
		  WebElement email=driver.findElement(By.name("emailAddress"));
		  email.sendKeys("lalitha@gmail.com");
		  WebElement mobile=driver.findElement(By.name("mobileNumber"));
		  mobile.sendKeys("9998887765");
		  WebElement dob=driver.findElement(By.name("dob"));
		  dob.sendKeys("01/12/1995");
		  WebElement address=driver.findElement(By.name("address"));
		  address.sendKeys("90 south car st, Delhi");
		  WebElement secques=driver.findElement(By.name("securityQuestion"));
		  secques.sendKeys("What is your Birth Place");
		  WebElement ans=driver.findElement(By.name("answer"));
		  ans.sendKeys("TamilNadu");
		  WebElement regis=driver.findElement(By.xpath("//div[@class='row form-group']/div[@class='col-md-12 remove-default-padding']/input"));
		  regis.click();
		  
		  System.out.println("Registration Successful");
		  driver.get("http://10.232.237.143:443/TestMeApp/register.htm?userName=LalithaKumar&firstName=Lalitha&lastName=Kumar&password=Password123&confirmPassword=Password123&gender=Female&emailAddress=lalitha%40gmail.com&mobileNumber=9998887765&dob=01%2F12%2F1995&address=+90+south+car+st%2C+Delhi&securityQuestion=411010&answer=TamilNadu&Submit=Register");
		
	  }


	@Then("User should see login page")
	public void user_should_see_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement regis=driver.findElement(By.xpath("//div[@class='row form-group']/div[@class='col-md-12 remove-default-padding']/input"));
		  regis.click();
		  
		  System.out.println("Registration Successful");
		  driver.get("http://10.232.237.143:443/TestMeApp/register.htm?userName=LalithaKumar&firstName=Lalitha&lastName=Kumar&password=Password123&confirmPassword=Password123&gender=Female&emailAddress=lalitha%40gmail.com&mobileNumber=9998887765&dob=01%2F12%2F1995&address=+90+south+car+st%2C+Delhi&securityQuestion=411010&answer=TamilNadu&Submit=Register");
		
		
	 
	}

}
