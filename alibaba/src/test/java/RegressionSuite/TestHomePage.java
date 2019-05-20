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
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }

    @AfterMethod
    public void recap() {
        driver.get(url);
    }

    @Test(priority = 1)
    public void test() {
        String str = driver.getTitle();
        System.out.println(str);
    }

    @Test(priority = 2)
    public void test2() throws InterruptedException {
        homePage.setSignin();
        homePage.setAccount();
        homePage.setPassword();
        //homePage.setClick_signin();

    }

    @Test(priority = 3)
    public void current_url() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test(priority = 4)
    public void clcik_on_Search() throws InterruptedException {
        homePage.setSearch_text();
        homePage.setHit_search();
    }


}

