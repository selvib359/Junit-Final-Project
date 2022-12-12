package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckboxPage {
	
	WebDriver driver;
	 
	public CheckboxPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Finding the WebElements

	@FindBy(how=How.XPATH,using ="//input[@name='allbox']") WebElement TOGGLE_CHECKBOX_ELEMENT;
	@FindBy(how=How.XPATH,using="//div[@id='todos-content']//input[@type='checkbox']") List<WebElement> LIST_OF_ELEMENT;
	@FindBy(how=How.NAME,using="submit") WebElement REMOVE_ELEMENT;
	@FindBy(how=How.XPATH,using="//div[@id='todos-content']//input[@type='checkbox']") List<WebElement> LIST_OF_ELEMENT_AT_END;
	@FindBy(how=How.XPATH,using="//div[@id='todos-content']//input[@type='checkbox']") List<WebElement> REMOVE_ALL_ELEMENT;
	
	// Corresponding Methods()
	
	public void clickToggleAll() {
		
		TOGGLE_CHECKBOX_ELEMENT.click();
	}
	
	public boolean validateAllCheckBox() {
		
		int totalcheckbox=LIST_OF_ELEMENT.size();
		int checkcount=0;
		
		for(int i=0;i<totalcheckbox;i++)
		{
			if(LIST_OF_ELEMENT.get(i).isSelected())
 			{
				checkcount++;
			}
		}
		System.out.println(checkcount);
		if(totalcheckbox==checkcount)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean removeOneCheckBox()
	{
		int totalCheckbox=LIST_OF_ELEMENT.size();
		LIST_OF_ELEMENT.get(0).click();
		REMOVE_ELEMENT.click();
		
		int checkboxatend=LIST_OF_ELEMENT_AT_END.size();
		
		if(totalCheckbox>checkboxatend)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public int removeAllcheckbox()
	{
		
		REMOVE_ELEMENT.click();
		int finalCount=REMOVE_ALL_ELEMENT.size();
		return finalCount;
	}
	
	
	
}
	


	