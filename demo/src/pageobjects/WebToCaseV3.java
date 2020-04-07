package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="WebToCaseV3"                                
     , summary=""
     , relativeUrl=""
     , connection="WebToCas"
     )             
public class WebToCaseV3 {

	@TextType()
	@FindByLabel(label = "Contact Name")
	public WebElement contactName;
	@TextType()
	@FindByLabel(label = "Email")
	public WebElement email;
	@TextType()
	@FindByLabel(label = "Phone")
	public WebElement phone;
	@ChoiceListType(values = { @ChoiceListValue(value = "High"), @ChoiceListValue(value = "Medium"),
			@ChoiceListValue(value = "Low") })
	@FindByLabel(label = "Priority")
	public WebElement priority;
	@TextType()
	@FindByLabel(label = "Subject")
	public WebElement subject;
	@FindBy(name = "submit")
	@ButtonType()
	public WebElement Submitbutton;
			
}
