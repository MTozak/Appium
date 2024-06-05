import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By addToCartButtonLocator = By.xpath("//android.view.ViewGroup[@resource-id=\"com.pozitron.hepsiburada:id/content_wrapper\"]/android.widget.LinearLayout");
    By goToCartButtonLocator = By.id("com.pozitron.hepsiburada:id/goBasketTxt");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }

    public void goToCart() {
        click(goToCartButtonLocator);
    }
}
