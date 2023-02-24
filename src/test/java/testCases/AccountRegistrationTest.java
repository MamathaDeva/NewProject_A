package testCases;

import PageObjects.AccountRegistrationPage;
import PageObjects.Basepage;
import PageObjects.Homepage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.Baseclass;
@Test
public class AccountRegistrationTest extends Baseclass {
    void Test_AccountRegistration() {


            Homepage hp=new Homepage(driver);
            hp.clickMyAccount();
            hp.clickRegister();

            AccountRegistrationPage regpage=new AccountRegistrationPage(driver);

            regpage.setFirstName(randomeString().toUpperCase());

            regpage.setLastName(randomeString().toUpperCase());

            regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email

            regpage.setTelephone(randomeNumber());

            String password=randomAlphaNumeric();
            regpage.setPassword(password);
            regpage.setConfirmPassword(password);

            regpage.setPrivacyPolicy();

            regpage.clickContinue();

            String confmsg=regpage.getConfirmationMsg();

            Assert.assertEquals(confmsg, "Your Account Has Been Created!");
        }

    }


