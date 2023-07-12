#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@GMRProcessPractice
Feature: Export > ACS-GMR-Practice

Background: Launch the ACS application and login the application ACS_GMR_Practice
     When I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice 

 @ACS_GMR_Practice
   #Scenario Outline: To verify user able to create Direct AWB ACS_GMR_Practice
   #Then To verify user able to create Direct AWB in FF login ACS_GMR_Practice "<MAWBNo_17>"
   #Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   #Then To verify Airline login ACS_GMR_Practice "<MAWBNo_17>"
   #Then I login with "AADHYA USER" user given in "Login" sheet ACS_GMR_Practice
   #Then add 2SB details and generate single VT in CB login ACS_GMR_Practice
  # Examples:
   #|MAWBNo_17   |
   #|07072111    |
   
   #TC 13,24
   #Scenario Outline: To verify user able to create consol AWB in FF login add 1SB ACS_GMR_Practice
  # Then I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice
   #Then To verify user able to create consol AWB in FF login add 1SB ACS_GMR_Practice "<MAWBNo_13>"
   #Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   #Then To verify airline login ACS_GMR_Practice "<MAWBNo_13>"
   #Then I login with "AADHYA USER" user given in "Login" sheet ACS_GMR_Practice
   #Then and generate multiple VT in CB login or not ACS_GMR_Practice "<MAWBNo_13>"
   
   #Examples:
   #|MAWBNo_13   |
   #|11072014    |
   
   #TC 39,40,41,42,43,47
   Scenario Outline: To verify whether the user is able to  rejection of CO from airline login ACS_GMR_Practice
   #Then To verify whether the user is able to rejection of CO till TSP process from airline login ACS_GMR_Practice "<MAWBNo_39>"
   #Then I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice
   Then To verify whether the user is able to rejection of CO from airline login ACS_GMR_Practice "<MAWBNo_39>"
   Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   Then To verify rejection of airline login ACS_GMR_Practice "<MAWBNo_39>"
   Then I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice
   Then To verify whether the user is able to rejection of CO ACS_GMR_Practice "<MAWBNo_39>"
   Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   Then till TSP process from airline login ACS_GMR_Practice "<MAWBNo_39>"
   Then I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice
   Then TSP process from airline login ACS_GMR_Practice "<MAWBNo_39>"
   Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   Then To verify whether the user is able to  rejection of CO from Airline login or not for those AWB TSP already process ACS_GMR_Practice "<MAWBNo_39>"
   
   Examples:
   |MAWBNo_39   |
   |11072040    |
   
   
   