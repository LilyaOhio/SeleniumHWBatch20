package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");

        WebElement box = driver.findElement(By.xpath("//input[@id='from_date']"));
        box.click();
        String monthvalue = "December";
        String yearvale = "2024";
        String datevalue = "3";

        boolean isfound = false;
        while (!isfound) {
            WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

            WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year'] "));
String currentmonth=month.getText();
String currentyear= year.getText();
if(currentmonth.equals(monthvalue) && currentyear.equals(yearvale)){
    List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
    for( WebElement alldates:dates){
        if(alldates.getText().equals(datevalue)){
            alldates.click();
            isfound=true;
            break;
        }
    }
}else{
    WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
    next.click();
}

        }



        }
    }
