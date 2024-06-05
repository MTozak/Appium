import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage extends BasePage {

    By continueWithoutMembership = By.xpath("//android.widget.TextView[@text=\'Üye olmadan devam et\']");
    By writeEmail = By.xpath("//android.widget.EditText/android.widget.TextView");
    By continueButton = By.xpath("//android.widget.Button[@text=\'Devam et\']");



    public InformationPage(WebDriver driver) {

        super(driver);
    }

    public void continueWithoutMembership() {

        click(continueWithoutMembership);
    }

    public void writeEmail(String email) {

        write(writeEmail, email);
    }

    public void continueButton() {

        click(continueButton);
    }






}
