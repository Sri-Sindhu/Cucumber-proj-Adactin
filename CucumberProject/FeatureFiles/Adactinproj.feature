Feature: hotel Booking In Adactin

Scenario Outline: login page For User Login

Given user Launch First Adactin Url

 When user Enter The "<Username>" In Username Field

And user enter The "<Password>" In Password Field

Then user Click On Login Btn & It Navigates To "Adactin.com - Search Hotel" hotelpg

Examples:
|Username|Password|
|sindhuanu|bala1028&|


@Hotel
Scenario: search Hotel Page For Choose Hotel

When user Select The Location In Location Field

And user Select The Hotel In Hotel Field

And user Select The Roomtype In Roomtype Field

And user Select The Numberrooms In Numberrooms Field

And user Select The  Datein In Datein Field

And user Select The DateoutIin Dateout Field

And user Select The  Adults In Per Room In Adults In Per Room Field

And user Select The Children In Per Room In Children In Per Room Field

Then user Click On Search Btn & It Navigates To "Adactin.com - Select Hotel" hotelclk


Scenario:  we Select The Hotel 

When User Click The Radio Btn In Search Hotel

Then User Click On Contiune & It Navigates To "Adactin.com - Book A Hotel" bookpg


Scenario: user Give Personal Details

When  user Enter The Firstname In Firstname Field

And user Enter The Lastname In Lastname Field

And user Enter The Address In Address Field

And user Enter The Creditcardno In Creditcardno Field

And user Enter The  Creditcardtype In Creditcardtype Field

And user Enter The Expirydate In Selectmonth Field

And user Enter The  Expirydate In  Selectyear Field

And user Enter The Ccvnumber In Ccvnumber Field

Then user Click On Booknow btn  & It Navigates To "Adactin.com - Hotel Booking Confirmation"conformpg


Scenario: user Go To Bookitinerary

When user Click On Myliternary & It Navigates To "Adactin.com - Select Hotel


Scenario: user Go To Logout Page

When user Click The Radio Btn Of Order Id In Booked Itinerary	

Then user Click On Logout Btn & It Navigates To "Adactin.com  -Logout








 
 