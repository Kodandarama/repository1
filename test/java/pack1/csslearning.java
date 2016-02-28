package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class csslearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='loanamount']")).sendKeys("1000");
		driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tblinput tbody tr#Tr1 td input#rate")).sendKeys("6");
		driver.findElement(By.cssSelector("#pmonths")).sendKeys("35");
		driver.findElement(By.cssSelector("input[name='Button1']")).click();
		String attribute1 = driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tbldata tbody tr td input#EMI")).getAttribute("value");
		System.out.println(attribute1);
		
	}

}
