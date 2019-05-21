package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.By;
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

    @Test(priority = 1, enabled = false)
    public void test() {
        String str = driver.getTitle();
        System.out.println(str);
    }

    @Test(priority = 2, enabled = false)
    public void test2() throws InterruptedException {
        homePage.setSignin();
        homePage.setAccount();
        homePage.setPassword();
        //homePage.setClick_signin();

    }

    @Test(priority = 3, enabled = false)
    public void current_url() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test(priority = 4, enabled = false)
    public void clcik_on_Search() throws InterruptedException {
        homePage.setSearch_text();
        homePage.setHit_search();
    }

    @Test(priority = 5, enabled = false)
    public void clickorder_protection() throws InterruptedException {
        homePage.setOrderprotection();

    }

    @Test(priority = 6, enabled = false)
    public void click_supliers() throws InterruptedException {
        homePage.setSuppliers();
        Thread.sleep(3000);
    }

    @Test(priority = 7, enabled = false)
    public void click_tradeshow() throws InterruptedException {
        homePage.setTradeShow();

        Thread.sleep(2000);
    }

    @Test(priority = 8, enabled = false)
    public void sourchig_solution() throws InterruptedException {
        homePage.mouse();
        Thread.sleep(5000);

    }

    @Test(priority = 9, enabled = false)
    public void click_apparel() throws InterruptedException {
        homePage.setApparel();
        Thread.sleep(3000);
        // homePage.setMensclothing();

    }



    @Test(priority =10,enabled = false)
    public void readyto_ship() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[1]/div[5]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[2]/div/div/form/div[2]/input")).sendKeys("cellphones");
        Thread.sleep(3000);
    }
    @Test
    public void vehicles_accessories() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        driver.findElement(By.xpath("//*[@id=\"scc-category-unit-index\"]/div/ul/li[3]/a")).click();
        Thread.sleep(3000);
        mouseHoverByCSS("body > div.ocms-container > div > div > div.ch-main-layout.column-two > div.ch-left-layout > div > div > div > div > div > div.category-menu-wrapper > div.menu > div:nth-child(1) > a > div.category-menu-link");
        Thread.sleep(3000);
    }
}


