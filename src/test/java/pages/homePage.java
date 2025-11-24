package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage{

    WebDriver driver;
    String passwordvar;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //REGISTRO
    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a/span")
    public WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"content\"]/div/a")
    public WebElement btnCreateAccount;


    @FindBy(xpath = "/html/body/main/section/div/div/div/section/div/section/form/div/div[1]/div[1]/label[2]/span/input")
    public WebElement btnTratamiento;

    @FindBy(xpath = "//*[@id=\"field-firstname\"]")
    public WebElement txtFirstName;

    @FindBy(xpath = "//*[@id=\"field-lastname\"]")
    public WebElement txtLastName;

    @FindBy(xpath = "//*[@id=\"field-email\"]")
    public WebElement txtEmail;

    @FindBy(xpath = "//*[@id=\"field-password\"]")
    public WebElement txtPassword;

    @FindBy(xpath = "//*[@id=\"field-birthday\"]")
    public WebElement txtBirthday;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/div/div[8]/div[1]/span/label/input")
    public WebElement btnTermsAndCond;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/div/div[10]/div[1]/span/label/input")
    public WebElement btnPrivacy;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/footer/button")
    public WebElement btnSave;

    //LOGIN


    @FindBy(css = "span.hidden-sm-down")
    public WebElement userLogin;




    //REGISTRO
    public void clickLogin(){
        btnLogin.click();
    }
    public void clickRegister(){ btnCreateAccount.click(); }
    public void clickTratamiento(){ btnTratamiento.click(); }
    public void registerFirstName(String texto){
        txtFirstName.sendKeys(texto);
    }
    public void registerLastName(String texto){
        txtLastName.sendKeys(texto);
    }
    public void registerEmail(String texto){
        txtEmail.sendKeys(texto);
    }
    public void registerPassword(String texto){
        txtPassword.sendKeys(texto);
    }
    public void registerBirthday(String texto){
        txtBirthday.sendKeys(texto);
    }

    public void registerTC(){
        btnTermsAndCond.click();
    }
    public void registerPrivacy(){ btnPrivacy.click(); }
    public void registerSave(){ btnSave.click(); }


    public String encontrarUser() {
        return userLogin.getText().trim();
    }


}
