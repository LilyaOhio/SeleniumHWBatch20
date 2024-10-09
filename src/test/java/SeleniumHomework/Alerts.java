package SeleniumHomework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");
        WebElement button= driver.findElement(By.xpath("//button[text()='Birthday Reminder!']"));
        button.click();
Alert alert= driver.switchTo().alert();
alert.accept();


        WebElement name= driver.findElement(By.xpath("//button[text()='Enter Your Name']"));

name.click();
alert.sendKeys("Lilya");
alert.accept();

WebElement ver= driver.findElement(By.xpath("//p[@id='prompt-demo']"));
String name1= ver.getText();
        System.out.println(name1);
if(name1.equals("You have entered 'Lilya' !")){
    System.out.println("Lilya");

}else{
    System.out.println("incorrect");
}


    }
}
