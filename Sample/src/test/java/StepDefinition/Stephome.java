package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Home;

public class Stephome {

    WebDriver driver = null;
    Home el;
    @Given("^open the browser$")
          public void openthebrowser() {
        System.out.println("testing");
        System.setProperty(
                "webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        // Instantiate a ChromeDriver class.
        driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://www.amazon.com/");

    }

    @And("^search with keyword$")
     public void searchwithkeyword()
    {
        el= new Home(driver);
        el.enterSearch();
    }

    @When("^click on the search button$")
    public void clickonthesearchbutton(){
    el.clickButton();
    }

    @Then("^validate the results$")
    public void validatetheresults ()
    {
     el.checkResults();
     driver.close();
    }
}
