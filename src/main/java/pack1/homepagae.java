package pack1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepagae extends basepagae {
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement Women;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement Tshirts ;
	
	
	public homepagae() {
		PageFactory.initElements(driver, this);
	}
	public WebElement Women() {
		return Women;
	}
	public WebElement Dresses() {
		Dresses.click();
	
		return Dresses;
	}
	public WebElement Tshirts() {
		return Tshirts;
	}
	
		
	
	
		
		
		
		// TODO Auto-generated method stub
		
	}
	
	
		
	



