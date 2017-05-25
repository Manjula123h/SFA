Feature: Test salesForce Smoke scenario

Scenario: Test login with valid credentials
          Given Launch the Firefox and open the Salesforce Application 
          When Enter the valid user name and password
          Then User should be able to login sucessfully