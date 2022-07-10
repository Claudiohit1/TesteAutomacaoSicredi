package elementos;

import org.openqa.selenium.By;

public class ElementosWebGet {

	public By selectVersion = By.xpath("//select[@id='switch-version-select']//option[2]");
	public By clicarAddCustomer = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");
	public By preencherName = By.id("field-customerName");
	public By preencherLastName = By.id("field-contactLastName");
	public By preencherContFirstName = By.id("field-contactFirstName");
	public By preencherPhone = By.id("field-phone");
	public By preencherAddress1 = By.id("field-addressLine1");
	public By preencherAddress2 = By.id("field-addressLine2");
	public By preencherCity = By.id("field-city");
	public By preencherState = By.id("field-state");
	public By preencherPostalCode = By.id("field-postalCode");
	public By preencherCountry = By.id("field-country");
	
	// clicar employeer
	public By clicarCampoEmployeer = By
			.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']//a//span[text()='Select from Employeer']");
	// digitarEmployeer
	public By digitarEmployeer = By.xpath("//div[@class='chosen-drop']//div//input");
	// inseriremployeer
	public By inserirEmployeer = By.xpath("//div[@class='chosen-drop']//div//input");
	
	public By preencherCredit = By.id("field-creditLimit");
	public By clicarEnviar = By.id("form-button-save");
	public By validarMsg = By.xpath("//div[@id='report-success']/p");
	
	

}
