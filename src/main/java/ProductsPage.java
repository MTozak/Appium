import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By productsOptions = By.xpath("//android.widget.TextView[@text='Kapasite']");
    By selectProduct = By.xpath("(//android.view.ViewGroup[@resource-id=\"com.pozitron.hepsiburada:id/clProductBoxBottom\"])");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(productsOptions);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(selectProduct);
    }
}


