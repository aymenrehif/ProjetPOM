package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePaiement {

	public WebDriver driver;
	//constructeur
	public PagePaiement (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//identification des elements
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-default check_out']")
	public WebElement proceed_checkout;
    @FindBy(how=How.XPATH,using="//a[@href='/payment']")
    public WebElement place_order;
	@FindBy(how=How.XPATH,using="//input[@name='name_on_card']")
	public WebElement card_name;
	
	@FindBy(how=How.XPATH,using="//input[@name='card_number']")
	public WebElement card_number;
	@FindBy(how=How.XPATH,using="//input[@placeholder='ex. 311']")
	public WebElement codecvc;
    @FindBy(how=How.XPATH,using="//input[@placeholder='MM']")
    public WebElement month;
    @FindBy(how=How.XPATH,using="//input[@placeholder='YYYY']")
    public WebElement year;
    @FindBy(how=How.XPATH,using="//button[@class='form-control btn btn-primary submit-button']")
    public WebElement pay_order;
    @FindBy(how=How.XPATH,using="//h2[@data-qa='order-placed']")
    public WebElement txt_affiche;
	
	//creation des methodes (design pattern)
    
    public void proceedcheckout() {
    	proceed_checkout.click();
    }
	public void placeorder() {
		place_order.click();
	}
	public void ecrirename(String name ) {
		card_name.sendKeys(name);;
	}
	
	public void saisircardnumber(String cardnumber ) {
		card_number.sendKeys(cardnumber);
	}
	public void saisircvc(String cvc ) {
		codecvc.sendKeys(cvc);
	}
	public void saisirmois(String mois ) {
		month.sendKeys(mois);
	}
	public void saisirannee(String annee ) {
		year.sendKeys(annee);
	}
	
	public void payement() {
		pay_order.click();
	}
	public String Txtaffiche() {
		String txtobtenu = txt_affiche.getText();
		return txtobtenu;
	}
	
}
