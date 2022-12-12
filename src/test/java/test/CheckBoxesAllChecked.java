package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckboxPage;
import util.BrowserFactory;

public class CheckBoxesAllChecked {

	WebDriver driver;
			
			@Before
			public void init() throws IOException
			{
				driver=BrowserFactory.init();
			}
			
			//Creating Object for the CheckBox
		
			@Test
			public void validateAllcheckboxChecked() throws InterruptedException
			{
				CheckboxPage checkbox=PageFactory.initElements(driver,CheckboxPage.class);
				checkbox.clickToggleAll();
				Thread.sleep(3000);
				
				Assert.assertEquals(true,checkbox.validateAllCheckBox());
			}
			
			@After
			public void closeBrowser()
			{
				BrowserFactory.tearDown();
			}
			

}
