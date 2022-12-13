package org.singleton.reader.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testdata_Reader {
	public static Properties d;

	public Testdata_Reader() throws IOException {// constructor
		File a = new File(
				// "C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Nov_1_Project\\src\\main\\java\\org\\data\\reader\\Test.properties");
				"D:\\Adactingit\\Nov_1_Project\\src\\main\\java\\org\\data\\reader\\Test.properties");
		FileInputStream s = new FileInputStream(a);
		d = new Properties();
		d.load(s);
	}

	public String getusername() {// method
		String username = d.getProperty("username");
		return username;
	}

	public String getpassword() {
		String password = d.getProperty("password");
		return password;
	}

	public String getlocation() {
		String location = d.getProperty("location");
		return location;
	}

	public String getroom() {
		String roomtype = d.getProperty("roomtype");
		return roomtype;
	}

	public String getdatein() {
		String datein = d.getProperty("selectindate");
		return datein;
	}

	public String getdateout() {
		String dateout = d.getProperty("selectoutdate");
		return dateout;
	}

	public String getfirstname() {
		String firstname = d.getProperty("firstname");
		return firstname;
	}

	public String getlastname() {
		String lastname = d.getProperty("lastname");
		return lastname;
	}

	public String getaddress() {
		String address = d.getProperty("address");
		return address;
	}

	public String getcardno() {
		String cardno = d.getProperty("cardno");
		return cardno;
	}

	public String getcreditcard() {
		String creditcard = d.getProperty("creditcard");
		return creditcard;
	}

	public String getmonth() {
		String month = d.getProperty("month");
		return month;
	}

	public String getyear() {
		String year = d.getProperty("year");
		return year;
	}

	public String getccvno() {
		String ccvno = d.getProperty("ccvno");
		return ccvno;
	}

	public String getname() {// method
		String name = d.getProperty("nameuser");
		return name;
	}

	public String getpass() {
		String pass = d.getProperty("pass");
		return pass;
	}

	public String getloca() {
		String loca = d.getProperty("locaselect");
		return loca;
	}

	public String getrooms() {
		String rooms = d.getProperty("roomselect");
		return rooms;
	}

	public String getindate() {
		String indate = d.getProperty("selectdate");
		return indate;
	}

	public String getoutdate() {
		String outdate = d.getProperty("selectoudate");
		return outdate;
	}

	public String getfiname() {
		String finame = d.getProperty("finame");
		return finame;
	}

	public String getlaname() {
		String laname = d.getProperty("laname");
		return laname;
	}

	public String getadd() {
		String add = d.getProperty("add");
		return add;
	}

	public String getcardnumber() {
		String cardnumber = d.getProperty("cardnumber");
		return cardnumber;
	}

	public String getcreditcardtype() {
		String creditcardtype = d.getProperty("creditcardtype");
		return creditcardtype;
	}

	public String getmonths() {
		String months = d.getProperty("months");
		return months;
	}

	public String getyeasr() {
		String years = d.getProperty("years");
		return years;
	}

	public String getccvnumber() {
		String ccvnumber = d.getProperty("ccvnumber");
		return ccvnumber;
	}

}
