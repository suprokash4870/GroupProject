package regression;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div[1]/div[1]/div[2]/span[1]/a")
    WebElement sign_in;



    public void click_signin(){
        sign_in.click();


    }


    }
