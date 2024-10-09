package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;



public class Iframe {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");


driver.switchTo().frame(1);
        WebElement age= driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(age);
        WebElement check= driver.findElement(By.xpath("//input[@type='checkbox']"));

check.click();




        driver.switchTo().defaultContent();
       driver.switchTo().frame(1);
WebElement select= driver.findElement(By.xpath("//select[@id='cities']"));

        Select city= new Select(select);
        city.selectByVisibleText("Chicago");


    }

}


