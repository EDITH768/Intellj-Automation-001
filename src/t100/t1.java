package t100;

import org.testng.annotations.*;

public class t1 {

  @Parameters
    @BeforeClass
void start(){
    System.getProperty("webdriver.chrome.driver","C:\\Users\\CATASTROS\\IdeaProjects\\test\\src\\t100\\chromedriver.exe");
}
    @BeforeMethod
    void JDBC(){

    }

  @Test
        void tc2(){

        }
    @AfterMethod
   void JDBCQuit(){

    }

    @AfterClass
    void quit(){

    }
}
