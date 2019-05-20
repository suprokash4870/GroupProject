package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div[1]/div[1]/div[2]/span[1]/a")
    WebElement signin;

    @FindBy(id = "fm-login-id")
    WebElement account;

    @FindBy(id = "fm-login-password")
    WebElement password;

    @FindBy(id = "fm-login-submit")
    WebElement click_signin;

    @FindBy(name = "SearchText")
    WebElement search_text;

    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[2]/div/div[1]/form/i[1]")
    WebElement hit_search;

    public void setSignin() throws InterruptedException {
        signin.click();
        Thread.sleep(2000);
    }

    public void setAccount() throws InterruptedException {
        account.sendKeys("practice");
        Thread.sleep(2000);
    }

    public void setPassword() throws InterruptedException {
        password.sendKeys("bismillah");
        Thread.sleep(3000);

    }

    public void setClick_signin() throws InterruptedException {
        click_signin.click();
        Thread.sleep(5000);
    }

    public void setSearch_text() throws InterruptedException {
        search_text.sendKeys("cell phone");
        Thread.sleep(5000);
    }

    public void setHit_search() throws InterruptedException {
        hit_search.click();
        Thread.sleep(5000);
    }
}
