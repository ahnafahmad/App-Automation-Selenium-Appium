package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static setup.Setup.PACKAGE_NAME;

public class EMICalculatorPage {

    @FindBy(id = PACKAGE_NAME + ":id/layout_emi")
    public AndroidElement btnStart;
    @FindBy(id = PACKAGE_NAME + ":id/etLoanAmount")
    AndroidElement txtLoanAmount;
    @FindBy(id = PACKAGE_NAME + ":id/etInterest")
    AndroidElement txtInterest;
    @FindBy(id = PACKAGE_NAME + ":id/etPeriod")
    AndroidElement txtPeriod;
    @FindBy(id = PACKAGE_NAME + ":id/etEMI")
    AndroidElement txtEMIAmount;
    @FindBy(id = PACKAGE_NAME + ":id/etFee")
    AndroidElement txtProcessingFee;
    @FindBy(id = PACKAGE_NAME + ":id/btnCalculate")
    AndroidElement btnCalculate;
    @FindBy(id = PACKAGE_NAME + ":id/btnReset")
    public AndroidElement btnReset;


    @FindBy(id = PACKAGE_NAME + ":id/monthly_emi_result")
    public AndroidElement mEMI;
    @FindBy(id = PACKAGE_NAME + ":id/total_interest_result")
    public AndroidElement tInterest;
    @FindBy(id = PACKAGE_NAME + ":id/processing_fee_result")
    public AndroidElement tpFee;
    @FindBy(id = PACKAGE_NAME + ":id/total_payment_result")
    public AndroidElement tPayment;

    public EMICalculatorPage(AndroidDriver driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void calculateEMI(int loanAmount, double interest, int period, double processingFee) {

        txtLoanAmount.sendKeys("" + loanAmount + "");
        txtInterest.sendKeys("" + interest + "");
        txtPeriod.sendKeys("" + period + "");
        txtProcessingFee.sendKeys("" + processingFee + "");
        btnCalculate.click();

    }


}
