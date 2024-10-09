package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownwithoutSelectTagAssignment {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

WebElement fruite= driver.findElement(By.xpath("//div[@id='dream_fruits']"));

fruite.click();

List<WebElement> allffruites= driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
for(WebElement DD:allffruites){
    if(DD.getText().equals("Mango")){
        DD.click();
    }

    WebElement hobbie= driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
    hobbie.click();
    List<WebElement> list= driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
    for(WebElement read:list){
        if(read.getText().equals("Reading"));
        read.click();
    }





}


    }
}
