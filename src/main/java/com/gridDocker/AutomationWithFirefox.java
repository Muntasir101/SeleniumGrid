package com.gridDocker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AutomationWithFirefox {

    @Test
    public void chromeTest() throws MalformedURLException {
        DesiredCapabilities dc= DesiredCapabilities.firefox();
        URL url=new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver=new RemoteWebDriver(url,dc);

        driver.get("https://bbc.com");
        System.out.println("Firefox Test URL Title: "+driver.getTitle());
        driver.quit();
    }
}
