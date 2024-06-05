import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;



public class MainTest extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    InformationPage informationPage;
    AddressPage addressPage;
    CardPage cardPage;


    @Test
    @Order(1)
    public void searchProduct() throws InterruptedException{
        homePage = new HomePage(driver);

        homePage.clickSearchBox();
        homePage.writeProductName("iphone 11");
        homePage.selectProductText();
    }

    @Test
    @Order(2)
    public void selectProduct() throws InterruptedException{
        productsPage = new ProductsPage(driver);

        productsPage.selectProduct(0);
    }

    @Test
    @Order(3)
    public void addProductToCart() throws InterruptedException{
        productDetailPage = new ProductDetailPage(driver);

        productDetailPage.addToCart();
        productDetailPage.goToCart();
    }

    @Test
    @Order(4)
    public void goToCart() throws InterruptedException{
        cartPage = new CartPage(driver);

        cartPage.increaseCount();
        cartPage.finish();
    }

    @Test
    @Order(5)
    public void continueWithoutMembership() throws InterruptedException{
        informationPage = new InformationPage(driver);

        informationPage.continueWithoutMembership();
        informationPage.writeEmail("test6@v.co");
        informationPage.continueButton();
    }

    @Test
    @Order(6)
    public void finishShopping() throws InterruptedException{
        cartPage = new CartPage(driver);

        cartPage.finish2();
    }

    @Test
    @Order(7)
    public void addAddress() throws InterruptedException{
        addressPage = new AddressPage(driver);

        addressPage.addAddress();
        addressPage.clickName();
        addressPage.writeName("test");
        addressPage.clickSurname();
        addressPage.writeSurname("test1");
        addressPage.clickPhone();
        addressPage.writePhone("5325529661");
        addressPage.clickHome();
        addressPage.clickCity();
        addressPage.selectCity();
        addressPage.clickTown();
        addressPage.selectTown();
        addressPage.clickNeighbourhood();
        addressPage.selectNeighbourhood();
        addressPage.addressBox();
        addressPage.writeAddress("iQuality mah. Edirne cad. No:22 Daire:3");
        addressPage.addressName();
        addressPage.writeAddressName("Ev");
        addressPage.selectBill();
        addressPage.clickIdentity();
        addressPage.writeIdentity("57499229894");
        addressPage.saveAddress();
    }

    @Test
    @Order(8)
    public void addCard() throws InterruptedException{
        cardPage = new CardPage(driver);

        cardPage.cardInformation();
        cardPage.clickCardNumber();
        cardPage.writeCardNumber("4355084355084358");
        cardPage.clickCardYear();
        cardPage.writeCardYear("1226");
        cardPage.clickCvv();
        cardPage.writeCvv("000");
        cardPage.clickNameSurname();
        cardPage.writeNameSurname("Test Test1");
        cardPage.clickContinueButton();
    }





}
