package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");
        WebElement menu = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select multi = new Select(menu);
        multi.selectByIndex(3);


        WebElement hobbie = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));

        Select option = new Select(hobbie);

        option.selectByIndex(1);
        option.selectByVisibleText("Cooking");
        option.selectByValue("Gardening");

        List<WebElement> list = option.getAllSelectedOptions();
        for (WebElement all : list) {
            System.out.println(all.getText());
        }

            Thread.sleep(5000);
            option.deselectByIndex(1);
            List<WebElement> list1 = option.getAllSelectedOptions();
            for (WebElement all1 : list1) {
                System.out.println(all1.getText());
            }


        }
    }


