package AdminModuleTestCase;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class LoginPage_Tests extends TestBase{
	
	@Test
	public void loginPage() throws Exception {
		homepage.clickOnSignIn();		
	}
	
//	String FileName = "//src//test//resources//testData//VehicleInsuranceCalcualator_TestData.xlsx";
//	ExcelOperations excel = new ExcelOperations(FileName ,"InsurancePremium");
//	
//	@Test (dataProvider = "vehData")
//	public void insuranceCalculate(Object obj1) throws Exception {
//		HashMap<String, String> testData = (HashMap<String, String>) obj1;
//		
//		//test.log(Status.INFO, "Test data used for execution is: "+ testData);
//		homepage.clickOnSignIn();
////		vehData.enterVehicleData(testData);
////		vehData.clickOnNextButton();
////		insData.enterInsurantData(testData);
////		insData.clickOnNextButton();
////		prodData.enterProductData(testData);
////		prodData.clickOnNextButton();
	
         
////		
////		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Gold"), testData.get("PriceValidation_Gold"), "Pricing for gold plan is not matching.");
////		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Silver"), testData.get("PriceValidation_Silver"), "Pricing for silver plan is not matching.");
////		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Platinum"), testData.get("PriceValidation_Platinum"), "Pricing for platimum plan is not matching.");
////		Assert.assertEquals(priceOptions.getPriceForSelectedOption("Ultimate"), testData.get("PriceValidation_Ultimate"), "Pricing for ultimate plan is not matching.");
////		
////		priceOptions.selectPriceOption(testData.get("SelectOption"));
////
////		priceOptions.clickOnNextButton();
//	}
//	
//	//Dataprovider method --> return object array
//	@DataProvider (name = "vehData")
//	public Object[][] testDataSupplier() throws Exception {
//		Object[][] obj = new Object[excel.getRowCount()][1];
//		for (int i = 1; i <= excel.getRowCount(); i++) {
//			HashMap<String, String> testData = excel.getTestDataInMap(i);
//			obj[i-1][0] = testData;
//		}
//		return obj;
//		
//	}
//	
	
}
