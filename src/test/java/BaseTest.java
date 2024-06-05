import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.TestInstance;
import org.junit.jupiter.api.MethodOrderer;

import java.net.MalformedURLException;
import java.net.URL;




@TestInstance(TestInstance.Lifecycle.PERCLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotaiton.class)

public class BaseTest  {

    protected static AndroidDriver<AndroidElement> driver;

    @BeforeAll
    public static void setUp () throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 8 Pro API 29");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\iquality\\IdeaProjects\\AppiumDersleri\\Apps\\Hepsiburada.apk");

        //Appium sunucusuna bağlanma URL'sini oluşturma

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
    }
}
