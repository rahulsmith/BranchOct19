package pack1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class productpage extends basepagae{
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement txtHeader;
	
	@FindBys(@FindBy(xpath="//ul[@class='product_list grid row']/li" ))
	private List<WebElement> listproducts;
	
	public productpage () {
		PageFactory.initElements(driver, this);
	}
	public int getproductNumberFromHeader() {
		String txt=txtHeader.getText();
		String[] arr=txt.split(" ");
		String value=arr[2];
		int count=Integer.parseInt(value);
		return count;
	}
	public int getProductCount() {
		return listproducts.size();
		
	}
}
