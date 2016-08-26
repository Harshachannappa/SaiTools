package com.ctl.it.qa.omnivue.tools.pages.common;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import com.ctl.it.qa.omnivue.tools.pages.OmniVuePage;

public class OVCreateLocationPage extends OmniVuePage {
	
	@FindBy(xpath="//div[@ng-show='showLocationType']/select")
	public WebElementFacade ddl_Locationtype;
	
	@FindBy(xpath="//button[@ng-click='create();']")
	public WebElementFacade btn_Location_create;
	
	@FindBy(xpath="//input[@id='addRangeY']")
	public WebElementFacade rdbtn_addRange;
	
	@FindBy(xpath="//select[@id='locationRole']") //1
	public WebElementFacade ddl_locationRole;
	
	@FindBy(xpath="//input[@id='addressNumber']") //2
	public WebElementFacade tbx_addressNumber;
	
	@FindBy(xpath="//input[@id='street']") //3
	public WebElementFacade tbx_street;
	
	@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='state')]") //4
	public WebElementFacade ddl_state;
	
	@FindBy(xpath="//span[@ng-switch-when='inputSelectOneMenu']/select[(@id='city')]") //5
	public WebElementFacade ddl_city;
	
	@FindBy(xpath="//input[@id='zip']") //6
	public WebElementFacade tbx_zip;
	
	@FindBy(xpath="//select[@id='NewConstructionIndicator']") //7
	public WebElementFacade ddl_NewConstructionIndicator;
	
	@FindBy(xpath="//input[@id='sWCCLLI']") //8
	public WebElementFacade tbx_sWCCLLI;
	
	@FindBy(xpath="//select[@id='addrangeVal']") //9
	public WebElementFacade ddl_addrangeVal;
	
	@FindBy(xpath="//input[@value='Find Address Range']") //10
	public WebElementFacade btn_FindAddressRange;
	
	@FindBy(xpath="//select[@id='ContractType']") //11
	public WebElementFacade ddl_CTL_ContractType;
	
	@FindBy(xpath="//div[@ng-if='isEditMode']/div[2]/div[7]/div/div[2]/ng-include/div/span[2]/span/select")
	public WebElementFacade ddl_Edit_contractType;
	
	@FindBy(xpath="//input[(@class='cmdButton')and(@value='Edit')]")
	public WebElementFacade btn_Edit;
	
	@FindBy(xpath="//input[(@class='cmdButton')and(@value='Save')]")
	public WebElementFacade btn_Save;
	
	@FindBy(xpath="//select[@id='RestrictedAddressCode']") //12
	public WebElementFacade ddl_RestrictedAddressCode;
	
	@FindBy(xpath="//input[@value='Create']") //13
	public WebElementFacade btn_Create;
	
	@FindBy(xpath="//*[contains(text(),'Create Individual Location')]") //14
	public WebElementFacade tab_Indivdual_Location;
	
	@FindBy(xpath="//*[contains(text(),'Create Individual Location')]/a")
	public WebElementFacade tab_Indivdual_Location_cancel;
	
	//@FindBy(xpath="//*[ends-with(text(),'STREET3')]")
	//public WebElementFacade tab_Indivdual_Location;
	
	@FindBy(xpath="//div[@class='ng-binding alert alert-success']") //15
	public WebElementFacade loc_success;
	
	@FindBy(xpath="//div[@ng-controller='viewEditLocationAWRCtrl']/div[@class='ng-binding alert alert-success']")
	public WebElementFacade loc_Edit_success;
	
	@FindBy(xpath="//*[@id='mainTab']/div/ul/li[Last()-1]/a/tab-heading")
	public WebElementFacade created_tab;
	
	@FindBy(xpath="//tab-heading[contains(text(),'Service Level Check')]/a/img[2]") // 16
	public WebElementFacade SLC_Tab;
	
	public void close_SLC_tab(){
	if(SLC_Tab.isPresent())
		SLC_Tab.click();
	else
		System.out.println("SLC Tab is not present");
	}
	
	@Override
	public WebElementFacade getUniqueElementInPage() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
