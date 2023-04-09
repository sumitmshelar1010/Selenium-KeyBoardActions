package MainPackage.SeleniumChromeDriver.locators.ActionsClass_ActionIntrface.keyboardbaseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {//KEYBOARD BASE METHODS IN ACTIONS CLASS

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://courses.letskodeit.com/practice");
        WebElement we = wd.findElement(By.id("name"));
        Actions ac  = new Actions(wd);
        wd.manage().window().maximize();
        ac.moveToElement(we)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("sumit")
                .keyUp(Keys.SHIFT);
               Action action = ac.build();
               /** Action interface is use to represent Single user interaction**/
             action.perform();

        Thread.sleep(3000);
        wd.close();
    }

}
