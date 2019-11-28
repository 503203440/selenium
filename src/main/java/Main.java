import org.openqa.selenium.*;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\selenium\\src\\main\\resources\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\selenium\\src\\main\\resources\\geckodriver.exe");

//        WebDriver webDriver = new ChromeDriver();
        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("https://cmcoins.boc.cn/BOC15_CoinSeller/welcome.html");

//        webDriver.manage().window().maximize(); //设置浏览器窗口最大化

        //获取当前浏览器的信息
        System.out.println("Title:" + webDriver.getTitle());
        System.out.println("currentUrl:" + webDriver.getCurrentUrl());

        //执行js脚本
//        String jString = "alert('122')";
//        ((JavascriptExecutor) webDriver).executeScript(jString);

        //线程休眠一秒钟，等待弹出层
        Thread.sleep(2000);

        //定位层级元素，并点击关闭
        webDriver.findElement(By.cssSelector("#btn_Confirm > .btn-r")).click();


        //向输入框中写入内容
        webDriver.findElement(By.cssSelector("#txt_name_1956714")).sendKeys("小明");

        webDriver.findElement(By.cssSelector("#txt_mobile_1956715")).sendKeys("17671682560");

        webDriver.findElement(By.cssSelector("#txt_identitynumber_1956717")).sendKeys("421122199310033515");

        //点击下一步
        webDriver.findElement(By.cssSelector("#btn_nextstep_1956722 > .btn-r")).click();

    }


}
