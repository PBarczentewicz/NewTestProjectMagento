package org.example.test;

import org.example.base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTest extends BaseTest {

    @Test
    public void ShopNewJogaButton() {
        navigateToHomePage();

       // homePage.findByXpath("//*[contains(@class, 'action more button')]").click();

        //WebElement NewJogaButton = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/a/span/span[2]"));
        //NewJogaButton.click();

     //   String curentUrl = driver.getCurrentUrl();


     //   WebElement productSize = driver.findElement(By.id("option-label-size-143-item-171"));
      //  productSize.click();

       // WebElement productColor = driver.findElement(By.id("option-label-color-93-item-49"));
       // productColor.click();

      //  WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[4]/div/div[1]/form/button/span"));
      //  addToCartButton.click();

    }
}
