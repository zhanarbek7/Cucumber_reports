package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Youtube_steps {
    WebDriver driver = Driver.getDriver();
    @Given("User is on {string}")
    public void userIsOn(String url) {
        driver.get(url);
    }

    @When("User is clicking and searching for {string}")
    public void userIsClickingAndSearchingFor(String text) throws InterruptedException {
        WebElement searchElement = driver.findElement(By.xpath("//input[@id='search']"));
        Thread.sleep(2000);
        searchElement.sendKeys(text, Keys.ENTER);
    }

    @Then("User must be on another page with videos")
    public void userMustBeOnAnotherPageWithVideos() {
        Assert.fail();
    }
}
