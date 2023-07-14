package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    WebDriver driver;
    By txt_search = By.xpath("//input[@id='twotabsearchtextbox']");
    By bt_search =  By.xpath("//input[@id='nav-search-submit-button']");

    By result = By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");

    public Home(WebDriver driver)
    {
        this.driver=driver;
    }

    public void enterSearch()
    {
        driver.findElement(txt_search).sendKeys("iphone");
    }

    public void clickButton(){

        driver.findElement(bt_search).click();

    }

    public void checkResults()
    {
        String Result = driver.findElement(result).getText();
        System.out.println("First value in page"+Result);
        Assert.assertEquals("Apple iPhone",Result);



    }

}
