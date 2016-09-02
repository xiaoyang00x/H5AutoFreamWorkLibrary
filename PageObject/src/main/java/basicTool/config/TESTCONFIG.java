package basicTool.config;

import java.util.ArrayList;
import java.util.List;

/**
 * The enum class is to assign values to the test_config file.
 * 
 * @author yangyu
 *
 */
public enum TESTCONFIG {
    // Common
    DEVICETYPE("deviceType"),
    TESTNAME("testName"),
    // ******PC******
    ISROMOTEFRIVER("isRemoteDriver"),
    REMOTEDRIVERURL("remoteDriverURL"),
    BROSWERTYPE("broswerType"),
    CHROMEDRIVERPATH("chromeDriverPath"),
    INTERNETEXPLORERDRIVERPATH("internetExplorerDriverPath"),
    SAFARIVERSION("safariVersion"),
    DEFAULTURL("defaultURL"),
    PAYMENTURL("paymentURL"),
    // ******Phone*******
    SWIPETIMES("swipeTimes"),
    PHONEPLATFORM("phonePlatform"),
    DEVICENAME("deviceName"),
    APPLACTIONLOCATION("applactionLocation"),
    APPIUMDRIVERURL("appiumDriverURL");

    String value;

    TESTCONFIG(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static List<String> getAllEnumValue() {
        List<String> values = new ArrayList<>();
        for (TESTCONFIG value : TESTCONFIG.values())
            values.add(value.getValue());
        return values;
    }

}
