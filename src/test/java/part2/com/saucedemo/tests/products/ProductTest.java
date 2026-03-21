package part2.com.saucedemo.tests.products;


import com.saucedemo.pages.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

/**
 * @author romanpz051@gmail.com on 15.03.2026.
 * @project SeleniumFreeCodeCamp
 */
public class ProductTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed() {
       ProductsPage productsPage= loginPage
                .loginIntoApplication("standard_user","secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(),
                "\n Products Header is not displayed \n");

    }

}
