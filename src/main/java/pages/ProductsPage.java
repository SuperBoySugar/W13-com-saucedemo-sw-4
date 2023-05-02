package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utility.Utility;

import java.util.List;

public class ProductsPage extends Utility {

    By producTitle = By.xpath("//span[text()='Products']");
    By productList = By.xpath("//img[starts-with(@class,'inventory_item_img')]");

    // Verifying Product page title
    public void verifyProductTitle() {
        verifyText("Products", producTitle, "Product title not displayed");
    }

    // Verifying product page have 6 products
    public void verifyListOfProductsDisplayedOnPage() {
        int expectedNumberOfProducts = 6;   // Verify the 6 Products using List method
        List<WebElement> productList1 = findElementsFromWebPage(productList);
        int actualNumberOfProducts = productList1.size();
        Assert.assertEquals(expectedNumberOfProducts, actualNumberOfProducts, "Number of Products are not same");
    }
}
