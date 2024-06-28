import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class BankingWebsiteTest {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\ATT\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
int notificationSetting = 2; 
HashMap<String, Object> prefs = new HashMap<>();
prefs.put("profile.default_content_setting_values.notifications", notificationSetting);
options.setExperimentalOption("prefs", prefs);
WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.axisbank.com/");
try {
WebElement popupElement = driver.findElement(By.id("popup_id"));
actual popup element identifier
popupElement.click();
} catch (Exception e) {
e.printStackTrace();
} finally {
driver.quit();
}
}
}
