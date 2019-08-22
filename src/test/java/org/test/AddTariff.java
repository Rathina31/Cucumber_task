package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddTariff {
	
	static WebDriver driver;
	
	@Given("User should be in telecom homepages")
	public void user_should_be_in_telecom_homepages() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABC\\Desktop\\Day1\\Cucumber_Selenium2\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://http://demo.guru99.com/telecom/");
	}

	@Given("User click on Add Tariff Plan")
	public void user_click_on_Add_Tariff_Plan() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan'])[1]")).click();
	}

	@When("User enter all the fields")
	public void user_enter_all_the_fields() {
		driver.findElement(By.id("rental1")).sendKeys("11");
		driver.findElement(By.id("local_minutes")).sendKeys("22");
		driver.findElement(By.id("inter_minutes")).sendKeys("33");
		driver.findElement(By.id("sms_pack")).sendKeys("44");
		driver.findElement(By.id("minutes_charges")).sendKeys("55");
		driver.findElement(By.id("inter_charges")).sendKeys("66");
		driver.findElement(By.id("sms_charges")).sendKeys("77");
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	@Then("User should be displayed Congratulation you add Tariff Plan")
	public void user_should_be_displayed_Congratulation_you_add_Tariff_Plan() {
	Assert.assertTrue(driver.findElement(By.xpath("//header[@class='align-center']")).isDisplayed());
	}


}
