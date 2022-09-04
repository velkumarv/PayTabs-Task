package PayTabs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();

//Launch Url
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//To maximize the Window
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//Enter the Username
driver.findElement(By.name("username")).sendKeys("Admin");

//Enter the Password
driver.findElement(By.name("password")).sendKeys("admin123");

//click the Login button
driver.findElement(By.xpath("//button[text()=' Login ']")).click();

//Navigate to Homepage and click Admin
driver.findElement(By.linkText("Admin")).click();

Thread.sleep(3000);

//Click Add Button
driver.findElement(By.xpath("//button[text()=' Add ']")).click();

//click User Role Dropdown
driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")).click();

//Click Admin on Dropdown
driver.findElement(By.xpath("(//span[text()='Admin'])[2]")).click();

//Enter Employee name and choose 3rd Name
driver.findElement(By.xpath("(//label[text()='Employee Name']/following::input)[1]")).sendKeys("p");
driver.findElement(By.xpath("(//div[@class='oxd-autocomplete-option'])[3]")).click();

//Click Status tab and Select Enabled 
driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).click();
driver.findElement(By.xpath("//span[text()='Enabled']")).click();
Thread.sleep(3000);

//Enter the Username
driver.findElement(By.xpath("(//label[text()='Employee Name']/following::input)[2]")).sendKeys("velkumar96");
Thread.sleep(3000);

//Enter the Password
driver.findElement(By.xpath("(//label[text()='Employee Name']/following::input)[3]")).sendKeys("Velkumar@96");

//Enter the confirm password 
driver.findElement(By.xpath("(//label[text()='Employee Name']/following::input)[4]")).sendKeys("Velkumar@96");

//Click the save button
driver.findElement(By.xpath("//button[text()=' Save ']")).click();

//Click the Profile
driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();

//Click Logout 
driver.findElement(By.linkText("Logout")).click();

//Enter the Username
driver.findElement(By.name("username")).sendKeys("velkumar96");

//Enter the Password
driver.findElement(By.name("password")).sendKeys("Velkumar@96");

//Click login Button
driver.findElement(By.xpath("//button[text()=' Login ']")).click();

//Close the Browser 
driver.close();

	}

}
