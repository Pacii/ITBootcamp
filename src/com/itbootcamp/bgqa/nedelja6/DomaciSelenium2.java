package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomaciSelenium2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        JavascriptExecutor j = (JavascriptExecutor)wd;
        j.executeScript("window.scrollBy(0,500)");



        wd.get("https://demoqa.com/automation-practice-form");
        //NAME
        wd.findElement(By.id("firstName")).sendKeys("ABCD");
        //LASTNAME
        wd.findElement(By.id("lastName")).sendKeys("EFGH");
        //EMAIL
        wd.findElement(By.id("userEmail")).sendKeys("email@mail.com");
        //GENDER
        WebElement male = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        if (!male.isSelected()) {
            male.click();
        }
        //NUMBER
        wd.findElement(By.id("userNumber")).sendKeys("1234567890");


        //DATE OF BIRTH

        WebElement dateOfBirthInput = wd.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInput.click();
        WebElement year= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
        year.click();
        WebElement pickYear=wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]/option[118]"));
        pickYear.click();
        WebElement pickMonth= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
        pickMonth.click();
        WebElement month=wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]/option[2]"));
        month.click();
        WebElement pickDate= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]"));
        pickDate.click();
        Thread.sleep(1000);

       //HOBBY
        WebElement checkbox1 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]/input[1]"));
        ((JavascriptExecutor)wd).executeScript("arguments[0].checked = true;", checkbox1);

        //PICTURE
        WebElement picture = wd.findElement(By.id("uploadPicture"));
        picture.sendKeys("C:\\Users\\Pacii\\Pictures\\s.png");

        //ADDRESS
        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[9]/div[2]/textarea[1]")).sendKeys("ADDRESS1");



        //SUBMIT BTN
        WebElement buttonSubmit = wd.findElement(By.id("submit"));
        buttonSubmit.click();

}
    }

    //Marko ostalo nisam uspeo