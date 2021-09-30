package start;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchChrome extends BaseTest {

    @Test
    public void start() {
        Assert.assertTrue(nsePage.isContainerPresent(),"Error");
        nsePage.hoverOnElement();
        nsePage.clickOnItem();
    }

}
