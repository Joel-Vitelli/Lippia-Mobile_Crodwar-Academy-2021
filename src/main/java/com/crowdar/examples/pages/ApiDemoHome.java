package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.mobile.core.PageBase;

public class ApiDemoHome extends PageBase{

	public ApiDemoHome(SharedDriver driver){
		super(driver);
		this.url = "";
	}
	
    public String getTitle(){
    	return getMobileElement(By.xpath("//*[@resource-id='android:id/action_bar']")).findElement(By.xpath("//android.widget.TextView")).getText();
    }

    private WebElement getMenuElement(String menu){
    	return getMobileElement(By.xpath("//android.widget.TextView[@content-desc="+"\""+menu+"\""+"]"));
    }
    
   public void clickMenuElement(String menu){
       WebElement element = getMenuElement(menu);
        element.click();
   }

}
