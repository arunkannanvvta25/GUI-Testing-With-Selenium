// Generated by Selenium IDE

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class CorrectnessOfLocationOfCheckBox{
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void CheckCorrectnessOfLocationOfElement() {
    System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");

    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.get("http://localhost:3000/rooms");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//div[@id='root']/div/div/section/form/div[5]/div[2]/input")).click();
  }
}
