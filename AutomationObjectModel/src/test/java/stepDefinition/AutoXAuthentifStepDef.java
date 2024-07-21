package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;
import pageObject.PageHome;

public class AutoXAuthentifStepDef {

	
	WebDriver driver=SetUp.driver;
	PageHome home= new PageHome(driver);
	
	@When("Saisir mail {string}")
	public void saisir_mail(String string) {
	   home.mailconnect(string);
	}

	@When("Saisir mot de passe {string}")
	public void saisir_mot_de_passe(String string) {
	    home.mdpconnect(string);
	}

	@Then("Cliquer bouton login")
	public void cliquer_bouton_login() {
	   home.logbt();
	}
	@Then("verifier l affichage de nom de compte {string}")
	public void verifier_l_affichage_de_nom_de_compte(String string) {
		Assert.assertEquals(string, home.profilaff());
	}

}
