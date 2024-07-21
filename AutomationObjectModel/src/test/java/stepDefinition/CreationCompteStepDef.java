package stepDefinition;

import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObject.PageHome;


public class CreationCompteStepDef {
	
     WebDriver driver = SetUp.driver;
     PageHome home = new PageHome(driver);
	
    @Given("Naviguer url {string}")
     public void naviguer_url(String string) {
	    home.GetUrl(string);
	}

	@When("Cliquer SignupLogin button")
	public void cliquer_signup_login_button() {
	  home.cliquersignlogin();
	}

	@When("Entrer name {string} et taper email address {string}")
	public void entrer_name_et_taper_email_address(String string, String string2) {
	  home.entrerName(string);
	  home.taperEmailAddress(string2);
	}

	@When("Cliquer Signup button")
	public void cliquer_signup_button() {
	    home.cliquerSignup();
	}

	@When("cocher le genre {string} et saisir le pwd {string}")
	public void cocher_le_genre_et_saisir_le_pwd(String string, String string2) {
	   home.cocherGenre(string);
	   home.saisirPassword(string2);
	}

	@When("selectionner la date {string} , le mois {string} , l annee {string} de naissance")
	public void selectionner_la_date_le_mois_l_annee_de_naissance(String string, String string2, String string3) {
	   home.selectionnerBirthDay(string, string2, string3);
	}

	@When("cocher les options")
	public void cocher_les_options() {
	    home.cocherOptions();
	}

	@When("saisir firstname {string} et saisir lastname {string}")
	public void saisir_firstname_et_saisir_lastname(String string, String string2) {
	   home.saisirFirstname(string);
	   home.saisirLastname(string2);
	}
	@When("saisir company {string} et saisir adress {string} et selectionner country {string}")
	public void saisir_company_et_saisir_adress_et_selectionner_country(String string, String string2, String string3) {
	   home.saisirCompany(string);
	   home.saisirAdress(string2);
	   home.saisirCountry(string3);
	   
	}

	@When("saisir state {string} city {string} et saisir Zip code {string}")
	public void saisir_state_city_et_saisir_zip_code(String string, String string2, String string3) {
	    home.saisirCity(string2);
	    home.saisirZipcode(string3);
	    home.saisirState(string);
	}

	@When("saisir mobile {string}")
	public void saisir_mobile(String string) {
	   home.saisirMobile(string);
	}

	@When("cliquer sur create")
	public void cliquer_sur_create() {
	    home.createAccount();
	}

	@SuppressWarnings("deprecation")
	@Then("verifier que le message {string} est affiche")
	public void verifier_que_le_message_est_affiche(String string) {
	    Assert.assertEquals(string, home.txtaffiche());
	}

}
