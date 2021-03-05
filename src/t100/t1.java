package t100;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class t1 {


public static WebDriver driver;
  @Parameters({"Browser","url"})
    @BeforeClass
void start(String Browser){
      if (Browser.equalsIgnoreCase("Chrome"))
      {
    System.getProperty("webdriver.chrome.driver","C:\\Users\\CATASTROS\\IdeaProjects\\test\\src\\t100\\chromedriver.exe");
    driver=new ChromeDriver();}else
        if (Browser.equalsIgnoreCase("Firefox")){
            System.getProperty("webdriver.gecko.driver","C:\\Users\\CATASTROS\\IdeaProjects\\test\\src\\t100\\chromedriver.exe");
            driver=new ChromeDriver();
        }


}
    @BeforeMethod
    void URL(String url){
driver.get(url);
    }

  @Test
        void tc2(){

        }
    @AfterMethod
   void JDBCQuit(){
System.out.println("After Method");
    }

    @AfterClass
    void quit(){
driver.quit();
    }
}
