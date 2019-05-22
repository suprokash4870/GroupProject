package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestMoreCases extends CommonAPI {
    HomePage homePage;
    String url = "https://www.alibaba.com/";

    @BeforeClass
    public void init(){
        homePage = PageFactory.initElements(driver,HomePage.class);
        driver.get(url);

    }
    @AfterMethod
    public void recap(){
        driver.get(url);
    }
  @Test(priority = 22,enabled = false)
  public void signin_bymobille_number() throws InterruptedException {
        homePage.setSignin();
        homePage.setAccount();
        homePage.setPassword();
        homePage.setMobilenumber_signin();
        homePage.setMobilenumber();

  }
  // this method has Actions class to use mouse hover.
  @Test(priority =23 ,enabled = false)
    public void click_catagories() throws InterruptedException {
        homePage.setCatagories();
        homePage.setMachinary_Fabricatoinservice();
  }


}
