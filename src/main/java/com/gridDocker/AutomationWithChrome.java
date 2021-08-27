package com.gridDocker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AutomationWithChrome {
    
    @Test
    public void chromeTest() throws MalformedURLException {
        DesiredCapabilities dc= DesiredCapabilities.chrome();
        URL url=new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver=new RemoteWebDriver(url,dc);

        driver.get("https://google.com");
        System.out.println("Chrome Test URL Title: "+driver.getTitle());
        driver.quit();
    }

}
