package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");
        WebElement retrieve= driver.findElement(By.xpath("//div[text()='inspect me to view my custom attribute!']"));
      String text= retrieve.getText();
        System.out.println(text);
if (text.equals("inspect me to view my custom attribute")){
    System.out.println("meet criteria");
}else{
    System.out.println("doesnt meet criteria");

}

WebElement music= driver.findElement(By.xpath("//label[@class='radio-inline']"));
if(music.isEnabled()){
    music.click();
}

WebElement TechTalk= driver.findElement(By.xpath("//label[@class='radio-inline']"));
boolean statusoftechtalk= TechTalk.isEnabled();
if(!statusoftechtalk){
    System.out.println("the tech talk is disable");
}else {
    System.out.println("the tech talk is enable");
}


WebElement option= driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
option.click();

WebElement art= driver.findElement(By.xpath("//label[@id='hiddenRadioLabel']"));
if(art.isDisplayed()){
    art.click();
}

WebElement mystery= driver.findElement(By.xpath("//div[@id='hidden_message']"));
        System.out.println(mystery.getAttribute("title"));

WebElement checkBox= driver.findElement(By.xpath("//div[@class='checkbox'][1]"));
boolean checkBox1= checkBox.isEnabled();
if(!checkBox1) {
    checkBox.click();


    WebElement text1= driver.findElement(By.xpath("//input[@id='inputField']"));
    text1.clear();
    text1.sendKeys("here is the custom text entered");


}



        }


    }
