package com.gridDocker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AutomationWithOpera {
    
    @Test
    public void chromeTest() throws MalformedURLException {
        DesiredCapabilities dc= DesiredCapabilities.opera();
        URL url=new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver=new RemoteWebDriver(url,dc);

        driver.get("https://apple.com");
        System.out.println("Opera Test URL Title: "+driver.getTitle());
        driver.quit();
    }

}
