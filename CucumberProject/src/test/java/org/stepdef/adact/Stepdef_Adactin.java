package org.stepdef.adact;

import org.adactin.pageobjmanager.Page_Object_Manager;
import org.base.adactin.Base_Class;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.runner.Runner_Class;

import io.cucumber.java.en.*;

public class Stepdef_Adactin extends Base_Class{
	
	public static WebDriver driver=Runner_Class.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("user Launch First Adactin Url")
	public void user_launch_first_adactin_url() {
		get_Url("http://www.adactinhotelapp.com/");
	}
	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String username) {
        sendkeys(pom.getHomepg().getUsername(), username);

	 	}
	@When("user enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String password) {
	   			sendkeys(pom.getHomepg().getPassword(), password);

	}
	@Then("user Click On Login Btn & It Navigates To {string} hotelpg")
	public void user_click_on_login_btn_it_navigates_to_hotelpg(String string) {
        click_on_element(pom.getHomepg().getLogin());
	}
	
		@When("user Select The Location In Location Field")
	public void user_select_the_location_in_location_field() {
		select_By_Visible_Text(pom.getSearch().getSelect_location1(), "Paris");
	}

	@When("user Select The Hotel In Hotel Field")
	public void user_select_the_hotel_in_hotel_field() {
		select_By_Index(pom.getSearch().getSelect_Hotel1(), 3);

	}

	@When("user Select The Roomtype In Roomtype Field")
	public void user_select_the_roomtype_in_roomtype_field() {
		select_By_Visible_Text(pom.getSearch().getSelect_Roomtype1(), "Deluxe");

	}

	@When("user Select The Numberrooms In Numberrooms Field")
	public void user_select_the_numberrooms_in_numberrooms_field() {
		select_By_Index(pom.getSearch().getSelect_number1(), 2);

	}

	@When("user Select The  Datein In Datein Field")
	public void user_select_the_datein_in_datein_field() {
		sendkeys(pom.getSearch().getSelect_date1(), "10/03/2020");

	}

	@When("user Select The DateoutIin Dateout Field")
	public void user_select_the_dateout_iin_dateout_field() {
		sendkeys(pom.getSearch().getSelect_outdate1(), "19/07/2020");

	}

	@When("user Select The  Adults In Per Room In Adults In Per Room Field")
	public void user_select_the_adults_in_per_room_in_adults_in_per_room_field() {
		select_By_Index(pom.getSearch().getSelect_adults1(), 1);

	}

	@When("user Select The Children In Per Room In Children In Per Room Field")
	public void user_select_the_children_in_per_room_in_children_in_per_room_field() {
		select_By_Index(pom.getSearch().getSelect_children1(), 1);

	}
	@Then("user Click On Search Btn & It Navigates To {string} hotelclk")
	public void user_click_on_search_btn_it_navigates_to_hotelclk(String expected_title) {
		click_on_element(pom.getSearch().getSelect_search1());
		Assert.assertEquals(expected_title, Base_Class.get_Title());
		
	}
	@When("User Click The Radio Btn In Search Hotel")
	public void user_click_the_radio_btn_in_search_hotel() {
		click_on_element(pom.getNext().getSelect_Click());

	}

	@Then("User Click On Contiune & It Navigates To {string} bookpg")
	public void user_click_on_contiune_it_navigates_to_bookpg(String expected_title) {
		click_on_element(pom.getNext().getSelect_Continue());
		Assert.assertEquals(expected_title, Base_Class.get_Title());


	}

	@When("user Enter The Firstname In Firstname Field")
	public void user_enter_the_firstname_in_firstname_field() {
		sendkeys(pom.getBook().getFirstname(), "Adam");

	}

	@When("user Enter The Lastname In Lastname Field")
	public void user_enter_the_lastname_in_lastname_field() {
		sendkeys(pom.getBook().getLastnmame(), "Bala");

	}

	@When("user Enter The Address In Address Field")
	public void user_enter_the_address_in_address_field() {
		sendkeys(pom.getBook().getAddress(), "N0:6, Gandhi street,chennai");

	}

	@When("user Enter The Creditcardno In Creditcardno Field")
	public void user_enter_the_creditcardno_in_creditcardno_field() {
		sendkeys(pom.getBook().getCardnumber(), "4321098765654321");

	}

	@When("user Enter The  Creditcardtype In Creditcardtype Field")
	public void user_enter_the_creditcardtype_in_creditcardtype_field() {
		select_By_Visible_Text(pom.getBook().getCreditcard(), "VISA");

	}

	@When("user Enter The Expirydate In Selectmonth Field")
	public void user_enter_the_expirydate_in_selectmonth_field() {
		select_By_Visible_Text(pom.getBook().getMonth(), "May");

	}

	@When("user Enter The  Expirydate In  Selectyear Field")
	public void user_enter_the_expirydate_in_selectyear_field() {
		select_By_Visible_Text(pom.getBook().getYears(), "2016");

	}

	@When("user Enter The Ccvnumber In Ccvnumber Field")
	public void user_enter_the_ccvnumber_in_ccvnumber_field() {
		sendkeys(pom.getBook().getCcv_no(), "2601");

	}
	@Then("user Click On Booknow btn  & It Navigates To \"Adactin.com - Hotel Booking Confirmation\"conformpg")
	public void user_click_on_booknow_btn_it_navigates_to_adactin_com_hotel_booking_confirmation_conformpg() {
			click_on_element(pom.getBook().getBook());
			

	}
	@When("user Click On Myliternary & It Navigates To \"Adactin.com - Select Hotel")
	public void user_click_on_myliternary_it_navigates_to_adactin_com_select_hotel() {
		click_on_element(pom.getClick().getMy_litenery());

	}
	@When("user Click The Radio Btn Of Order Id In Booked Itinerary")
	public void user_click_the_radio_btn_of_order_id_in_booked_itinerary() {
		click_on_element(pom.getLogout().getBox_Click());

	}
	@Then("user Click On Logout Btn & It Navigates To \"Adactin.com  -Logout")
	public void user_click_on_logout_btn_it_navigates_to_adactin_com_logout() {
		click_on_element(pom.getLogout().getLogout());

	}

}
