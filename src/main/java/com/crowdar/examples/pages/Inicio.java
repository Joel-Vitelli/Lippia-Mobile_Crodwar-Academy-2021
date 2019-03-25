package com.crowdar.examples.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inicio extends PageBaseExamples{

    public MobileElement menuElement(String menu){return getMobileElement(By.xpath("//android.widget.TextView[@content-desc="+"\""+menu+"\""+"]"));}

    public Inicio(SharedDriver driver){
        super(driver);
        this.url = "";
    }

    public void navegarAlInicio(){
        navigateToIt();
    }

   public void clickinMenu(String menu){
       MobileElement element = menuElement(menu);
        element.click();
   }



}
