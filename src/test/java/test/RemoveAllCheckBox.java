package test;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.CheckboxPage;
import util.BrowserFactory;


public class RemoveAllCheckBox {
	
	
			WebDriver driver;
			
			@Before
			public void init() throws IOException
			{
				driver=BrowserFactory.init();
			}
			
			@Test
			public void removedAllCheckBoxes() throws InterruptedException
				{
				CheckboxPage checkbox=PageFactory.initElements(driver,CheckboxPage.class);
				checkbox.clickToggleAll();
				Thread.sleep(3000);
				
				Assert.assertEquals(0, checkbox.removeAllcheckbox());
							
				}
			
			@After
			public void tearDown()
			{
				BrowserFactory.tearDown();
			}

		}



