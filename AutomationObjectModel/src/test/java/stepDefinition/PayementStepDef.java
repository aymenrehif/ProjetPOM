package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;
import pageObject.PagePaiement;

public class PayementStepDef {

	
	WebDriver driver =SetUp.driver;
	PagePaiement pay = new PagePaiement(driver);
	
	@Given("cliquer sur proceed to checkout")
	public void cliquer_sur_proceed_to_checkout() {
	    pay.proceedcheckout();
	}

	@Given("cliquer sur place order")
	public void cliquer_sur_place_order() {
	  pay.placeorder();
	}

	@When("ecrire {string}")
	public void ecrire(String string) {
		pay.ecrirename(string);
	}

	@When("saisir {string}")
	public void saisir(String int1) {
		pay.saisircardnumber(int1);
	}

	@When("saisir {string} saisir {string} et {string}")
	public void saisir_saisir_et(String string, String string2, String string3) {
	  pay.saisircvc(string);
	  pay.saisirmois(string2);
	  pay.saisirannee(string3);
	}

	@When("cliquer sur pay and confirm order")
	public void cliquer_sur_pay_and_confirm_order() {
		pay.payement();
	}

	@Then("verifier {string} affiche")
	public void verifier_affiche(String string)  {
Assert.assertEquals(string, pay.Txtaffiche());
	}

	

	   


	
	

	
	
}
