package com.hpe.srlselenium;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by hpe on 9/12/17.
 */


public class AOS_Selenium {

    private static WebDriver driver;


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        driver = new ChromeDriver();
      //  WebDriverWait wait = new WebDriverWait(driver, 30);
    }

    @AfterClass
    public static void setUpAfterClass() throws Exception{

        driver.quit();
    }

    @Test
    public void AOS_Selenium_TC_1_Home_Page() throws Exception {


        driver.navigate().to("http://www.advantageonlineshopping.com/#/");

        driver.manage().window().maximize();


        Assert.assertTrue("Homepage Title Name", driver.getTitle().endsWith("Advantage Shopping"));

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SpeakersImg\"]/div/span")));


        //Thread.sleep(5000);

    }
    @Test
    public void AOS_Selenium_TC_2_Speakers() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"SpeakersImg\"]/div/span")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[3]/p[1]/a")));

     //   Thread.sleep(2000);

    }

  /*  @Test
    public void AOS_Selenium_TC_3_Roarmini(){

        driver.findElement(By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[3]/p[1]/a")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Description\"]/h1")));


    }
*/
}



