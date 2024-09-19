package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Agents {

    public Agents(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //KEVSER
    @FindBy(xpath = "(//*[@class='fr-can-name'])[1]")
    public WebElement ilkAgentIsimElementi;

    @FindBy(xpath = "(//*[text()='Phone:'])[1]")
    public WebElement ilkAgentTelefonNo;

    @FindBy(xpath = "(//*[text()='Email:'])[1]")
    public  WebElement ilkAgentEmail;

    @FindBy(xpath = "//*[@href=\"mailto:agent@hauseheaven.com\"]")
    public WebElement ilkAgentIlanSayisi;

    @FindBy(xpath = "(//*[@class='ti-email'])[1]")
    public WebElement ilkAgentMailButonu;

    @FindBy(xpath = "//*[@class='col-lg-12 col-md-12']")
    public WebElement allAgentsYazisi;


}
