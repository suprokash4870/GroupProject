package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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

    @Test(priority = 2,enabled = false)
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

    @Test(priority = 4,enabled = false)
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


    @Test(priority = 10, enabled = false)
    public void readyto_ship() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[1]/div[5]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[2]/div/div/form/div[2]/input")).sendKeys("cellphones");
        Thread.sleep(3000);
    }

    @Test(priority = 11, enabled = false)
    public void vehicles_accessories() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        driver.findElement(By.xpath("//*[@id=\"scc-category-unit-index\"]/div/ul/li[3]/a")).click();
        Thread.sleep(3000);

    }

    @Test(priority = 12, enabled = false)
    public void getthe_app() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.name("SearchText")).sendKeys("tarenare");
        Thread.sleep(3000);
    }

    @Test(priority = 13, enabled = false)
    public void catagories() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("/html/body"))).build().perform();
        Thread.sleep(3000);


    }

    @Test(priority = 14, enabled = false)
    public void service$member() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[1]/div[3]/ul/li[2]/span"))).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 15, enabled = false)
    public void search() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        driver.findElement(By.className("ui-searchbar-keyword")).sendKeys("cellphones");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[2]/div/div[1]/form/i[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[2]/div/div/form/div[2]/div[3]/div[1]/div/div/div[1]/div[1]")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 16, enabled = false)
    public void help_community() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[1]/div[3]/ul/li[3]/span"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[1]/div[3]/ul/li[3]/div/div[1]/ul[1]/li[2]/a")).click();
        Thread.sleep(3000);

    }

    @Test(priority = 17,enabled = false)
    public void english() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[1]/div[4]/div/div/div/div[1]/label"))).build().perform();
        Thread.sleep(3000);

    }
    @Test(priority = 18,enabled = false)
    public void kjshgkjl(){
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        driver.findElement(By.xpath("/html/body")).click();
    }
    @Test(priority = 19,enabled = false)
    public void catagories_mouseover() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        driver.findElement(By.xpath("//*[@id=\"scc-category-unit-index\"]/div/ul/li[1]/a")).click();
        Thread.sleep(3000);
    }
    @Test(priority = 20,enabled = false)
    public void sourching_solution_mouse() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[1]/div[3]/ul/li[1]/span"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body")).click();
        Thread.sleep(3000);
    }
    @Test(priority = 21,enabled = false)
    public void select_class() throws InterruptedException {
        getLocalDriver("chrome", "mac");
        driver.get("https://www.alibaba.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[1]/div[4]/div/div/div/div[1]/label"))).build().perform();
        Thread.sleep(3000);
        Select select=new Select(driver.findElement(By.cssSelector("/body")));
        select.deselectByVisibleText("China");
        Thread.sleep(3000);
    }


}

