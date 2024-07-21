
@Produit
Feature: achat produit
Background: en tant qu utlisateur je veux acheter deux produit sur le site
 Given Naviguer url "https://automationexercise.com/"
    When Cliquer SignupLogin button
    And Saisir mail "testers83@gmail.com"
    And Saisir mot de passe "123456!"
    Then Cliquer bouton login
    And verifier l affichage de nom de compte "Test"
    
  @AjoutProduit
  Scenario: ajout produit
    Given cliquer sur bouton products
    And voir produit
    And choisir un premier produit et cliquer sur bouton add to cart
    When cliquer sur continuer Shopping
    And cliquer sur kookie kids
    And voir deuxieme produit
    And choisir un deuxieme produit et cliquer sur bouton add to cart
    Then cliquer sur bouton View cart
    And verifier les deux produits dans la liste "Men Tshirt" et "Full Sleeves Top Cherry - Pink"

 