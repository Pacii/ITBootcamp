package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;

import java.io.IOException;
import java.util.Set;

public class DomaciSelenium {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\ChromePutanja\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("https://demoqa.com/text-box");



        System.out.println("Full Name dohvatanje: ");
        WebElement fullName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/label[1]"));
        System.out.println(fullName.getText());
        System.out.println(fullName.getAttribute("class"));
        System.out.println(fullName.getAttribute("id"));
        System.out.println(fullName.getCssValue("color"));

        System.out.println("Email dohvatanje: ");
        WebElement email = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/label[1]"));
        System.out.println(email.getText());
        System.out.println(email.getAttribute("class"));
        System.out.println(email.getAttribute("id"));
        System.out.println(email.getCssValue("color"));

        System.out.println("Current Address dohvatanje: ");
        WebElement currentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[1]/label[1]"));
        System.out.println(currentAddress.getText());
        System.out.println(currentAddress.getAttribute("class"));
        System.out.println(currentAddress.getAttribute("id"));
        System.out.println(currentAddress.getCssValue("color"));

        System.out.println("Permanent Address dohvatanje: ");
        WebElement permanentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[1]/label[1]"));
        System.out.println(permanentAddress.getText());
        System.out.println(permanentAddress.getAttribute("class"));
        System.out.println(permanentAddress.getAttribute("id"));
        System.out.println(permanentAddress.getCssValue("color"));

        System.out.println("Submit button dohvatanje: ");
        WebElement submitBtn = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
        System.out.println(submitBtn.getText());
        System.out.println(submitBtn.getAttribute("class"));
        System.out.println(submitBtn.getAttribute("id"));
        System.out.println(submitBtn.getCssValue("color"));

// Popunjavanje login page-a i provera sumbita

        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Aleksa Petrovic");
        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]")).sendKeys("aleksapetrovic123@gmail.com");
        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]")).sendKeys("Petra Petrovica 23");
        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]")).sendKeys("Marka Markovica 72");
        submitBtn.click();
        Assert.assertEquals(false, submitBtn.isSelected());
        System.out.println("Submit button is not selected");
        Thread.sleep(1000);
        wd.close();


    }
}
