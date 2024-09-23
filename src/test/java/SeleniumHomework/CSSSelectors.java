package SeleniumHomework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CSSSelectors {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");
        WebElement UserId = driver.findElement(By.cssSelector("input#UserID"));
        UserId.sendKeys("Lilya");
        WebElement UserName= driver.findElement(By.cssSelector("input#UserName"));
        UserName.sendKeys("Lilya");

WebElement intro= driver.findElement(By.cssSelector("input[name^='Lec']"));
intro.sendKeys("Css");

WebElement Ray= driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
Ray.sendKeys("Cool");
WebElement Dcky= driver.findElement(By.cssSelector("input[class$='Box2']"));
Dcky.sendKeys("Great");

WebElement clientID= driver.findElement(By.cssSelector("input[data-ends$='ID']"));
clientID.sendKeys("Lilt");

WebElement Email= driver.findElement(By.cssSelector("input[name*='ema']"));
Email.sendKeys("lilya@gmail.com");

WebElement Topic= driver.findElement(By.cssSelector("input[data-content^='CSS']"));
Topic.sendKeys("Short cuts");


    }

}