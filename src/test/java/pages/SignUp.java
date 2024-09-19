package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUp {
    public SignUp(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //KEVSER

    @FindBy(id = "first_name")
    public WebElement firsNameBox;

    @FindBy(id = "last_name")
    public WebElement lastNameBox;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "password-confirm")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement registerButton;

    @FindBy(xpath = "//h4[text()='Your Current Credits: ']")
    public WebElement yourCurrentCreditYazisi;


}
