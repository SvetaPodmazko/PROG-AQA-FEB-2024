package web;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class SeleniumDemoHomeW1 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://allo.ua/");
        String expectedURLData="allo";
        String actualURLData=driver.getCurrentUrl();
        Assert.assertTrue(actualURLData.contains(expectedURLData));

        System.out.println(driver.getTitle());

        WebElement searchBox= driver.findElement(By.xpath("//*[@id='search-form__input']"));
        searchBox.sendKeys("Iphone 15"+ Keys.ENTER);
        String expectedSearchResult="Iphone 15";
        String actualSearchResult=driver.findElement(By.xpath("(//*[@class='b-crumbs__link'])[2]")).getText();
        Assert.assertTrue(actualURLData.contains(expectedURLData));
        WebElement firstSearchElement=driver.findElement(By.xpath("(//*[@title='Apple iPhone 15 Pro Max 256GB Natural Titanium (MU793)'])[2]"));
        System.out.println(firstSearchElement.getText());

    }

}
