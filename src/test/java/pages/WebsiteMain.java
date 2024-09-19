package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebsiteMain {
    public WebsiteMain() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // CAN BAŞLANGIÇ
// Listing Butonu
    @FindBy(linkText = "Listing")
    public WebElement listingButton;

    // CAN BİTİŞ

    //KEVSER BAŞLANGIÇ
////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

//Header Bölümü Ortak Elementler\\

////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[4]/a")
    public WebElement agentsButton;

    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[7]/a")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[@href=\"https://qa.hauseheaven.com/login\"]")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[@href=\"https://qa.hauseheaven.com/\"])[3]")
    public WebElement homeButton;

    @FindBy(xpath = "//*[@href=\"https://qa.hauseheaven.com/projects\"]")
    public WebElement projectsButton;

    @FindBy(xpath = "//*[@href=\"https://qa.hauseheaven.com/blog\"]")
    public WebElement blogButton;

    @FindBy(xpath = "(//*[@href=\"https://qa.hauseheaven.com/contact\"])[1]")
    public WebElement contactButton;

    @FindBy(xpath = "//*[@class='text-success']")
    public WebElement addPropertyButton;

    // kullanıcı adı-soyadı yazan kısım
    @FindBy(xpath = "//*[@href=\"https://qa.hauseheaven.com/account/dashboard\"]")
    public WebElement userDashboardButton;


    @FindBy(xpath = "(//*[@class='login-item'])[2]")
    public WebElement LogoutButton;

//================== HEADER ORTAK ELEMENTLER BURAYA KADAR =======================


    // Anasayfa 'Find Accessible Homes To Rent' yazısı

    @FindBy(xpath = "//h1[text()='Find accessible homes to rent']")
    public WebElement findAccessibleYazisi;

    // 'Blog' sayfa başlığı yazısı
    @FindBy(xpath = "//h1[text()='Blog']")
    public WebElement blogYazisi;

    // 'Contact' sayfa başlığı yazısı
    @FindBy(xpath = "//h1[text()='Contact']")
    public WebElement contactYazisi;

    // Add Property sayfası title text box
    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement titleTextBox;

    // Header bölümü
    @FindBy(xpath = "//*[@class='nav-menus-wrapper']")
    public WebElement headerBolumu;


    //KEVSER BİTİŞ
    //ÜMİT BAŞLANGIC
    // Main Page Web Elements
    @FindBy(xpath = "//*[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement mainPageCookies;

    @FindBy(xpath = "//div[@class='hero-search-wrap']")
    public WebElement mainPageSearchModule;

    @FindBy(xpath = "//*[@placeholder='Search for a location']")
    public WebElement searchLocationBar;

    @FindBy(xpath = "//*[@id='select2-minprice-container']")
    public WebElement minPriceBar;

    @FindBy(xpath = "//*[@id='select2-maxprice-container']")
    public WebElement maxPriceBar;

    @FindBy(xpath = "//*[@id='select2-ptypes-container']")
    public WebElement propertyTypeBar;

    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
    public WebElement propertyTypeArrow;

    @FindBy(xpath = "//*[@id='select2-select-bedroom-container']")
    public WebElement bedroomsBar;

    @FindBy(xpath = "//*[@id='select2-city_id-container']")
    public WebElement propertyLocationBar;

    @FindBy(xpath = "//*[@class='btn search-btn']")
    public WebElement searchResultBar;

    @FindBy(xpath = "//*[@class='m-0']")
    public WebElement foundResultText;

    @FindBy(xpath = "(//*[@class='sec-heading center'])[1]")
    public WebElement howItWorksText;

    @FindBy(xpath = "(//*[@class='sec-heading center'])[2]")
    public WebElement exploreGoodPlacesText;

    @FindBy(xpath = "(//*[@class='slick-slide slick-current slick-active'])[1]")
    public WebElement goodPlaceImage1;

    @FindBy(xpath = "//*[@title='Unparalleled Residence with Forever Central Park Views']")
    public WebElement residenceTitle;

    @FindBy(xpath = "(//*[@class='slick-slide slick-current slick-active'])[2]")
    public WebElement goodPlaceImage2;

    @FindBy(xpath = "//*[@title='9876 Elmwood Avenue']")
    public WebElement elmwoodTitle;

    @FindBy(xpath = "(//*[@class='slick-slide slick-current slick-active'])[3]")
    public WebElement goodPlaceImage3;

    @FindBy(xpath = "//*[@title='9876 Pine Avenue']")
    public WebElement pineAvenueTitle;

    @FindBy(xpath = "(//*[@class='property-listing property-2 '])[3]")
    public WebElement pineAvenueModul;

    @FindBy(xpath = "(//*[@class='slick-slide slick-current slick-active'])[4]")
    public WebElement goodPlaceImage4;

    @FindBy(xpath = "//*[@title='2468 Pine Street']")
    public WebElement pineStreetTitle;

    @FindBy(xpath = "(//*[@class='slick-slide slick-current slick-active'])[5]")
    public WebElement goodPlaceImage5;

    @FindBy(xpath = "//*[@title='13579 Elmwood Avenue']")
    public WebElement elmwood2Title;

    @FindBy(xpath = "//*[@class='prt-detail-title-desc']")
    public WebElement elmwood2PageTitle;

    @FindBy(xpath = "//*[@title='13579 Willow Street']")
    public WebElement willowStreetTitle;

    @FindBy(xpath = "(//*[@class='slick-slide slick-current slick-active'])[6]")
    public WebElement goodPlaceImage6;

    @FindBy(xpath = "(//*[@class='prt-view'])[1]")
    public WebElement viewButton1;

    @FindBy(xpath = "(//*[@class='prt-view'])[2]")
    public WebElement viewButton2;

    @FindBy(xpath = "(//*[@class='prt-view'])[3]")
    public WebElement viewButton3;

    @FindBy(xpath = "(//*[@class='prt-view'])[4]")
    public WebElement viewButton4;

    @FindBy(xpath = "(//*[@class='prt-view'])[5]")
    public WebElement viewButton5;

    @FindBy(xpath = "(//*[@class='prt-view'])[6]")
    public WebElement viewButton6;

    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[1]")
    public WebElement wishListButton1;

    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[2]")
    public WebElement wishListButton2;

    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[3]")
    public WebElement wishListButton3;

    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[4]")
    public WebElement wishListButton4;

    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[5]")
    public WebElement wishListButton5;

    @FindBy(xpath = "//*[@id='alert-container']")
    public WebElement wishListAddText;

    @FindBy(xpath = "(//*[@class='add-to-wishlist'])[6]")
    public WebElement wishListButton6;

    @FindBy(xpath = "(//*[@class='btn btn-theme-light-2 rounded'])[1]")
    public WebElement browseMorePropertiesBar;

    @FindBy(xpath = "(//*[@class='sec-heading center'])[3]")
    public WebElement findByLocationText;

    @FindBy(xpath = "//*[@data-src='https://qa.hauseheaven.com/storage/denver-400xauto.jpg']")
    public WebElement denverImage;

    @FindBy(xpath = "(//*[@class='ti-angle-right'])[1]")
    public WebElement denverRightArrow;

    @FindBy(xpath = "//*[@data-src='https://qa.hauseheaven.com/storage/phoenix-400xauto.jpg']")
    public WebElement phoenixImage;

    @FindBy(xpath = "(//*[@class='ti-angle-right'])[2]")
    public WebElement phoenixRightArrow;

    @FindBy(xpath = "//*[@data-src='https://qa.hauseheaven.com/storage/miami-400xauto.jpg']")
    public WebElement miamiImage;

    @FindBy(xpath = "(//*[@class='ti-angle-right'])[3]")
    public WebElement miamiRightArrow;

    @FindBy(xpath = "(//*[@class='location-property-wrap'])[4]")
    public WebElement newYorkModule;

    @FindBy(xpath = "(//*[@class='location-property-content'])[4]")
    public WebElement newYorkPropertyContent;

    @FindBy(xpath = "//*[@data-src='https://qa.hauseheaven.com/storage/newyork-400xauto.jpg']")
    public WebElement newyorkImage;

    @FindBy(xpath = "(//*[@class='ti-angle-right'])[4]")
    public WebElement newyorkRightArrow;

    @FindBy(xpath = "//*[@data-src='https://qa.hauseheaven.com/storage/seattle-400xauto.jpg']")
    public WebElement seattleImage;

    @FindBy(xpath = "(//*[@class='ti-angle-right'])[5]")
    public WebElement seattleRightArrow;

    @FindBy(xpath = "//*[@data-src='https://qa.hauseheaven.com/storage/austin-400xauto.jpg']")
    public WebElement austinImage;

    @FindBy(xpath = "(//*[@class='ti-angle-right'])[6]")
    public WebElement austinRightArrow;

    @FindBy(xpath = "//*[@class='m-0']")
    public WebElement austinPageFoundResultText;

    @FindBy(xpath = "(//*[@class='location-property-wrap'])[6]")
    public WebElement austinModule;

    @FindBy(xpath = "//*[@data-src='https://qa.hauseheaven.com/storage/chicago-400xauto.jpg']")
    public WebElement chicagoImage;

    @FindBy(xpath = "(//*[@class='ti-angle-right'])[7]")
    public WebElement chicagoRightArrow;

    @FindBy(xpath = "//*[@data-src='https://qa.hauseheaven.com/storage/los-angeles-400xauto.jpg']")
    public WebElement losAngelesImage;

    @FindBy(xpath = "(//*[@class='ti-angle-right'])[8]")
    public WebElement losAngelesRightArrow;

    @FindBy(xpath = "(//*[@class='btn btn-theme-light-2 rounded'])[2]")
    public WebElement browseByLocationBar;

    @FindBy(xpath = "(//*[@class='sec-heading center'])[4]")
    public WebElement goodReviewsText;

    @FindBy(xpath = "//*[@class='smart-textimonials smart-center slick-initialized slick-slider']")
    public WebElement reviewsSlideElement;

    @FindBy(xpath = "(//*[@class='sec-heading center'])[5]")
    public WebElement packagesText;

    @FindBy(xpath = "(//*[@class='pricing-wrap  standard-pr '])[1]")
    public WebElement freeFirstPostElement;

    @FindBy(xpath = "(//*[@class='pricing-wrap  standard-pr '])[2]")
    public WebElement fivePostElement;

    @FindBy(xpath = "//*[@class='pricing-wrap  platinum-pr recommended ']")
    public WebElement singlePostElement;
    @FindBy(xpath = "(//*[@class='pricing-bottom'])[1]")
    public WebElement freeFirstChoosePlan;
    @FindBy(xpath = "(//*[@class='pricing-bottom'])[2]")
    public WebElement singlePostChoosePlan;
    @FindBy(xpath = "(//*[@class='pricing-bottom'])[3]")
    public WebElement fivePostChoosePlan;
    @FindBy(xpath = "//*[@class='smart-textimonials smart-center slick-initialized slick-slider']")
    public WebElement goodReviewsSlideElement;
    @FindBy(xpath = "(//*[@class='smart-tes-content'])[5]")
    public WebElement reviewByCustomer;
    @FindBy(xpath = "//*[@id='alert-container']")
    public WebElement scrollBarElement;
    @FindBy(xpath = "//*[@class='ipt-title']")
    public WebElement agentsDetailPageButton;
    @FindBy(xpath = "//*[@class='fr-position']")
    public WebElement propertiesResultButton;
    @FindBy(xpath = "//*[@class='ti-email']")
    public WebElement agentsMessageBoxButton;
  
    //ÜMİT BİTİŞ


    //  ====================  Arzuv  ====================
    // Clicking on every menu, navigates to a new page XPaths'

    @FindBy(xpath = "//*[@class='hero-search']")
    public WebElement homePageButton;

    @FindBy(xpath = "//*[@class ='ipt-title']")
    public WebElement propertiesPageButton;

    @FindBy(xpath = "//*[@id='app']/div/div/div/div/div/h2")
    public WebElement allProjectsPageButton;

    @FindBy(xpath = "//*[@class ='ipt-title']")
    public WebElement allAgentsPageButton;

    @FindBy(xpath = "//*[@class='ipt-title']")
    public WebElement blogPageButton;

    @FindBy(xpath = "//*[@class='ipt-title']")
    public WebElement contactPageButton;

    @FindBy(xpath = "//*[@class='text-center']")
    public WebElement signUpPageButton;

    @FindBy(xpath = ("//*[@id='navigation']/div[2]/ul[1]/li[5]/a"))
    public WebElement getBlogButton;

    @FindBy(xpath = ("//*[@id='app']/section/div/div[2]/div/div/div[1]/div[1]/div/div[3]/h4/a"))
    public WebElement Blogatiklama;

    @FindBy(xpath = "//*[@class='fr-grid-footer-flex-right']")
    public WebElement agentsViewTagButton;

    // arzuv end

    //SERPİL BAŞLANGIÇ.....\\

    // HEADER NAME ELEMENT
    @FindBy(xpath = "(//li[@class='login-item'])[1]")
    public WebElement headerNameElement;

  
     //FOOTER

   @FindBy(xpath = "//i[@class='fas fa-map-marker-alt']" )
   public WebElement navigationElement;

   @FindBy(xpath = "//i[@class='fas fa-phone-square']")
   public WebElement telephoneElement;

   @FindBy(xpath = "//i[@class='fas fa-envelope']")
   public WebElement emailElement;

   //ABOUT US
   @FindBy(xpath = "//a[@title='About us']")
   public WebElement aboutUsElement;
  
   @FindBy(xpath = "//a[@title='Contact us']")
   public WebElement contactUsElement;

   @FindBy(xpath = "//a[@title='Terms & Conditions']")
   public WebElement termsConditionsElement;

   @FindBy(xpath = "//a[@title='All properties']")
   public WebElement allPropertiesElement;

   @FindBy(xpath = "//a[@title='Houses for sale']")
   public WebElement housesForSailElement;

   @FindBy(xpath = "//a[@title='Houses for rent']")
   public WebElement housesforRentElement;


   @FindBy(xpath = "//a[@title='The Benefits Of Investing In Emerging Real Estate Markets']")
   public WebElement newsFirstElement;

   @FindBy(xpath = "//a[@title='A Guide To Negotiating The Best Deal On Your Dream Home']")
   public WebElement newsSecondElement;


   @FindBy(xpath = "//a[@title='The Rise Of Sustainable Homes: Building For A Greener Future']")
   public WebElement newsThirdElement;

   @FindBy(xpath = "//a[@title='How to Stage Your Home for a Quick and Profitable Sale']")
   public WebElement newsFourthElement;

   @FindBy(xpath = "(//div[@class='other-store-app'])[1]")
   public WebElement googlePlayElement;

   @FindBy(xpath = "(//div[@class='other-store-app'])[2]")
   public WebElement appStoreElement;

   @FindBy(xpath = "//input[@name='email']")
   public WebElement subscribeBox;

   @FindBy(xpath = "//button[@class='js-cookie-consent-agree cookie-consent__agree']")
   public WebElement cookiesButton;

   @FindBy(xpath = "//button[@class='btn bg-dark text-white']")
   public WebElement subscribeButton;

   @FindBy(xpath = "//i[@class='ti-facebook']")
   public WebElement facebookIcon;

   @FindBy(xpath = "//a[@title='Twitter']")
   public WebElement twitterIcon;

   @FindBy(xpath = "//a[@title='Instagram']")
   public WebElement instagramIcon;

   @FindBy(xpath = "//a[@title='Linkedin']")
   public WebElement linkedinIcon;

   @FindBy(xpath = "//a[@title='Pinterest']")
   public WebElement pinterestIcon;

    //   ============= agents =============
    @FindBy (xpath = "//*[@id=\'app\']/section/div/div[1]/div[5]/div/div[1]/div[2]/div[1]/h5/a")
    public WebElement fifthAgentsNameButton;
    @FindBy (xpath = "//*[@src='https://qa.hauseheaven.com/storage/ac5.jpg']")
    public WebElement fifthAgentImgButton;
    @FindBy (xpath = "//*[@class='agency-name']")
    public WebElement agentHazelPageButton;
    @FindBy (xpath = "//*[@class='prt-detio']")
    public WebElement hazelsPropertyButton;



}