import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    By clickSearchBox = By.id("com.pozitron.hepsiburada:id/etSearchBox");
    By writeProductName = By.id("com.pozitron.hepsiburada:id/etSearchBox");
    By selectProductText = By.xpath("//android.widget.TextView[@text='iphone 11']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchBox() {
        click(clickSearchBox);
    }

    public void writeProductName(String phoneName){
        write(writeProductName, phoneName);
    }
    // writeProductName('iphone 11');

    public void selectProductText() {
        click(selectProductText);
    }
}
