// Generated by Selenium IDE

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class CorrectnessOfOrientation{
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void ValidateRadioButtonOriendtaion() {
    System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");

    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.get("http://localhost:3000/feedback");
    driver.manage().window().maximize();
    new Actions(driver).moveByOffset(620,350 ).click().build().perform();
    boolean b= driver.findElement(By.id("notRecommend")).isSelected();
    Assert.assertEquals(true,b);
  }
}
