package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    String url = "https://www.alibaba.com/";

    @BeforeClass
    public void init(){
        homePage = PageFactory.initElements(driver , HomePage.class);
        driver.get(url);
    }
    @AfterMethod
    public void recall(){
        driver.get(url);
    }
    @Test
    public void click_search(){

    }


}
