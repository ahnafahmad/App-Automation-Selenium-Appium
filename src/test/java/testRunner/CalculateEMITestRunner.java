package testRunner;

import dataset.Dataset;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.EMICalculatorPage;
import setup.Setup;

public class CalculateEMITestRunner extends Setup {

    EMICalculatorPage emiCalculatorPage;

    @BeforeTest
    public void startEMICalculator() {
        emiCalculatorPage = new EMICalculatorPage(driver);
        emiCalculatorPage.btnStart.click();

    }

    @Test(priority = 1,description = "Verifying the the EMI Calculation is Okay According to DATASET",dataProvider = "data-provider", dataProviderClass = Dataset.class)
    public void doCalculateEMI(int loanAmount, double rInterest, int period, double pFee, int mEMI, int tInterest, int tpFee, int tPayment) throws InterruptedException {

        emiCalculatorPage = new EMICalculatorPage(driver);

        emiCalculatorPage.calculateEMI(loanAmount, rInterest, period, pFee);

        String monthlyEMI = emiCalculatorPage.mEMI.getText();
        String totalInterest = emiCalculatorPage.tInterest.getText();
        String totalProcessingFee = emiCalculatorPage.tpFee.getText();
        String totalpayment = emiCalculatorPage.tPayment.getText();

        monthlyEMI = String.valueOf((int) Math.floor(Double.parseDouble(monthlyEMI.replace(",", ""))));
        totalInterest = String.valueOf((int) Math.floor(Double.parseDouble(totalInterest.replace(",", ""))));
        totalProcessingFee = String.valueOf((int) Math.floor(Double.parseDouble(totalProcessingFee.replace(",", ""))));
        totalpayment = String.valueOf((int) Math.floor(Double.parseDouble(totalpayment.replace(",", ""))));

        Assert.assertEquals(monthlyEMI, String.valueOf(mEMI));
        Assert.assertEquals(totalInterest, String.valueOf(tInterest));
        Assert.assertEquals(totalProcessingFee, String.valueOf(tpFee));
        Assert.assertEquals(totalpayment, String.valueOf(tPayment));

        Thread.sleep(1000);
        emiCalculatorPage.btnReset.click();
        Thread.sleep(1000);
    }


}
