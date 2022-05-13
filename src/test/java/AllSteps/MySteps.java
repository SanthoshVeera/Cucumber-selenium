package AllSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class MySteps {
    WebDriver driver;
    Scanner sc=new Scanner(System.in);
    String username="";
    String password="";
    @Given("Open chrome browser and launch linkedIn")
    public void openChromeBrowserAndLaunchLinkedIn() {
        System.out.println("Enter Email or Phone: ");
        username=sc.next();
        System.out.println("Enter your password: ");
        password=sc.next();
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        System.out.println("in given");
        driver=new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.linkedin.com/login");
    }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @Then("the profile should be opened in LinkedIn")
    public void the_profile_should_be_opened_in_linked_in() {
        System.out.println("in Then");
        driver.findElement(By.id("submit-button")).click();
    }
}
