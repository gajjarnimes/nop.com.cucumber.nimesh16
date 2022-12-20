package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class BuildYourOwnComputer extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputer.class.getName());

    public BuildYourOwnComputer() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']//h1")
    WebElement productNameText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//li/label")
    List<WebElement> hDDRadios;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']//li/label")
    List<WebElement> oSRadios;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li/label")
    List<WebElement> softwareCheckBoxes;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartBtn;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddeMessage;


    public String getProductNameText() {
        String message = getTextFromElement(productNameText);
        log.info("Get product Name Text : " + productNameText.toString());
        return message;
    }

    public void selectProcessor(String processorName) {
        selectByVisibleTextFromDropDown(processor, processorName);
        log.info("Select Processor :" + processor);

    }

    public void selectRam(String ramGB) {
        log.info("Select Ram" + ram.toString());
        selectByVisibleTextFromDropDown(ram, ramGB);

    }

    public void selectHDD(String hDdGB) {
        for (WebElement hdd : hDDRadios) {
            if (hdd.getText().equals(hDdGB)) {
                clickOnElement(hdd);
                log.info("select HDD " + hdd.toString());
                break;
            }
        }
    }

    public void selectOS(String oSName) {
        for (WebElement os : oSRadios) {
            if (os.getText().equals(oSName)) {
                clickOnElement(os);
                log.info("select OS" + os.toString());
                break;
            }
        }
    }

    public void selectSoftware(String softwareName) {
        for (WebElement software : softwareCheckBoxes) {
            if (software.getText().equals(softwareName)) {
                clickOnElement(software);
                log.info("select Software : " + software.toString());
                break;
            }
        }
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartBtn);
        log.info("click On AddToCart Button " + addToCartBtn.toString());

    }

    public String getProductAddedMessage() {
        String message = getTextFromElement(productAddeMessage);
        log.info("Get ProductAdded Message " + productAddeMessage);
        return message;
    }
}
