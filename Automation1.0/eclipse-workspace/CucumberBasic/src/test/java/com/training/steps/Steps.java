package com.training.steps;


import java.io.IOException;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pagefactory.PageFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps extends BaseTest{

	PageFactory pageFactory = new PageFactory();
	
	BasePage Page;
	
     @Before
     public void setup() throws IOException  {
   	 
    	 lauchapplication();	 
     }
	 
	 @Given("User is on the {string}")
	 public void user_is_on_the(String pageName)   {
		 Page = pageFactory.initialize(pageName);
		 //Page = new LoginPage();
	 }
	

	 @Given("user is on the {string}")
	 public void userison_the(String string) {
	    
	 }


	 @When("user enter into Textbox {string} {string}")
	 public void user_enter_into_textbox(String logicalName, String Value) {
	    Page.enterintoTextbox(logicalName, Value);
	 }
	 @Then("user clear the passwordTextbox {string}")
	 public void user_clear_the_password_textbox(String logicalName) {
	   Page.CleartheTextbox(logicalName);
	 }
	 @Then("user click on LoginButton {string}")
	 public void user_click_on_login_button(String logicalName) {
	     Page.ClickonButton(logicalName);
	 }
	 
	/*@Then("validate the error message {string} {string}")
	 public void validate_the_error_message(String logicalName, String Value) {
	     Page.
	 }*/

	 @When("user click on RememberMeButton {string}")
	 public void user_click_on_remember_me_button(String logicalName) { 
		 Page.ClickonButton(logicalName);	 
	 }
	
	 @When("user click on ForgotPasswordlink {string}")
	 public void user_click_on_forgot_passwordlink(String logicalName) {  
		 Page.ClickonButton(logicalName);
	 }
	 @Then("User click on ContinueButton {string}")
	 public void user_click_on_continue_button(String logicalName) {
	     Page.ClickonButton(logicalName);	 
	 }
	 @Then("Click on UserMenu dropDown {string}")
	 public void click_on_user_menu_drop_down(String logicalName) {
		 Page.ClickonButton(logicalName);
	 }
	 @Then("the following options should be displayed:")
	 public void the_following_options_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {
	     // Write code here that turns the phrase above into concrete actions
	     // For automatic transformation, change DataTable to one of
	     // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	     // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	     // Double, Byte, Short, Long, BigInteger or BigDecimal.
	     //
	     // For other transformations you can register a DataTableType.
	     throw new io.cucumber.java.PendingException();
	 }
	
	 @When("the user clicks on the DeveloperConsole link {string}")
	 public void the_user_clicks_on_the_developer_console_link(String logicalName) {
	    Page.ClickonButton(logicalName);
	    
	 }

	 @Then("the Developer Console should be opened {string}")
	 public void the_developer_console_should_be_opened(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("the user clicks on the close button of the Developer Console browser {string}")
	 public void the_user_clicks_on_the_close_button_of_the_developer_console_browser(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("the Developer Console should be closed {string}")
	 public void the_developer_console_should_be_closed(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("User clicks on MyProfile {string}")
	 public void userclicks_on_element(String logicalName) {
	    Page.ClickonButton(logicalName);
		 
	 }
	 @When("User clicks on element {string}")
	 public void user_clicks_on_element(String string) {
	  	 
	     throw new io.cucumber.java.PendingException();
	 }
	
	 @When("user Click on Accounts {string}")
	 public void user_click_on_accounts(String logicalName) {
	     Page.ClickonButton(logicalName);
	    
	 }
	 @When("user is on the HmemePage {string}")
	 public void useris_on_the(String logicalName) {
	     
	 }
	 




}
