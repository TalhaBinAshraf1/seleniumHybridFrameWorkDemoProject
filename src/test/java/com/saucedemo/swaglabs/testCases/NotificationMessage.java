package com.saucedemo.swaglabs.testCases;

import com.saucedemo.swaglabs.configuretion.BaseClass;
import com.saucedemo.swaglabs.pages.NotificationMessagesPage;
import com.saucedemo.swaglabs.pages.TheInternet;
import com.saucedemo.swaglabs.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessage extends BaseClass {

    @Test
    public void notificationMessage (){

        TheInternet ti = new TheInternet(driver);
        NotificationMessagesPage nmp =new NotificationMessagesPage(driver);

        ti.getNotificationMessages().click();
        sleepTest(2000);


        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.NOTIFICATION_MASSAGE_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);

        nmp.getClickHare().click();
        sleepTest(2000);

        //TC-2 flash alert test validation Page URL
        String flashAlert1 = nmp.getFlashAlert().getText();
        System.out.println(flashAlert1);
       // Assert.assertEquals(flashAlert1," Action successful");
        sleepTest(2500);

        nmp.getClickHare().click();
        sleepTest(2000);

        String flashAlert2 = nmp.getFlashAlert().getText();
        System.out.println(flashAlert2);
        sleepTest(2500);


        driver.navigate().to(Data.BASE_URL);
        sleepTest(2500);




    }

}
