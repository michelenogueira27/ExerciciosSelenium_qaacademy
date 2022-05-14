import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsSelenium {
    WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/minoguei/OneDrive%20-%20Capgemini/Documents/Alerts.html");

    }

    @Test
    public void alertaComCaixaDeTexto() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert alert = driver.switchTo().alert();

        alert.sendKeys("QA ninja quer roubar a marca QA Academy");
        Thread.sleep(5000);
        alert.accept();
    }

    @After
    public void after() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }
}
