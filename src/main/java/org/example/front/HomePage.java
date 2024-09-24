package org.example.front;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public HomePage setEmail(String email) {
        findById("recipient-email").sendKeys(email);
        return this;
    }

    public HomePage setName (String name){
        findById("recipient-name").sendKeys(name);
        return this;
    }

    public HomePage setMessage (String message){
        findById("message-text").sendKeys(message);
        return this;
    }

    public HomePage clickContactButton() {
        findByXpath("//button[@onclick='send()']").click();
        return this;
    }
}
