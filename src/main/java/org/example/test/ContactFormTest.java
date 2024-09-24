package org.example.test;

import org.example.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactFormTest extends BaseTest {


    @Test
    public void contactFormFront (){
        navigateToHomePage();

        homePage.findByXpath("//*[@data-target='#exampleModal']").click();
        homePage
                .setEmail("test@test.pl")
                .setName("TOmas")
                .setMessage("lksajdsakljdskadjskdksajdsaldjsalkdsadkas")
                .clickContactButton();
        Alert alert = driver.switchTo().alert();
        String succesAlert = alert.getText();
        String succesText = "Thanks for the message!!";

        Assertions.assertEquals(succesAlert, succesText);







       // WebElement contactForm = homePage.findByXpath("//a[@class='nav-link']");
       // contactForm.click();

    }
}
