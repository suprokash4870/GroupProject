package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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


    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[1]/div[4]/div/div/div/div[1]/i")
    WebElement English_usd;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div/div[2]/div/input")
    WebElement find_country;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[1]/div[4]/div/div/div/div[2]/div[2]/div/div/div[2]/ul/li[1]/ul/li[2]")
    WebElement country;

    @FindBy(xpath = "//*[@id=\"login-other\"]/div[2]/a")
    WebElement mobilenumber_signin;
    @FindBy(className = "fm-text")
    WebElement mobilenumber;
    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div/h3/i[2]")
    WebElement catagories;
    @FindBy(partialLinkText = "Fabrication Service")
    WebElement Machinary_Fabricatoinservice;


    @FindBy(linkText = "Help Center")
    WebElement Helpcenter;

    @FindBy(css = "body > div.help-center > div.grid.common-search > div.hc-searchbar > div > div > div.ui-searchbar-main > input")
    WebElement searchbar;
    @FindBy(linkText = "Furniture")
    WebElement furniture;

    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[2]/div/div/form/div[2]/input")
    WebElement childrenfurniture;

    public void setChildrenfurniture() throws InterruptedException {
        childrenfurniture.sendKeys("baby furnitures");

        Thread.sleep(3000);
    }

    public void setFurniture() throws InterruptedException {
        furniture.click();
        Thread.sleep(2000);
    }


    @FindBy(linkText = "About Alibaba.com")
    WebElement aboutalibaba_com;
    @FindBy(xpath = "//*[@id=\"header2012\"]/div[2]/div/div[6]/a/i/b")
    WebElement mouseover1;


//In this method we used Actions class for drag and drop element.
    //by help of clickandHold , moveToElement, release methods.
    //build call the actions class and perform does the result of storage elments in Webelement.
    @FindBy(xpath = "//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")
    WebElement drag_drop;
    @FindBy(id = "draggable")
    WebElement draggable;
    @FindBy(id = "droppable")
    WebElement droppable;

    public void setDrag_drop() throws InterruptedException {    //   "http://jqueryui.com/");
        drag_drop.click();
        Thread.sleep(5000);
        driver.switchTo().frame(0);
       Actions actions = new Actions(driver);
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

       Thread.sleep(5000);

    }




    public void setMouseover1() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseover1);
        Thread.sleep(3000);

    }

    public void setAboutalibaba_com() throws InterruptedException {
        aboutalibaba_com.click();
        Thread.sleep(3000);
    }


    WebElement click_accountlink;

    public void setClick_accountlink() throws InterruptedException {
        click_accountlink.click();
        Thread.sleep(3000);
    }


    public void setHelpcenter() throws InterruptedException {
        Helpcenter.click();
        Thread.sleep(2000);
    }

    public void setMachinary_Fabricatoinservice() throws InterruptedException {
        Machinary_Fabricatoinservice.click();
        Thread.sleep(3000);
    }

    public void setCatagories() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(catagories).build().perform();
        Thread.sleep(5000);

    }

    public void setMobilenumber() throws InterruptedException {
        mobilenumber.sendKeys("1234567890");
        Thread.sleep(3000);
    }

    public void setMobilenumber_signin() throws InterruptedException {
        mobilenumber_signin.click();
        Thread.sleep(5000);

    }

    public void setMensclothing() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mensclothing).build().perform();
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
