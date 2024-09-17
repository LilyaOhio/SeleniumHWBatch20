package SeleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com");
        driver.navigate().to("https://www.syntaxprojects.com");

String url=driver.getCurrentUrl();
String title= driver.getTitle();
        System.out.println(" the title of page is "+ title);
        System.out.println(" the current url is "+ url);
        driver.close();
    }
}
