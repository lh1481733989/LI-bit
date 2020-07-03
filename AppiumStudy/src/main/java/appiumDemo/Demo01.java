package appiumDemo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

/**
 * AppiumDemo01
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
        //添加配置，创建DesiredCapabilities对象
        DesiredCapabilities desiredCapabilities =new DesiredCapabilities();

        //指定测试设备的名称
        desiredCapabilities.setCapability("deviceName","192.178.101.88:5555");

        //添加操作系统配置
        desiredCapabilities.setCapability("platformName","Android");

        //添加操作系统版本设置
        desiredCapabilities.setCapability("platformVersion","9");

        //指定想要测试应用的包名
        desiredCapabilities.setCapability("appPackage","com.tencent.mobileqq");

        //指定想要测试应用的入口activity
        desiredCapabilities.setCapability("appActivity","com.tencent.mobileqq.activity.SplashActivity");
        //指定automationName
        desiredCapabilities.setCapability("automationName","UiAutomator1");
        //重启应用软件
        desiredCapabilities.setCapability("noReset","true");

        //创建驱动...URL是appium的固定地址；指定appium通讯的地址，将相对应的配置传入到驱动里边
        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

        //停止3s
        Thread.sleep(3000);
        System.out.println("已打开app");
        //点击：同意
        //androidDriver.findElementById("com.autonavi.minimap:id/agree").click();

        //关闭app
        androidDriver.quit();
    }
}
