package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageProduit {

	
	public WebDriver driver;
	
	//constructeur
	public PageProduit (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//identification des elements (design pattern)
	@FindBy(how=How.XPATH,using="//a[@href='/products']")
	public WebElement produit;
	@FindBy(how=How.XPATH,using="//a[text()='View Product']")
	public List<WebElement>viewpr;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default cart']")
	public WebElement addtocart;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-success close-modal btn-block']")
	public WebElement continue_shopping;
	@FindBy(how=How.XPATH,using="//a[@href='/brand_products/Kookie Kids']")
	public WebElement kookie_kids;
	@FindBy(how=How.XPATH,using="//a[text()='View Product']")
	public List<WebElement>viewpr2;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default cart']")
	public WebElement addtocart2;
	@FindBy(how=How.XPATH,using="//u[text()='View Cart']")
	public WebElement view_cart;
	@FindBy(how=How.XPATH,using="//a[@href='/product_details/2']")
	public WebElement cart_info;
	@FindBy(how=How.XPATH,using="//a[@href='/product_details/14']")
	public WebElement cart_info2;
	
	
	//creation des methodes
	
	public void clicproduct() {
		produit.click();
	}
	public void voirproduit() {
		viewpr.get(1).click();
	}
	public void firstproduct() {
		addtocart.click();
	}
	public void shopping() {
		continue_shopping.click();
	}
	public void kids() {
		kookie_kids.click();
	}
	public void voirproduit2() {
		viewpr2.get(0).click();
	}
	public void secondproduct() {
		addtocart2.click();
	}
	public void cart() {
		view_cart.click();
	}
	public String FirstProdafficher() {
		String produit_obtenu = cart_info.getText();
		return produit_obtenu;
	}
	
	public String SecondProdafficher() {
		String produit_obtenu = cart_info2.getText();
		return produit_obtenu;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
