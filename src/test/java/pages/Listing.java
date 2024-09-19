package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Listing {

    public Listing() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // CAN YILMAZ'a ait
    //Number of Result
    @FindBy (className = "m-0")
    public static WebElement numberOfResult;

    @FindBy (xpath = "//a[@class='prt-view']")
    public List<WebElement> viewButton;

    @FindBy (xpath = "//a[@class='prt-link-detail']")
    public List<WebElement> titleOfAProperty;

    @FindBy (xpath = "(//h3)[1]")
    public WebElement titleAfterClickingOnView;

    @FindBy (xpath = "//h6[@class='listing-card-info-price']")
    public List<WebElement> preiseOfAProperty;

    @FindBy (className = "prt-price-fix" )
    public WebElement preiseAfterClickingOnView;

    @FindBy (id= "select2-select-type-container")
    public WebElement typeDropDown;

    @FindBy (xpath = "//input[@class='select2-search__field']")
    public WebElement dropDownYazmaYeri;

    @FindBy (xpath = "//span[@id='select2-minprice-container']")
    public WebElement searchBoxMinPriceDropDownMenu;

    @FindBy (xpath = "//span[@id='select2-maxprice-container']")
    public WebElement searchBoxMaxPriceDropDownMenu;

    @FindBy (xpath = "/html/body/div[2]/div[4]/section/div/div[2]/div[1]/div/div[2]/div/form/div[9]/div[2]/ul/li[1]/label")
    public WebElement wifi;

    @FindBy (xpath = "/html/body/div[2]/div[4]/section/div/div[2]/div[1]/div/div[2]/div/form/div[9]/div[2]/ul/li[3]/label")
    public WebElement swimmingpool;

    @FindBy (xpath = "//*[@id=\"filters-form\"]/button")
    public WebElement findNewHomeButton;

    @FindBy (className = "m-0")
    public  WebElement numberOfResultHome;

   @FindBy (xpath = "//*[@id='app']/section/div[2]/div[1]/div[2]/div[1]/ul/li[1]/a")
   public WebElement shareButton;

    @FindBy (xpath = "//textarea[@class='form-control ht-80']")
    public WebElement commentTextArea;

    @FindBy (xpath = "//*[@id=\"clTen\"]/div/form/div[2]/div[2]/div/button")
    public WebElement submitReview;

    @FindBy (xpath = "//*[@id=\"name\"]")
    public WebElement nameForm;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement emailForm;

    @FindBy (xpath = "//*[@id=\"consult-form\"]/div/div[2]/input")
    public WebElement phoneForm;

    @FindBy (xpath = "//*[@id=\"consult-form\"]/div/div[5]/textarea")
    public WebElement contentForm;

    @FindBy (xpath = "//*[@id=\"consult-form\"]/div/div[6]/button")
    public WebElement sendForm;

    @FindBy (xpath = "//*[@id=\"select2-sort_by-container\"]/span")
    public WebElement sortByButton;
    @FindBy (xpath = "/html/body/span/span/span[1]/input")
    public WebElement sortByButtonInput;

    @FindBy(xpath = "//*[@id=\"app\"]/section/div/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/h4/a")
    public WebElement headOfFirstProperty;

    @FindBy(xpath = "//a[@class='cl-facebook']")
    public WebElement facebookButton;
    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div[1]/div[2]/div[1]/ul/li[2]/a")
    public WebElement wishList;






    //CAN YILMAZ'a ait buraya kadar  1-100

//SERPİL ................\\






































































































    // KEVSER

    // 'Properties' sayfa başlığı yazısı
    @FindBy(className = "ipt-title")
    public WebElement propertiesYazisi;

    // ilk ilandaki 'View' butonu
    @FindBy(xpath = "(//*[@class='prt-view'])[1]")
    public WebElement ilkViewButton;

    // facebook yazısı
    @FindBy(xpath = "//*[@href=\"https://www.facebook.com/\"]")
    public WebElement facebookYazisi;

    // 'Save' butonu
    @FindBy(xpath = "//*[@class='btn btn-likes add-to-wishlist']")
    public WebElement saveButton;

    // wishlist'e kayıtlı element sayısı yazısı
    @FindBy(xpath = "(//*[@class='wishlist-count'])[1]")
    public WebElement wishlistSayisi;

    // 'Write a Review' yazisi
    @FindBy(xpath = "(//*[@class='property_block_wrap_header'])[7]")
    public WebElement writeAReviewYazisi;

    // 'Service' bölümü 3.yıldız
    @FindBy(xpath = "(//*[@data-rating-value='3'])[1]")
    public WebElement serviceYildiz3;

    // 'Value For Money' bölümü 3.yıldız
    @FindBy(xpath = "(//*[@data-rating-value='3'])[2]")
    public WebElement valueForMoneyYildiz3;

    // 'Location' bölümü 3.yıldız
    @FindBy(xpath = "(//*[@data-rating-value='3'])[3]")
    public WebElement locationYildiz3;

    // 'Cleanliness' bölümü 3.yıldız
    @FindBy(xpath = "(//*[@data-rating-value='3'])[4]")
    public WebElement cleanlinessYildiz3;

    // 'Average Rating' yazısı
    @FindBy(xpath = "//*[@class='high user_commnet_avg_rate']")
    public WebElement averageRatingYazisi;

    // 'Messages' kutusu
    @FindBy(xpath = "//*[@name='comment']")
    public WebElement messagesBox;

    // son yorum
    @FindBy(xpath = "(//*[@class='comment-text'])[1]")
    public WebElement sonYorum;



    // KEVSER BİTİŞ

}