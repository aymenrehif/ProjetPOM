@Paiement
Feature: je veux acheter les produits selectionner et les payer

  Background: en tant qu utlisateur je veux acheter deux produit sur le site
    Given Naviguer url "https://automationexercise.com/"
    When Cliquer SignupLogin button
    And Saisir mail "testers83@gmail.com"
    And Saisir mot de passe "123456!"
    Then Cliquer bouton login
    And verifier l affichage de nom de compte "Test"
    Given cliquer sur bouton products
    And voir produit
    And choisir un premier produit et cliquer sur bouton add to cart
    When cliquer sur continuer Shopping
    And cliquer sur kookie kids
    And voir deuxieme produit
    And choisir un deuxieme produit et cliquer sur bouton add to cart
    Then cliquer sur bouton View cart
    And verifier les deux produits dans la liste "Men Tshirt" et "Full Sleeves Top Cherry - Pink"

  @Pay
  Scenario Outline: achat de produit
    Given cliquer sur proceed to checkout
    And cliquer sur place order
    When ecrire "<cardname>"
    And saisir "<cardnumber>"
    And saisir "<cvc>" saisir "<mois>" et "<annee>"
    And cliquer sur pay and confirm order
    Then verifier "<statut>" affiche

    Examples: 
      | cardname | cardnumber  | cvc | mois | annee | statut        |
      | test1    | 58582525254 | 258 |   05 |  2026 | ORDER PLACED! |
      | test2    | 25855225585 | 693 |   07 |  2025 | ORDER PLACED! |
