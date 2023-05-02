package testsuite;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import testbase.BaseTest;

public class LoginTest extends BaseTest {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        // Enter username
        homePage.enterUserName("standard_user");
        // Enter Password
        homePage.enterPassword("secret_sauce");
        // Click on Login Button
        homePage.clickOnLoginButton();
        // Verify Product page title 'Products'
        productsPage.verifyProductTitle();
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        // Enter Username
        homePage.enterUserName("standard_user");
        // Enter Password
        homePage.enterPassword("secret_sauce");
        // Click on Login button
        homePage.clickOnLoginButton();
        // Verify number of products displayed on Product page
        productsPage.verifyListOfProductsDisplayedOnPage();
    }
}
