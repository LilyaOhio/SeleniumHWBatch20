package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement> id = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        boolean isnotfond = true;
        while (isnotfond) {

            int count = 1;
            for (WebElement allid : id) {
                String strID= allid.getText();
                if(strID.equals("111035A")) {
                    System.out.println(count);
                    WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]"));
                    row.click();
isnotfond=false;


                }
                count++;
            }
if(isnotfond){
    WebElement next= driver.findElement(By.xpath("//a[text()='Next'][1]"));
    next.click();
    id= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
}

        }
    }
}
