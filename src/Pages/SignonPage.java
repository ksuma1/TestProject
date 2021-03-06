package Pages;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import CommonMethods.CommonMethods;
import ConstantValues.ConstantValues;
import DriverClass.Driverclass;
import Utilities.ExcelsheetReadWrite;
import Utilities.LogFile;
import Utilities.Screenshots;

public class SignonPage {
	
	private static final String String = null;
	public static void EnterUsercredentials(String Lvalue1,String Tdata1,String Lvalue2,String Tvalue2,String Lvalue3) throws IOException
	{
		CommonMethods.textboxes(Lvalue1, Tdata1);
		CommonMethods.textboxes(Lvalue2, Tvalue2);
		CommonMethods.clickfun(Lvalue3);	
		
	}
	public static void validateCredentials() throws Exception
	{
		String actual = CommonMethods.title();
		String expected = ConstantValues.expectedtitle;
		if(actual.equalsIgnoreCase(expected))
		{
			Driverclass.bvalue = true;
			LogFile.info("User Credential Validataion is PASS ");
			LogFile.TestcaseEnd();
		}
		else {
			Driverclass.bvalue = false;
			Screenshots.takescreenshot((TakesScreenshot) CommonMethods.driver, "User Credential Fail");
			LogFile.error("User Credential Validataion is FAIL ");
			LogFile.TestcaseEnd();
		}
			
	
	}

}
