package com.parabank.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase()
    {
        try {

            prop = new Properties();
            FileInputStream fip = new FileInputStream("src/config.properties");
            prop.load(fip);
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void initializeBrowser()
    {
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src/main/java/com/parabank/executables/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("FF")) {

            System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\IdeaProjects\\Para_Bank_Testing\\src\\main\\java\\com\\parabank\\executables\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }
}
