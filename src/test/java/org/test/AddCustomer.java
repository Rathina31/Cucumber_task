package org.test;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;



public class AddCustomer {
	
	static WebDriver driver;
	
	@Given("User should be in telecom homepage")
	public void user_should_be_in_telecom_homepage() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ABC\\Desktop\\Day1\\Cucumber_Selenium2\\lib\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
	driver.manage().window().maximize();
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
	driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	}

	@When("User enters all the fields")
	public void user_enters_all_the_fields() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("Rathina");
	    driver.findElement(By.id("lname")).sendKeys("Pandian");
	    driver.findElement(By.id("email")).sendKeys("rathina.kay@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("Dindigul");
	    driver.findElement(By.id("telephoneno")).sendKeys("9944165244");
	}
	
	@When("Users enters all the fields")
	public void users_enters_all_the_fields(DataTable customerDatas) {
	    List<String> datas =customerDatas.asList(String.class);
	 
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(datas.get(0));
	    driver.findElement(By.id("lname")).sendKeys(datas.get(1));
	    driver.findElement(By.id("email")).sendKeys(datas.get(2));
	    driver.findElement(By.name("addr")).sendKeys(datas.get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
	}
	
	@When("Users enters all the field")
	public void users_enters_all_the_field(DataTable dataTable) {
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
	    driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
	    driver.findElement(By.id("email")).sendKeys(datas.get("email"));
	    driver.findElement(By.name("addr")).sendKeys(datas.get("address"));
	    driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phno"));
	}

	@When("user enters all the fields{string},{string},{string},{string},{string}")
	public void user_enters_all_the_fields(String a, String b, String c, String d, String e) {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(a);
	    driver.findElement(By.id("lname")).sendKeys(b);
	    driver.findElement(By.id("email")).sendKeys(c);
	    driver.findElement(By.name("addr")).sendKeys(d);
	    driver.findElement(By.id("telephoneno")).sendKeys(e);
		
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	
	@Then("User should be displayed the customer id is generated")
	public void user_should_be_displayed_the_customer_id_is_generated() {
	Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
	}

}
