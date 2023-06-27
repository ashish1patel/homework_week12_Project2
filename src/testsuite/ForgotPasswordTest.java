package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/*
Create the package ‘testsuite’ and create the
following classes inside the ‘testsuite’ package.
1. LoginTest
2. ForgotPasswordTest
 */
public class ForgotPasswordTest extends BaseTest {

    @Before
    public void setup() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();

        //Verify the text ‘Reset Password’
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//button[@type='submit']")).getText();
        Assert.assertEquals("", actualText, expectedText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
