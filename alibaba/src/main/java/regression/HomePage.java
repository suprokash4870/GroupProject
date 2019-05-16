package regression;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    @FindBy(id = "//*[@id=\"nav-orders\"]/span[2]")
    WebElement orderTab;

    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/i")
    WebElement hamburger;

    @FindBy(id = ("twotabsearchtextbox"))
    WebElement inputSearch;



    public void setOrderTab(){
        orderTab.click();
    }
    public void setHamburger(){
        if(hamburger.isDisplayed()){
            hamburger.click();
            Assert.assertTrue(true);
            hamburger.click();
        }
    }
    public void setInputSearch (String name) throws InterruptedException{
        if (inputSearch.isEnabled()){
            inputSearch.sendKeys(name,Keys.ENTER);
        }
        Thread.sleep(5000);

    }
}