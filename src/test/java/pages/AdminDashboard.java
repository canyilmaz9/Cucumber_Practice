package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboard {

    public AdminDashboard() {PageFactory.initElements(utilities.Driver.getDriver(), this);}


    //Admin Login Panel\\
        //Email/Username
        @FindBy (xpath = "//*[@placeholder='Email/Username']")
        public WebElement emailUsernameForm;
        //Password
        @FindBy (xpath = "//*[@placeholder='Password']")
        public WebElement passwordForm;
        //Sign in Button
        @FindBy (xpath = "//*[@class='btn btn-block login-button']")
        public WebElement signInButton;



    //      **AdminDashboard Main Page**      \\


    //Blog Menu\\
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[3]")
    public WebElement blogButton;

        //Blog Menu Subsections\\
            //Tags button
            @FindBy(xpath = "//*[@id='cms-plugins-blog-tags']/a")
            public WebElement tagsButton;
                //Tags Create Page Elements

                    //Status dropdownMenu




    // Testimonials Menu
    @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[4]/a")
    public WebElement testimonialsButton;

    //Real Estate Menu
    @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/a")
    public WebElement realEstateButton;

        //Real Estate Menu Subsections\\
            //Properties Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[1]/a")
            public WebElement propertiesButton;
            //Projects Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[2]/a")
            public WebElement projectsButton;
            //Features Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[3]/a")
            public WebElement featuresButton;
            //Facilities Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[4]/a")
            public WebElement facilitiesButton;
            //Investors Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[5]/a")
            public WebElement investorsButton;
            //Categories Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[6]/a")
            public WebElement categoriesButton;
            //Types Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[7]/a")
            public WebElement typesButton;
            //Reviews Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[8]/a")
            public WebElement reviewsButton;
            //Settings Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[9]/a")
            public WebElement settingsButton;




////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

                //Admin Panel Mutual Elements\\

////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\



    //Create button
    @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/button[1]")
    public WebElement createButton;
    //Listedeki ilk item edit butonu
    @FindBy (xpath = "//*[@data-bs-original-title='Edit'][1]")
    public WebElement editButton;
    //Listedeki ilk item delete butonu
    @FindBy (xpath = "//*[@data-bs-original-title='Delete'][1]")
    public WebElement deleteButton;
    //Delete Screen
        //X button
        @FindBy (xpath = "//*[@id='main']/div[2]/div/div/div[1]/button")
        public WebElement deleteXButton;
        //DeleteConfirm Button
        @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
        public WebElement deleteConfirmButton;
        //Cancel Button
        @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']/preceding-sibling::*" )
        public WebElement cancelButton;
    //Create&Edit Sayfa Elementleri
        //Save&Exit Button
        @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[1]/div[2]/div/button[1]")
        public WebElement saveAndExit;
        //Name Form
        @FindBy (xpath = "//*[@placeholder='Name']")
        public WebElement nameForm;
        //"The name field is required." (Can also be used for Title field.)
        @FindBy (xpath = "//*[@id='name-error']")
        public WebElement nameError;
        //Title form
        @FindBy (xpath = "//*[@placeholder='Title']")
        public WebElement titleForm;
        //Description form
        @FindBy (xpath = "//*[@placeholder='Short description']")
        public WebElement descriptionForm;
        //Content Form
        @FindBy (xpath = "//*[@aria-label='Editor editing area: main']")
        public WebElement contentForm;
        //Location Form
        @FindBy (xpath = "//*[@placeholder='Location']")
        public WebElement locationForm;
        //PropertyLocation Form (Properties)
        @FindBy (xpath = "//*[@placeholder='Property location']")
        public WebElement propertyLocationForm;
        //Type Menu (Properties)
        @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[1]/div[3]/div[2]/div/div/select")
        public WebElement typePropertiesMenu;
            //Type Menu Items
                //For Rent
                @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[1]/div[3]/div[2]/div/div/select/option[1]")
                public WebElement forRentType;
                //For Sale
                @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[1]/div[3]/div[2]/div/div/select/option[2]")
                public WebElement forSaleType;
        //Status Menu
        @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[4]/div[2]/div/select")
        public WebElement statusMenu;
            //Status Selections
                //Published
                @FindBy (xpath = "//option[@value='published']")
                public WebElement publishedStatus;
                //Draft
                @FindBy (xpath = "//option[@value='draft']")
                public WebElement draftStatus;
                //Pending
                @FindBy (xpath = "//option[@value='pending']")
                public WebElement pendingStatus;
                //Approved
                @FindBy (xpath = "//li[text()='Approved']")
                public WebElement approvedStatus;
                //Rejected
                @FindBy (xpath = "//li[text()='Rejected']")
                public WebElement rejectedStatus;
                //Not Available
                @FindBy (xpath = "//option[@value='not_available']")
                public WebElement notAvailableStatus;
                //Preparing Selling
                @FindBy (xpath = "//option[@value='pre_sale']")
                public WebElement preparingSellingStatus;
                //Selling
                @FindBy (xpath = "//option[@value='selling']")
                public  WebElement SellingStatus;
                //Sold
                @FindBy (xpath = "//option[@value='sold']")
                public WebElement soldStatus;
                //Building
                @FindBy (xpath = "//option[@value='building']")
                public WebElement buildingStatus;

        //Status Menu Alternative (Investor, Categories)
        @FindBy (xpath = "//*[@id='select2-status-container']")
        public WebElement statusMenuAlt;
            // Status Menu Alternative (Investor, Categories)
                /*
                 Bunlar için status elementlerindeki Pending, Draft ve Rejected kullanılacak
                */

        //ModerationStatus (Properties Section)
        @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/span/span[1]/span/span[1]")
        public WebElement moderationStatusMenu;
            //ModerationStatus Selections
                /*
                 Bunlar için status elementlerindeki Pending, Approved ve Rejected kullanılacak
                */


        //Categories Checkboxes (Projects Section)
            //Apartment
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[1]/label")
            public WebElement apartmentCat;
            //Villa
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[2]/label")
            public WebElement villaCat;
            //Condo
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[3]/label")
            public WebElement condoCat;
            //House
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[4]/label")
            public WebElement houseCat;
            //Commercial property
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[5]/label")
            public WebElement commercialPropertyCat;
            //Single Family Home
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[6]/label")
            public WebElement singleFamilyHomeCat;
            //Townhouse
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[7]/label")
            public WebElement townhouseCat;
            //Land
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[8]/label")
            public WebElement landCat;

        //Create ve edit sayfalarında dönüş teyitleri
            //Save&Exit tuşuna tıklandığında, browser bir önceki sayfaya gelmeli.
            //Tags
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Tags']")
            public WebElement tagsConfirm;
            //Testimonials
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Testimonials']")
            public WebElement testimonialsConfirm;
            //Properties
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Properties']")
            public WebElement propertiesConfirm;
            //Projects
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Projects']")
            public WebElement projectsConfirm;
            //Features
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Features']")
            public WebElement featuresConfirm;
            //Facilities
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Facilities']")
            public WebElement facilitiesConfirm;
            //Investors
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Investors']")
            public WebElement investorsConfirm;
            //Categories
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Categories']")
            public WebElement categoriesConfirm;
            //Types
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Types']")
            public WebElement typesConfirm;
            //Reviews
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Reviews']")
            public WebElement reviewsConfirm;
            //Settings
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Settings']")
            public WebElement settingsConfirm;
            //Success Message Popup of Create, Edit and Delete
                @FindBy (xpath = "//*[@class='toast toast-success']")
                public WebElement successPopup;

        //DAMLA BAŞLANGIÇ
    //Admindashboard Home Page//

    @FindBy (xpath = "//div[@class='page-header navbar navbar-static-top']" )
    public WebElement topNavBar;

    @FindBy(xpath = "//div[@class='page-sidebar navbar-collapse collapse']")
    public WebElement sideBar;

    @FindBy(xpath = "(//span[@class='badge badge-default'])[1]")
    public WebElement topNavBarButton;

    @FindBy(xpath ="/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[14]/a" )
    public WebElement payments;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[15]/a")
    public WebElement locations;

        //Blog Menu Subsections//

    //Categories Button
    @FindBy (id = "cms-plugins-blog-categories")
    public WebElement CategoriesButton;

            //Categories Page Elements

    @FindBy (xpath = "//li[@class='folder-root open'][1]")
    public WebElement houseArchitecture;

    @FindBy(xpath = "//li[@class='folder-root open'][2]")
    public WebElement houseDesign;

    @FindBy(xpath = "//li[@class='folder-root open'][3]")
    public  WebElement buildingMaterials;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/a")
    public WebElement categoriesCreateButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[2]/form/div[2]/input" )
    public WebElement categoriesNameForm;

    @FindBy(xpath = "//*[@class='select-search-full ui-select select2-hidden-accessible']")
    public WebElement categoriesParentForm;

    @FindBy(xpath = "//*[@class='form-control ui-select ui-select is-valid']")
    public WebElement statusDropdownElementi;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[2]/form/div[13]/div[2]/div/button[1]")
    public WebElement saveExit;

    @FindBy(xpath = "(//a[@class='fetch-data category-name'])[2]")
    public WebElement newCategory;

    @FindBy(xpath = "(//a[@class='btn btn-icon btn-danger deleteDialog'])[2]")
    public WebElement cetegoriesTrashButton;

    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement ConfirmDelete;



    //PAYMENTS Menu
       //Transactions
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[14]/ul/li[1]/a")
    public WebElement transactionsAltBaslik;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/div[3]/span")
    public WebElement infoBox;

    //LOCATIONS MENU
         //Cities
    @FindBy(id = "cms-plugins-city")
    public WebElement cities;

    @FindBy(xpath = "//table[@class='table table-striped table-hover vertical-middle dataTable no-footer dtr-inline']")
    public WebElement citiesTable;

    @FindBy(xpath = "//button[@class='btn btn-secondary action-item']")
    public WebElement citiesCreateButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[1]/div[1]/div/div[1]/input")
    public WebElement citiesFormName;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")
    public WebElement citiesFormSlug;

    @FindBy(xpath = "//*[@class='form-control select-search-full ui-select select2-hidden-accessible']")
    public WebElement countryDropdownMenu;

    @FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
    public WebElement citiesSaveExit;

    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement citiesDeleteButton;

    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement citiesEditButton;

    @FindBy(xpath = "(//div[@class='checkbox checkbox-primary table-checkbox'])[1]")
    public WebElement citiesCheckBox;

    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement deletecheckbutton;

        //DAMLA BİTİŞ
        //SERPİL BAŞLANGIÇ




//SERPİL//Admindashboard Home Page//

    //Locations Button
    @FindBy(xpath = "//span[contains(text(), 'Locations')]")
    public WebElement locationsButton;

    //Locations Menu Subsections \\

    // 1. Countries Button
    @FindBy(id = "cms-plugins-country")
    public WebElement countriesButton;

    // 2. States Button
    @FindBy(id = "cms-plugins-state")
    public WebElement statesButton;

    // 3. Cities Button
    @FindBy(id = "cms-plugins-city")
    public WebElement citiesButton;

        //SERPİL BİTİŞ


        //GULNAR
    //payments buttonları.
   @FindBy(xpath = ("//*[@id='cms-plugins-payments']/a/span[1]"))
   public WebElement paymentsButton;

    @FindBy(xpath = ("//*[@id='cms-plugins-payments-all']"))
    public WebElement transactionsButton;

    @FindBy(xpath = ("//*[@id='cms-plugins-payment-methods']/a"))
    public WebElement paymentMethodsButton;

    @FindBy(xpath = ("//*[@id='app']/div[2]/div[1]/div/div[2]/ul/li[5]/a"))
    public WebElement adminProfilDropdown;

    @FindBy(xpath = ("//*[@class='btn-logout']"))
    public WebElement logoutButton;

    @FindBy(xpath = ("//*[@id='app']/div[2]/div[3]/div[2]/div/ol/li[3]"))
    public WebElement paymentMethodsConfirm;

}


