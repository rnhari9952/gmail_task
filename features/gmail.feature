@gmail 
Feature: Compose and send email in Gmail 

Scenario: Sending an email with specific body and subject 
	Given I am logged into my Gmail account 
	When I click on the Compose button 
	And I fill in the recipient email, subject, and body 
	And I click on the Send button 
	Then the email with subject "Incubyte" and body "Automation QA test for Incubyte" is sent successfully 
