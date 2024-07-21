package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;
import pageObject.PageProduit;

public class AddProductStepDef {

	WebDriver driver = SetUp.driver;
	PageProduit Product = new PageProduit (driver);
	
	
	
	@Given("cliquer sur bouton products")
	public void cliquer_sur_bouton_products() {
	    Product.clicproduct();
	}
	@Given("voir produit")
	public void voir_produit() {
	    Product.voirproduit();
	}
	@Given("choisir un premier produit et cliquer sur bouton add to cart")
	public void choisir_un_premier_produit_et_cliquer_sur_bouton_add_to_cart() {
		Product.firstproduct();
	}

	@When("cliquer sur continuer Shopping")
	public void cliquer_sur_continuer_shopping() {
		Product.shopping();
	}

	@When("cliquer sur kookie kids")
	public void cliquer_sur_kookie_kids() {
		Product.kids();
	}
	@When("voir deuxieme produit")
	public void voir_deuxieme_produit() {
	    Product.voirproduit2();
	}

	@When("choisir un deuxieme produit et cliquer sur bouton add to cart")
	public void choisir_un_deuxieme_produit_et_cliquer_sur_bouton_add_to_cart() {
		Product.secondproduct();
	}

	@Then("cliquer sur bouton View cart")
	public void cliquer_sur_bouton_view_cart() {
		Product.cart();
	}

	@Then("verifier les deux produits dans la liste {string} et {string}")
	public void verifier_les_deux_produits_dans_la_liste_et(String string, String string2) {
	    
	Assert.assertEquals(string, Product.FirstProdafficher());
	Assert.assertEquals(string2, Product.SecondProdafficher());
	}
}
