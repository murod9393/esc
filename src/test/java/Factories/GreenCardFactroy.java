package Factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GreenCardFactroy {
	
	WebDriver driver;
	Actions act;
	
	@FindBy (xpath = "//a[@class='btn btn-success']")
	WebElement beginBtn;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:btnSubmit']")
	WebElement submitBtn;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl0:txtLastName']")
	WebElement lastNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl0:txtFirstName']")
	WebElement firstNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl0:cbxMiddleName']")
	WebElement noMiddleNameCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl1:grpGender'])[1]")
	WebElement genderMale;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl1:grpGender'])[2]")
	WebElement genderFemale;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl2:txtMonthOfBirth']")
	WebElement birthMonthBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl2:txtDayOfBirth']")
	WebElement birthDayBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl2:txtYearOfBirth']")
	WebElement birthYearBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl3:txtBirthCity']")
	WebElement brithCityBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl3:cbxBirthCity']")
	WebElement unknownCityCheckBox;
	
	@FindBy(xpath = "//select[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl4:drpBirthCountry']")
	WebElement selectCountry;

	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl6:txtPPLastName']")
	WebElement passFirstnameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl6:txtPPFirstName']")
	WebElement passLastnameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl6:cbxPPMiddleName']")
	WebElement passNoMiddleNameCheckbox;

	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl6:txtPPNum']")
	WebElement passportNumberBox;
	
	//passport expiration data
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl6:txtPPExpMonth']")
	WebElement passExMonthBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl6:txtPPExpDay']")
	WebElement passExDayBox;

	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl6:txtPPExpYear']")
	WebElement passExYearBox;
	
	// Country/Authority of Issuance:
	@FindBy(xpath = "//select[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl6:drPPCountry']")
	WebElement selectAuthorityCon;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl7:btnPhotoBox']")
	WebElement chooseNewPhotoBtn;
	
	
	// Mailing address...
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl8:txtAddress1']")
	WebElement addressLine1Box;

	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl8:txtInCareOf']")
	WebElement mailInCareOfBox;

	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl8:txtAddress2']")
	WebElement mailAddressLine2Box;

	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl8:txtCity']")
	WebElement mailCityOrTownBox;

	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl8:txtDistrict']")
	WebElement mailDistrictOrStateBox;

	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl8:txtZipCode']")
	WebElement mailZipCodeBox;

	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl8:cbxZipCode']")
	WebElement mailNoZipCodeCheckBox;

	@FindBy(xpath = "//select[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl8:drpMailingCountry']")
	WebElement mailCountryBox;

	@FindBy(xpath = "//select[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl9:drpCountry']")
	WebElement countryWhereYouLiveBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl10:txtPhoneNumber']")
	WebElement phoneBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl11:txtEmailAddress']")
	WebElement  emailBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl11:txtConfEmailAddress']")
	WebElement confirmEmailBox;
	
	// What is the highest level of education you have achieved, as of today?
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[1]")
	WebElement primarySchoolCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[2]")
	WebElement highSchoolNoDegreeCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[3]")
	WebElement highSchoolCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[4]")
	WebElement vacationalSchoolCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[5]")
	WebElement someUniversityCoursesCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[6]")
	WebElement universityDegreeCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[7]")
	WebElement someGraduateLevelCourseCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[8]")
	WebElement masterDegreeCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[9]")
	WebElement someDoctorateLevelCourseCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl12:rblEducation'])[10]")
	WebElement doctoratedegreeCheckBox;
	
	// What is your current marital status? 
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl13:rblMarried'])[1]")
	WebElement unmarriedCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl13:rblMarried'])[2]")
	WebElement marriedSpouseNOTUSACitizenCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl13:rblMarried'])[3]")
	WebElement marriedSpouseUSACitizenCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl13:rblMarried'])[4]")
	WebElement divorcedCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl13:rblMarried'])[5]")
	WebElement widowedCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl13:rblMarried'])[6]")
	WebElement legallySperatedCheckBox;
	
// Number of Children
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formApplicant:_ctl14:txtNumChildren']")
	WebElement numOfChildBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:btnContinueP1']")
	WebElement continueBtn;
	
	
	// Spouse name: 
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qName:txtLastName']")
	WebElement spouseLastNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qName:txtFirstName']")
	WebElement spouseFirstNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qName:txtMiddleName']")
	WebElement sposueMiddleNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qName:cbxMiddleName']")
	WebElement spouseNoMiddleNameCheckBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qBirthDate:txtMonthOfBirth']")
	WebElement spouseBirthMonthBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qBirthDate:txtDayOfBirth']")
	WebElement spouseBirthDayBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qBirthDate:txtYearOfBirth']")
	WebElement spouseBirthYearBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qGender:grpGender'])[1]")
	WebElement spouseGenderMaleCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qGender:grpGender'])[2]")
	WebElement spouseGenderFemaleCheckBox;
	
	//    City Where Spouse Was Born
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qBirthCity:txtBirthCity']")
	WebElement CityWhereSpouseBornBox;
	
	@FindBy(xpath = "//select[@name='_ctl0:ContentPlaceHolder1:formSpouse:qBirthCountry:drpBirthCountry']")
	WebElement CountryWhereSpouseBorn;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formSpouse:qPhotograph:btnPhotoBox']")
	WebElement choosePhotoForSpouseBtn;
	
	// child 1
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qName:txtLastName']")
	WebElement child1LastNameBox; 
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qName:txtFirstName']")
	WebElement child1FirstNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qName:txtMiddleName']")
	WebElement child1MiddleNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qName:cbxMiddleName']")
	WebElement child1NoMiddleNameCheckBox;
	
	//  birthData for child 1
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qBirthDate:txtMonthOfBirth']")
	WebElement child1BirthMonthBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qBirthDate:txtDayOfBirth']")
	WebElement child1BirthDayBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qBirthDate:txtYearOfBirth']")
	WebElement child1BirthYearBox;
	
	//  15e. Gender
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qGender:grpGender'])[1]")
	WebElement child1GenderMaleCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qGender:grpGender'])[2]")
	WebElement child1GenderFemaleCheckBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qBirthCity:txtBirthCity']")
	WebElement child1BirthCityBox;
	
	@FindBy(xpath = "//select[@name='_ctl0:ContentPlaceHolder1:formChild01:qBirthCountry:drpBirthCountry']")
	WebElement child1BirthCountryBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild01:qPhotograph:btnPhotoBox']")
	WebElement child1ChoosePhotoBtn;
	
	
	// child2
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qName:txtLastName']")
	WebElement child2LastNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qName:txtFirstName']")
	WebElement child2FirstNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qName:txtMiddleName']")
	WebElement child2MiddleNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qName:cbxMiddleName']")
	WebElement child2NoMiddleNameCheckBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qBirthDate:txtMonthOfBirth']")
	WebElement child2BirthMonthBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qBirthDate:txtDayOfBirth']")
	WebElement child2BirthDayBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qBirthDate:txtYearOfBirth']")
	WebElement child2BirthYearBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qGender:grpGender'])[1]")
	WebElement child2GenderMaleCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qGender:grpGender'])[2]")
	WebElement child2GenderFemaleCheckBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qBirthCity:txtBirthCity']")
	WebElement child2BirthCityBox;
	
	@FindBy(xpath = "//select[@name='_ctl0:ContentPlaceHolder1:formChild02:qBirthCountry:drpBirthCountry']")
	WebElement child2BirthCountryBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild02:qPhotograph:btnPhotoBox']")
	WebElement child2ChoosePhotoBtn;
	
	
	
	// child3
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qName:txtLastName']")
	WebElement child3LastNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qName:txtFirstName']")
	WebElement child3FirstNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qName:txtMiddleName']")
	WebElement child3MiddleNameBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qName:cbxMiddleName']")
	WebElement child3NoMiddleNameCheckBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qBirthDate:txtMonthOfBirth']")
	WebElement child3BirthMonthBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qBirthDate:txtDayOfBirth']")
	WebElement child3BirthDayBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qBirthDate:txtYearOfBirth']")
	WebElement child3BirthYearBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qGender:grpGender'])[1]")
	WebElement child3GenderMaleCheckBox;
	
	@FindBy(xpath = "(//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qGender:grpGender'])[2]")
	WebElement child3GenderFemaleCheckBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qBirthCity:txtBirthCity']")
	WebElement child3BirthCityBox;
	
	@FindBy(xpath = "//select[@name='_ctl0:ContentPlaceHolder1:formChild03:qBirthCountry:drpBirthCountry']")
	WebElement child3BirthCountryBox;
	
	@FindBy(xpath = "//input[@name='_ctl0:ContentPlaceHolder1:formChild03:qPhotograph:btnPhotoBox']")
	WebElement child3ChoosePhotoBtn;
	
	
	public GreenCardFactroy(WebDriver driver ) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public void clickToBegin() {
		beginBtn.click();
	}

	public void clcikToSubmit() {
		submitBtn.click();
	}
	
	public void insertLastName(String lastname) {
		lastNameBox.sendKeys(lastname);
	}
	
	public void insertFirstName(String name) {
		firstNameBox.sendKeys(name);
	}
	
	public void clickNoMiddleName() {
		noMiddleNameCheckBox.click();
	}
	
	public void selectGender(String gender) {
		if(gender.equals("male")) {
			genderMale.click();
		}else {
			genderFemale.click();
		}
	}
	
	public void enterBirthData(String month, String day, String year) {
		birthMonthBox.sendKeys(month);
		birthDayBox.sendKeys(day);
		birthYearBox.sendKeys(year);
		
	}
	
	public void insertBirthCity(String city) {
		
		brithCityBox.sendKeys(city);
		
	}
	
	public void selectCountry(String country ) {
		Select selCountry = new  Select(selectCountry);
		selCountry.selectByVisibleText(country);
		
	}
	
	public void fillUpPasswordInfo(String lastname, String firstname, String passNum,
			String month, String day, String year, String Country) {
		passLastnameBox.sendKeys(lastname);
		passFirstnameBox.sendKeys(firstname);
		passNoMiddleNameCheckbox.click();
		passportNumberBox.sendKeys(passNum);
		passExMonthBox.sendKeys(month);
		passExDayBox.sendKeys(day);
		passExYearBox.sendKeys(year);
		
		Select sel = new Select(selectAuthorityCon);
		sel.selectByVisibleText(Country);
		
	}
	
	public void choosePhoto() {
		chooseNewPhotoBtn.click();
	}
	
	public void inertToInCareOf(String str) {
		mailInCareOfBox.sendKeys(str);
	}
	
	public void enterAddressLine1(String address1) {
		addressLine1Box.sendKeys(address1);
	}
	
	public void enterAddressLine2(String address2) {
		addressLine1Box.sendKeys(address2);
	}
	
	public void enterCityToMailing(String City) {
		mailCityOrTownBox.sendKeys(City);
	}
	
	public void enterDistrictOrStateToMailing(String district) {
		mailDistrictOrStateBox.sendKeys(district);
	}
	
	public void enterPostalZipCodeToMailing(String zipcode) {
		
		if(zipcode.equals("null")) {
			mailNoZipCodeCheckBox.click();
		}else {
		mailZipCodeBox.sendKeys(zipcode);
		}
	}
	
	public void enterCountryToMailing(String country) {
	Select	selectCountry = new Select(mailCountryBox);
	selectCountry.selectByVisibleText(country);
	}
	
	public void enterCountryWhereYouLive(String country) {
		Select	selectCountry = new Select(countryWhereYouLiveBox);
		selectCountry.selectByVisibleText(country);
	}
	
	public void enterPhoneNum(String phoneNum) {
		phoneBox.sendKeys(phoneNum);
	}
	
	public void enterEmail(String email) {
		emailBox.sendKeys(email);
		confirmEmailBox.sendKeys(email);
	}
	
	public void enterEducationLevel(String degree) {
		if(degree.equals("primarySchool")) {
			primarySchoolCheckBox.click();
		}else if(degree.equals("highSchoolNoDegree")) {
			highSchoolNoDegreeCheckBox.click();
		}else if(degree.equals("highSchoolDegree")) {
			highSchoolCheckBox.click();
		}else if(degree.equals("vocationalSchool")) {
			vacationalSchoolCheckBox.click();
		}else if(degree.equals("someUniversityCourses")) {
			someUniversityCoursesCheckBox.click();
		}else if(degree.equals("universityDegree")) {
			universityDegreeCheckBox.click();
		}else if(degree.equals("someGraduateLevelCourses")) {
			someGraduateLevelCourseCheckBox.click();
		}else if(degree.equals("masterDegree")) {
			masterDegreeCheckBox.click();
		}else if(degree.equals("someDoctorateLevelCourses")) {
			someDoctorateLevelCourseCheckBox.click();
		}else {
			doctoratedegreeCheckBox.click();
		}
		
	}
	
	public void selectMartialStatus(String status) {
		if(status.equals("Unmarried")) {
			unmarriedCheckBox.click();
		}else if(status.equals("marriedMySpouseNotUSAcitizen")) {
			marriedSpouseNOTUSACitizenCheckBox.click();
		}else if(status.equals("marriedMySpouseUSAcitizen")) {
			marriedSpouseUSACitizenCheckBox.click();
		}else if(status.equals("Divorced")) {
			divorcedCheckBox.click();
		}else if(status.equals("Widowed")) {
			widowedCheckBox.click();
		}else {
			legallySperatedCheckBox.click();
		}
	}
	
	public void enterChildNum(String childNum) {
		numOfChildBox.sendKeys(childNum);
	}
	
	public void clickToContinueBtn() {
		continueBtn.click();
	}
	
	
	// Spouse 
	
	public void spouseName(String firstName, String lastName,String middleName) {
		spouseFirstNameBox.sendKeys(firstName);
		spouseLastNameBox.sendKeys(lastName);
		
		if(middleName.equals("null")) {
		spouseNoMiddleNameCheckBox.click();	
		}else {
			sposueMiddleNameBox.sendKeys(middleName);		
		}
	}
	
	public void enterBirthDataForSpouse(String month,String day,String year) {
		spouseBirthMonthBox.sendKeys(month);
		spouseBirthDayBox.sendKeys(day);
		spouseBirthYearBox.sendKeys(year);
	}
	
	public void selectSpouseGender(String gender) {
		if(gender.equals("male")) {
			spouseGenderMaleCheckBox.click();
		}else {
			spouseGenderFemaleCheckBox.click();
		}
	}
	
	public void enterSpouseCityWhereBorn(String city) {
		CityWhereSpouseBornBox.sendKeys(city);
	}
	
	
	public void spouseCountryWhereBorn(String country) {
		Select select = new Select(CountryWhereSpouseBorn);
		select.selectByVisibleText(country);
		
	}
	
	public void enterChild1LastName(String lastname) {
		child1LastNameBox.sendKeys(lastname);
	}
	
	public void enterChild1FirstName(String firstname) {
		child1FirstNameBox.sendKeys(firstname);
	}
	
	public void enterChild1MiddleName(String middlename) {
		if(middlename.equals("null")) {
			child1NoMiddleNameCheckBox.click();
		}else {
			child1MiddleNameBox.sendKeys(middlename);
		}
	}
	
	public void enterChild1BirthData(String month, String day, String year) {
		child1BirthMonthBox.sendKeys(month);
		child1BirthDayBox.sendKeys(day);
		child1BirthYearBox.sendKeys(year);
	}
	
	public void selectGenderChild1(String gender) {
		if(gender.equals("male")) {
			child1GenderMaleCheckBox.click();
		}else {
			child1GenderFemaleCheckBox.click();
		}
	}
	
	public void enterCityChild1Born(String city) {
		child1BirthCityBox.sendKeys(city);
	}

	public void enterCountryChild1Born(String country) {
		child1BirthCountryBox.sendKeys(country);
	}
	
	
	// for child2 
	
	public void enterChild2LastName(String lastname) {
		child2LastNameBox.sendKeys(lastname);
	}
	
	public void enterChild2FirstName(String firstname) {
		child2FirstNameBox.sendKeys(firstname);
	}
	
	public void enterChild2MiddleName(String middlename) {
		if(middlename.equals("null")) {
			child2NoMiddleNameCheckBox.click();
		}else {
			child2MiddleNameBox.sendKeys(middlename);
		}
	}
	
	public void enterChild2BirthData(String month, String day, String year) {
		child2BirthMonthBox.sendKeys(month);
		child2BirthDayBox.sendKeys(day);
		child2BirthYearBox.sendKeys(year);
	}
	
	public void selectGenderChild2(String gender) {
		if(gender.equals("male")) {
			child2GenderMaleCheckBox.click();
		}else {
			child2GenderFemaleCheckBox.click();
		}
	}
	
	public void enterCityChild2Born(String city) {
		child2BirthCityBox.sendKeys(city);
	}

	public void enterCountryChild2Born(String country) {
		child2BirthCountryBox.sendKeys(country);
	}
	
	
	
	// child 3 
	
	
	public void enterChild3LastName(String lastname) {
		child3LastNameBox.sendKeys(lastname);
	}
	
	public void enterChild3FirstName(String firstname) {
		child3FirstNameBox.sendKeys(firstname);
	}
	
	public void enterChild3MiddleName(String middlename) {
		if(middlename.equals("null")) {
			child3NoMiddleNameCheckBox.click();
		}else {
			child3MiddleNameBox.sendKeys(middlename);
		}
	}
	
	public void enterChild3BirthData(String month, String day, String year) {
		child3BirthMonthBox.sendKeys(month);
		child3BirthDayBox.sendKeys(day);
		child3BirthYearBox.sendKeys(year);
	}
	
	public void selectGenderChild3(String gender) {
		if(gender.equals("male")) {
			child3GenderMaleCheckBox.click();
		}else {
			child3GenderFemaleCheckBox.click();
		}
	}
	
	public void enterCityChild3Born(String city) {
		child3BirthCityBox.sendKeys(city);
	}

	public void enterCountryChild3Born(String country) {
		child3BirthCountryBox.sendKeys(country);
	}
	
	
	
	
	
	
	
	
	
	
	
}
