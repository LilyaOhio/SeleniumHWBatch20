package SeleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://google.com");
driver.navigate().to("https://google.com");
String title =driver.getTitle();
        System.out.println(" the title of page is "+ title);

driver.get("https://www.syntaxprojects.com");
driver.navigate().to("https://www.syntaxprojects.com");
String title2= driver.getTitle();
        System.out.println(" the title of page is "+ title2);
        driver.navigate().back();

        driver.navigate().refresh();
        driver.close();
    }
}
