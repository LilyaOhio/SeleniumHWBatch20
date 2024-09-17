package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductiontoLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");
        WebElement firstName= driver.findElement(By.id("fullName"));
        firstName.sendKeys("Lilya");
        WebElement email=driver.findElement(By.id("yourEmail"));
        email.sendKeys("lilya@gmail.com");
        WebElement clientName= driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Lilya");
        WebElement clientId= driver.findElement(By.id("ClientId"));
        clientId.sendKeys("Lilya112");
        WebElement feedBack= driver.findElement(By.id("ClientfeedbackId"));
        feedBack.sendKeys("Good");
        WebElement project= driver.findElement(By.id("ProjectNameId"));
        project.sendKeys("Syntax");
        WebElement deadline= driver.findElement(By.name("ProjectTime"));
        deadline.sendKeys("Tomorrow");
        WebElement address= driver.findElement(By.name("CurrentAddress"));
        address.sendKeys("Ohio");
        WebElement permamentAdress= driver.findElement(By.name("PermanentAddress"));
        permamentAdress.sendKeys("Columbus");
        WebElement submit= driver.findElement(By.name("btn-submit"));
        submit.click();
        Thread.sleep(3000);
        WebElement click= driver.findElement(By.linkText("Click Here."));
        click.click();

    }
}
