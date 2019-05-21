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

    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[3]/div[2]/div[1]/div/a")
    WebElement orderprotection;


    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[2]/div/div/form/div[1]/div/div/span[1]")
    WebElement suppliers;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[1]/div[5]/ul/li[3]/a")
    WebElement TradeShow;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div/a[5]")
    WebElement tradeshow_products;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[1]/div[3]/ul/li[1]/div/div/ul[1]/li[2]/a")
    WebElement top_suppliers;
    @FindBy(xpath = "//*[@id=\"scc-category-unit-index\"]/div/ul/li[2]/a")
    WebElement apparel;
    @FindBy(xpath = "//*[@id=\"categorytree\"]/div/div/div/div[1]/div[2]/div[2]/a/div[1]")
    WebElement mensclothing;

    public void setMensclothing() {
        mensclothing.click();
    }


    public void setApparel() {
        apparel.click();
    }

    public void mouse() throws InterruptedException {

        mouseHoverByCSS("#J_SC_header > header > div.sc-hd-row.sc-hd-beacon > div.J-sc-hd-m-beaconnav.sc-hd-cell.sc-hd-hide-s.sc-hd-m-beaconnav > ul > li.J-sc-hd-ms-sourcing-solutions.sc-hd-ms-dp-trigger > span");
        top_suppliers.click();
        Thread.sleep(5000);

    }


    public void setTradeshow_products() throws InterruptedException {
        tradeshow_products.click();
        Thread.sleep(5000);
    }


    public void setTradeShow() {
        TradeShow.click();
    }

    public void setSuppliers() {
        suppliers.click();


    }

    public void setSignin() throws InterruptedException {
        signin.click();
        Thread.sleep(2000);
    }

    public void setOrderprotection() throws InterruptedException {
        orderprotection.click();
        Thread.sleep(5000);
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
