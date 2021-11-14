package com.stepdefinition;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YouTubeSearchDefinition {
	public static WebDriver driver ;
	PropertiesFileReader obj = new PropertiesFileReader();
	@Given("^Open Chrome browser and enter url$")
	public void open_Chrome_browser_and_enter_url() throws IOException, InterruptedException {
		Properties properties=obj.getProperty();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sawantm\\eclipse-workspace\\com.cuccumber\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("browser.baseurl"));
		Thread.sleep(3000);
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("^Enter Search criteria$")
	public void enter_Search_criteria() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Mayur Sawant Test");
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("^Click on search Button$")
	public void click_on_search_Button() {
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	
	

}
