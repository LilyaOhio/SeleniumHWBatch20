package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        WebElement hobbie= driver.findElement(By.xpath("//input[@name='yourHobbies']"));
        hobbie.sendKeys("I like to dance");
        WebElement click= driver.findElement(By.xpath("//button[@id='display_text']"));
        click.click();
        WebElement movie= driver.findElement(By.xpath("//input[@name='favoriteMovies']"));
        movie.sendKeys("Pretty Woman");

WebElement text= driver.findElement(By.xpath("//label[contains (text(),'sit amet consectetur')]"));
String text1= text.getText();
        System.out.println(text1);

        WebElement city= driver.findElement(By.xpath("//input[@name='yourCity']"));
        city.sendKeys("Columbus");
   WebElement clientName= driver.findElement(By.xpath("//input[@class='form-control' and @data-detail='one']"));
   clientName.sendKeys("Mark");

        WebElement clientId= driver.findElement(By.xpath("//input[@class='form-control' and @data-detail='two']"));

clientId.sendKeys("Smith");
 WebElement street= driver.findElement(By.xpath("//input[@name='StreetNo']"));
 street.sendKeys("1111 Indepenence ave");
WebElement house= driver.findElement(By.xpath("//input[@name='HouseNo']"));
house.sendKeys("4009");



    }

}
