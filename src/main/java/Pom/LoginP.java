package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_components.BaseClass;

public class LoginP extends BaseClass {

	    private WebDriver driver;
	    
	   
	   
	    private By userName = By.id("user-name");
	    private By passwordF = By.id("password");
	    private By loginButton = By.id("login-button");

	  

	   

		



		public void login(String username, String password){
	    	driver.findElement((By) userName).sendKeys(username);
	    	 
	        driver.findElement(passwordF).sendKeys(password);
	        driver.findElement(loginButton).click();
	    }
	}
	
	
	
	

