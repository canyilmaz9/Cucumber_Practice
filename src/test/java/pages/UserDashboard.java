package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboard {

    public UserDashboard(){
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

//SERPİL BAŞLANGIÇ
    /*
    !!!!!!!!!!!!!
    BU ELEMENT HEADER'A AIT VE WEBSITEMAIN CLASS'INDA KAYITLI /signInButton/ (ONUR)
    !!!!!!!!!!!!!
    */
    //Home Page\\
    //Home Page SıgnIn Button
    @FindBy(xpath = "//li[@class='add-listing']")
    public WebElement homePageSignInButton;


    //User Login Panel\\
    //UserEmail/Username
    @FindBy (xpath = "//*[@placeholder='Email/Username']")
    public WebElement userEmailUsernameForm;
    //Password
    @FindBy (xpath = "//*[@placeholder='Password']")
    public WebElement userPasswordForm;
    //Sign in Button
    @FindBy (xpath = "//*[@class='btn btn-md full-width btn-theme-light-2 rounded']")
    public WebElement userLogInButton;




//UserDashboard Button
@FindBy(xpath = "(//a[@href='https://qa.hauseheaven.com/account/dashboard'])[2]")
public WebElement userDashboardButton;

@FindBy(xpath = "//i[@class='far fa-newspaper mr1']")
public WebElement userDashboardPropertiesButton;


@FindBy(xpath = "//th[@class='column-key-id sorting_desc']")
public WebElement dashboardPropertiesIdButton;
  
@FindBy(xpath = "(//td[@class='column-key-id sorting_1 dtr-control'])[1]")
public  WebElement firstIdElement;
  
@FindBy(xpath = "//button[@class='btn btn-secondary action-item']")
public  WebElement createButton;
  
  //ADD PROPERTIES PAGE
@FindBy(xpath = "//textarea[@name='description']")
public WebElement descriptionBox;
  
@FindBy(xpath = "//div[@role='textbox']")
public WebElement contentBox;

@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[1]")
public WebElement cityBox;

 @FindBy(xpath = "//input[@placeholder='Property location']")
 public WebElement propertyLocationBox;

@FindBy(xpath = "//input[@name='latitude']")
public WebElement latitudeBox;

@FindBy(xpath = "//input[@name='longitude']")
public WebElement longitudeBox;

@FindBy(xpath = "//input[@name='number_bedroom']")
public WebElement numberBedroomsBox;


@FindBy(xpath = "//input[@name='number_bathroom']")
public WebElement numberBathroomsBox;

@FindBy(xpath = "//input[@name='number_floor']")
public WebElement numberFloorsBox;

@FindBy(xpath = "//input[@name='square']")
public WebElement squareBox;
@FindBy(xpath = "//input[@name='price']")
public WebElement priceNumberBox;

@FindBy(xpath = "//select[@name='type_id']")
public WebElement typeButton;

@FindBy(xpath = "(//label[@class='checkbox-inline'])[1]")
public WebElement featuresWifi;

@FindBy(xpath = "(//label[@class='checkbox-inline'])[2]")
public WebElement featuresParking;

@FindBy(xpath = "//button[@class='btn btn-sm btn-info']")
public WebElement saveexitButton;

@FindBy (xpath = "(//td[@class='column-key-id sorting_1 dtr-control'])[1]")
public WebElement listingIdNo;

@FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-primary'])[1]")
public WebElement editButton;

@FindBy(xpath = "//div[@class='note note-success']")
public WebElement edittingPage;

@FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
public WebElement deleteButton;

@FindBy(xpath = "(//div[@class='modal-header bg-danger'])[1]")
public WebElement confirmationText;

@FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
public WebElement confirmationdeleteButton;

////////////////

    @FindBy(xpath = "//div[@class='col-lg-6 col-md-6 mt-3']")
    public WebElement aboutusPage;

    @FindBy(xpath = "//div[@class='contact-info']")
    public WebElement contactUsPage;

    @FindBy(xpath = "//div[@class='col text-center']")
    public WebElement termsConditionsPage;


    @FindBy(xpath = "//div[@class='item-sorting-box']")
    public WebElement allPropertiesPage;

    @FindBy(xpath = "//div[@class='item-sorting-box']")
    public WebElement housesForSailPage;

    @FindBy(xpath = "//div[@class='item-sorting-box']")
    public WebElement housesforRentPage;


    //@FindBy(xpath = "//a[@title='The Benefits Of Investing In Emerging Real Estate Markets']")
    //public WebElement newsFirstElement;
    //@FindBy(xpath = "//a[@title='A Guide To Negotiating The Best Deal On Your Dream Home']")
    //public WebElement newsSecondElement;
    //@FindBy(xpath = "//a[@title='The Rise Of Sustainable Homes: Building For A Greener Future']")
    //public WebElement newsThirdElement;

    @FindBy(xpath = "//div[@class='sec-heading center']")
    public WebElement newsFirstPage;
    @FindBy(xpath = "//div[@class='sec-heading center']")
    public WebElement newsSecondPage;

    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    public WebElement newsThirdPage;

    //SERPİL BİTİŞ

        // KEVSER BAŞLANGIÇ

    ////// SETTINGS //////

    @FindBy(xpath = "//*[@title='Settings']")
    public WebElement settingsButton;

    @FindBy(id = "phone")
    public WebElement phoneBox;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"filter_search\"]/div[2]/div/div[1]/span")
    public WebElement phoneNumberText;

    ////// BUY CREDITS AREA //////

    @FindBy(xpath = "//*[@title='credits']")
    public WebElement buyCreditsButton;


    @FindBy(xpath = "(//*[text()='Purchase'])[1]")
    public WebElement freeFirstPostButton;


    @FindBy(xpath = "//*[@id=\"app-real-estate\"]/div/div/div/div[1]/div/div[2]/div[1]/p/strong")
    public WebElement creditsNumber;

    ////// WRITE A PROPERTY AREA //////

    @FindBy(xpath = "//*[@title='Write a property']")
    public WebElement writePropertyButton;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement titleTextBox;

    @FindBy(xpath = "//*[@class='ck-placeholder']")
    public WebElement contentTextBox;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement saveExitButton;

    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-account-property-table_info\"]/span/span[2]")
    public WebElement totalAdvertNumberText;

    // KEVSER BİTİŞ


    //Gulnar basladı



   @FindBy(xpath = "//*[@id='navigation']/div[2]/ul[2]/li[3]")
 public WebElement logoutButton;

//gulnar bıttı.
    // CAN YILMAZ BASLANGIC 400
    @FindBy(xpath = "//*[@id=\"frmhomesearch\"]/div[1]/div[1]/div/div/div/input")
    public WebElement searchForALocation;

    @FindBy(xpath = "//*[@id=\"select2-ptypes-container\"]")
    public WebElement category;

    ////span[@id='select2-ptypes-container']
    @FindBy(xpath = "//*[@id=\"select2-ptypes-container\"]")
    public WebElement categoryInput;

    @FindBy(xpath = "//*[@id=\"frmhomesearch\"]/div[2]/button")
    public WebElement searchResult;

    @FindBy(xpath = "//*[@id=\"app\"]/section/div/div[2]/div/div[1]/div/div/div[1]/div/h4")
    public WebElement numberOfResultBodySearch;

}