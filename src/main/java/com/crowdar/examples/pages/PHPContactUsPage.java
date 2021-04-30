package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PHPContactUsPage extends PageBaseMobile {

    public static final String NAME_INPUT_ID = "com.phptravelsnative:id/input_name";
    public static final String EMAIL_INPUT_ID = "com.phptravelsnative:id/input_email";
    public static final String SUBJECT_INPUT_ID = "com.phptravelsnative:id/input_subject";
    public static final String MSJ_INPUT_ID = "com.phptravelsnative:id/input_message";
    public static final String CONTACT_US_BTN_ID = "com.phptravelsnative:id/btn_signup";

    public PHPContactUsPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void completarFormulario(String name, String email, String subject, String msj){
        completeField(By.id(NAME_INPUT_ID), name);
        completeField(By.id(EMAIL_INPUT_ID), email);
        completeField(By.id(SUBJECT_INPUT_ID), subject);
        completeField(By.id(MSJ_INPUT_ID), msj);
    }

    public void tapFinalContactUs(){
        clickElement(By.id(CONTACT_US_BTN_ID));
        System.out.println("Formulario enviado");

    }

}
