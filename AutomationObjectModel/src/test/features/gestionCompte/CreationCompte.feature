@Compte_Automation
Feature: CompteAutoEx
  en tant que utilisateur, je veux créer un compte Automation Exercices

  @Creation_compte
  Scenario: nouveau compte 
    Given Naviguer url "https://automationexercise.com/"
    When Cliquer SignupLogin button 
    And Entrer name "Test" et taper email address "testers83@gmail.com"
		And Cliquer Signup button
    And cocher le genre "Mr" et saisir le pwd "123456!"
    And selectionner la date "3" , le mois "9" , l annee "1995" de naissance
    And cocher les options
    And saisir firstname "tester" et saisir lastname "testers"
    And saisir company "testers cie" et saisir adress "1 av de charles aznavour" et selectionner country "India"
    And saisir state "Tunis" city "Tunis" et saisir Zip code "2040"
    And saisir mobile "20154879"
    And cliquer sur create 
    Then verifier que le message "ACCOUNT CREATED!" est affiche