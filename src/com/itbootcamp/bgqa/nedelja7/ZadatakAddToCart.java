/*package com.itbootcamp.bgqa.nedelja7;

import com.itbootcamp.bgqa.nedelja6.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZadatakAddToCart {
    public void test1{
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        Actions action = new Actions(wd);

        JavascriptExecutor j = (JavascriptExecutor) wd;


        wd.get("https://www.automationexercise.com/login");
        WebElement home = wd.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
        home.click();
        j.executeScript("window.scrollBy(0, 550)");
        WebElement product = wd.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]"));
        action.moveToElement(product).perform();
        WebElement addToCart = wd.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]"));
        addToCart.click();
        WebElement viewCart = wd.findElement(By.cssSelector("div.container div.row div.col-sm-9.padding-right div.features_items div.modal.show:nth-child(2) div.modal-dialog.modal-confirm div.modal-content div.modal-body p.text-center:nth-child(2) > a:nth-child(1)"));
        viewCart.click();




    }
}*/