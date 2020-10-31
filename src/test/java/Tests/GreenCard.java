package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class GreenCard extends Base {
	
	
	
	
	
	
	@Test
	public void registrTo() throws InterruptedException {
		
		//driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		
		gr.clickToBegin();
		
		WebDriverWait w = new WebDriverWait(driver, 60);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl0:txtLastName']")));
		
		gr.insertLastName(prop.getProperty("Lastname"));
		
		gr.insertFirstName(prop.getProperty("Firstname"));
		
		gr.clickNoMiddleName();
		
		gr.selectGender(prop.getProperty("gender"));
		
		gr.enterBirthData(prop.getProperty("month"), prop.getProperty("day"), prop.getProperty("year"));
		
		gr.insertBirthCity(prop.getProperty("birthCity"));
		
		gr.selectCountry(prop.getProperty("CountryYouBorn"));
		
		gr.fillUpPasswordInfo(prop.getProperty("passLast"), prop.getProperty("passFirst"), prop.getProperty("passNum"), prop.getProperty("exMonth"), prop.getProperty("exDay"), prop.getProperty("exYear"), prop.getProperty("authorityCountry"));
		
		gr.choosePhoto();
		
		gr.inertToInCareOf(prop.getProperty("inCareOf"));
		
		gr.enterAddressLine1(prop.getProperty("addressline1"));
		
		gr.enterCityToMailing(prop.getProperty("CityOrTown"));
		
		gr.enterDistrictOrStateToMailing(prop.getProperty("DistrictOrCountyOrProvinceOrState"));
		
		gr.enterPostalZipCodeToMailing(prop.getProperty("ZipCode"));
		
		gr.enterCountryToMailing(prop.getProperty("Mailing.Country"));
		
		gr.enterCountryWhereYouLive(prop.getProperty("CountryWhereYouLive"));
		
		
		gr.enterPhoneNum(prop.getProperty("phoneNum"));
		
		gr.enterEmail(prop.getProperty("email"));
		
		gr.enterEducationLevel(prop.getProperty("eduLevel"));
		
		gr.selectMartialStatus(prop.getProperty("martialStatus"));
		
		if(prop.getProperty("martialStatus").equalsIgnoreCase("unmarried")) {
			gr.enterChildNum("0");
		}else {
		gr.enterChildNum(prop.getProperty("numOfChild"));
		}
		
		// for spouse
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qName:txtLastName']")));
		
		gr.spouseName(prop.getProperty("spouseFirst"), prop.getProperty("spouseLast"), prop.getProperty("spouseMiddle"));
		
		gr.enterBirthDataForSpouse(prop.getProperty("spouseBirthMonth"), prop.getProperty("spouseBirthDay"), prop.getProperty("spouseBirthYear"));
		
		gr.selectSpouseGender(prop.getProperty("spouseGender"));
		
		gr.enterSpouseCityWhereBorn(prop.getProperty("City.Where.Spouse.Was.Born"));
		
		gr.spouseCountryWhereBorn(prop.getProperty("Country.Where.Spouse.Was.Born"));
		
		int numOfChild = Integer.parseInt(prop.getProperty("numOfChild"));
		
		for(int i=1; i<=numOfChild; i++) {
			switch(i) {
			case 1:
				//child 1
				gr.enterChild1LastName(prop.getProperty("child1LastName"));
				
				gr.enterChild1FirstName(prop.getProperty("child1FirstName"));
				
				gr.enterChild1MiddleName(prop.getProperty("child1MiddleName"));
				
				gr.enterChild1BirthData(prop.getProperty("child1BirthMonth"), prop.getProperty("child1BirthDay"), prop.getProperty("child1BirthYear"));
				
				gr.selectGenderChild1(prop.getProperty("child1Gender"));
				
				gr.enterCityChild1Born(prop.getProperty("City.Where.Child1.Was.Born"));
				
				gr.enterCountryChild1Born(prop.getProperty("Country.Where.Child1.Was.Born"));
				break;
			case 2:
				
				//child 2
				gr.enterChild2LastName(prop.getProperty("child2LastName"));
				
				gr.enterChild2FirstName(prop.getProperty("child2FirstName"));
				
				gr.enterChild2MiddleName(prop.getProperty("child2MiddleName"));
				
				gr.enterChild2BirthData(prop.getProperty("child2BirthMonth"), prop.getProperty("child2BirthDay"), prop.getProperty("child2BirthYear"));
				
				gr.selectGenderChild2(prop.getProperty("child2Gender"));
				
				gr.enterCityChild2Born(prop.getProperty("City.Where.Child2.Was.Born"));
				
				gr.enterCountryChild2Born(prop.getProperty("Country.Where.Child2.Was.Born"));
				
				break;
				
			case 3:
				
				//child 3
				gr.enterChild3LastName(prop.getProperty("child3LastName"));
				
				gr.enterChild3FirstName(prop.getProperty("child3FirstName"));
				
				gr.enterChild3MiddleName(prop.getProperty("child3MiddleName"));
				
				gr.enterChild3BirthData(prop.getProperty("child3BirthMonth"), prop.getProperty("child3BirthDay"), prop.getProperty("child3BirthYear"));
				
				gr.selectGenderChild3(prop.getProperty("child3Gender"));
				
				gr.enterCityChild3Born(prop.getProperty("City.Where.Child3.Was.Born"));
				
				gr.enterCountryChild3Born(prop.getProperty("Country.Where.Child3.Was.Born"));
				
				break;
			case 4:
				System.out.println("for child 4");
				break;
			}
		}
		
	}

	

}
