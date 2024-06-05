import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage extends BasePage{

    By addAddress = By.xpath("//android.widget.TextView[@text=\'Yeni adres ekle\']");

    By clickName = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText");

    By writeName = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText");

    By clickSurname = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText");

    By writeSurname = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText");

    By clickPhone = By.xpath("//android.widget.EditText[@text=\'+90\']");

    By writePhone = By.xpath("//android.widget.EditText[@text=\'+90\']");

    By clickHome = By.xpath("//android.widget.RadioButton[@text=\'Ev\']");

    By clickCity = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View");

    By selectCity = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View");

    By clickTown = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View");

    By selectTown = By.xpath("//android.widget.TextView[@text=\'ATAŞEHİR\']");

    By clickNeighbourhood = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View");

    By selectNeighbourhood = By.xpath("//android.widget.TextView[@text=\'MUSTAFA KEMAL\']");

    By addressBox = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[1]/android.widget.EditText");

    By writeAddress = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[1]/android.widget.EditText");

    By addressName = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.widget.EditText");

    By writeAddressName = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.widget.EditText");

    By selectBill = By.xpath("//android.widget.CheckBox");

    By clickIdentity = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View/android.widget.EditText");

    By writeIdentity = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View/android.widget.EditText");

    By saveAddress = By.xpath("//android.view.ViewGroup[@resource-id=\'com.pozitron.hepsiburada:id/content_wrapper\']/android.widget.LinearLayout");

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public void addAddress() {

        click(addAddress);
    }

    public void clickName() {

        click(clickName);
    }

    public void writeName(String name) {

        write(writeName, name);
    }

    public void clickSurname() {

        click(clickSurname);
    }

    public void writeSurname(String surname) {

        write(writeSurname, surname);
    }
    public void clickPhone() {
        click(clickPhone);
    }
    public void writePhone(String phone) {
        write(writePhone, phone);

    }

    public void clickHome() {
        click(clickHome);
    }

    public void clickCity() {
        click(clickCity);
    }

    public void selectCity() {
        click(selectCity);
    }


    public void clickTown() {
        click(clickTown);
    }

    public void selectTown() {
        click(selectTown);
    }

    public void clickNeighbourhood() {
        click(clickNeighbourhood);
    }

    public void selectNeighbourhood() {
        click(selectNeighbourhood);
    }


    public void addressBox() {
        click(addressBox);
    }

    public void writeAddress(String address) {
        write(writeAddress, address);

    }

    public void addressName() {
        click(addressName);
    }

    public void writeAddressName(String addressName) {
        write(writeAddressName, addressName);

    }

    public void selectBill() {
        click(selectBill);
    }

    public void clickIdentity() {
        click(clickIdentity);
    }

    public void writeIdentity(String identity) {
        write(writeIdentity, identity);

    }

    public void saveAddress() {
        click(saveAddress);
    }


}
