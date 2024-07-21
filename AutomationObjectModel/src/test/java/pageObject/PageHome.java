package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageHome {

	
	public  WebDriver driver;
	
	//creation de constructeur
	public PageHome (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//identification des elements ( design pattern )
	@FindBy(how=How.XPATH,using="//a[text()=' Signup / Login']")
	public WebElement bt_signupLogin;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='signup-name']")
	public WebElement name;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='signup-email']")
	public WebElement email;
	
	@FindBy(how=How.XPATH,using="//button[@data-qa='signup-button']")
	public WebElement signup_bt;
	
	@FindBy(how=How.ID,using="id_gender1")
	public WebElement mr_check;
	@FindBy(how=How.ID,using="id_gender2")
	public WebElement mme_check;
	@FindBy(how=How.ID,using="password")
	public WebElement pwd;
	@FindBy(how=How.ID,using="days")
	public WebElement  day;
	//
	@FindBy(how=How.ID,using="months")
	public WebElement month;
	//
	@FindBy(how=How.ID,using="years")
	public WebElement year;
	//
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	public List<WebElement>check;
	@FindBy(how=How.ID,using="first_name")
	public WebElement firstname;
	@FindBy(how=How.ID,using="last_name")
	public WebElement lastname;
	@FindBy(how=How.ID,using="company")
	public WebElement company;
	@FindBy(how=How.ID,using="address1")
	public WebElement adress1;
	@FindBy(how=How.ID,using="country")
	public WebElement country;

	@FindBy(how=How.ID,using="state")
	public WebElement state;
	@FindBy(how=How.ID,using="city")
	public WebElement city;
	@FindBy(how=How.ID,using="zipcode")
	public WebElement zipcode;
	@FindBy(how=How.ID,using="mobile_number")
	public WebElement mobile;
	@FindBy(how=How.XPATH,using="//button[@data-qa='create-account']")
	public WebElement create;
	@FindBy(how=How.XPATH,using ="//input[@data-qa='login-email']")
	public WebElement connectmail;
	@FindBy(how=How.XPATH,using ="//input[@placeholder='Password']")
	public WebElement connectpwd;
	@FindBy(how=How.XPATH,using ="//button[@data-qa='login-button']")
	public WebElement connect_bt;
	@FindBy(how=How.XPATH,using="//b(text()='Account Created!']")
	public WebElement txtComptCreer;
	@FindBy(how=How.XPATH,using="//b[text()='Test']")
	WebElement profilauto;
	// creation des methodes
	public void GetUrl(String url) {
		driver.get(url);
	}
	
	public void cliquersignlogin() {
		bt_signupLogin.click();
	}
	public void entrerName(String Name) {
		name.sendKeys(Name);
	}
	public void taperEmailAddress(String Email) {
		email.sendKeys(Email);
	}
	public void cliquerSignup() {
		signup_bt.click();
	}
	public void cocherGenre(String string) {
		if(string.equals("Mr")) {
			
			mr_check.click();
			}
			else {
				
				mme_check.click();	
				
			}
	}
	public void saisirPassword (String string) {
		pwd.sendKeys(string);
	}
	public void selectionnerBirthDay(String jour, String mois, String annee) {
		Select liste_day = new Select(day);
		liste_day.selectByValue(jour);
		Select liste_month = new Select(month);
		liste_month.selectByValue(mois);
		Select liste_year = new Select(year);
		liste_year.selectByValue(annee);
	}
	public void cocherOptions()  {
		check.get(1).click();	
		check.get(0).click();
	}
	public void saisirFirstname(String prenom) {
		firstname.sendKeys(prenom);
	}
	public void saisirLastname(String Nomf) {
		lastname.sendKeys(Nomf);
	}
	public void saisirAdress(String adresse) {
		adress1.sendKeys(adresse);
	}
	public void saisirCompany(String cie) {
		company.sendKeys(cie);
	}
	public void saisirCountry(String pays) {
		Select liste_country = new Select(country);
		liste_country.selectByValue(pays);
	}
	public void saisirState(String gov) {
		state.sendKeys(gov);
	}	
	public void saisirCity(String cite) {
		city.sendKeys(cite);
	}
	public void saisirZipcode(String code) {	
	zipcode.sendKeys(code);
	}	
	public void saisirMobile(String tel) {
	mobile.sendKeys(tel);
	}
	public void createAccount() {
		create.click();
	}
	public String txtaffiche() {
		String txt_obtenu = txtComptCreer.getText();
		return txt_obtenu;
	}
	
	public void mailconnect (String Cmail) {
		connectmail.sendKeys(Cmail);
	}
	public void mdpconnect (String Cmdp) {
		connectpwd.sendKeys(Cmdp);
	}
	public void logbt() {
		connect_bt.click();
	}
	public  String profilaff() {
		String profil_obtenu = profilauto.getText();
		return profil_obtenu;
	}
	
	
}