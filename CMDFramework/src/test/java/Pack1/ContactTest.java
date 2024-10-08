package Pack1;

import org.testng.annotations.Test;

public class ContactTest {
@Test(groups = "Smoke")
public void createContactTest()
{
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	System.out.println("Excution is complete");
	System.out.println(URL);
	System.out.println(BROWSER);
}
@Test(groups = {"Smoke","Regression"})
public void createContactwithPhoneTest()
{
	System.out.println("createContactwithPhoneTest is excuted ");
}
}
