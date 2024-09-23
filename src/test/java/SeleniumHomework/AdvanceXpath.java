package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");
        WebElement leastfavourite= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        leastfavourite.sendKeys("Cinderella");
        WebElement favourite= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
favourite.sendKeys("World history");
WebElement mostfavourite= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));

mostfavourite.sendKeys("war and peace");


        WebElement mostfavourite1= driver.findElement(By.xpath("//input[@id='favouriteBook']"));

        mostfavourite1.sendKeys("war and peace");

        WebElement favourite2= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favourite2.sendKeys("World history");

        WebElement leastfavourite3= driver.findElement(By.xpath("input[@id='favouriteBook']/following-sibling::input[2]"));
        leastfavourite3.sendKeys("Cinderella");


WebElement grandparent= driver.findElement(By.xpath("//div[@class='row col-4-fields' and @id='familyTree']/child::input[1]"));
grandparent.sendKeys("pal");
WebElement parent= driver.findElement(By.xpath("//div[@class='row col-4-fields' and @id='familyTree']/child::input[2]"));

parent.sendKeys("Mike");

WebElement child= driver.findElement(By.xpath("//div[@class='row col-4-fields' and @id='familyTree']/child::input[3]"));
child.sendKeys("John");




    }
}
