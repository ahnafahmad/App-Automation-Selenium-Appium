# EMI Calculator App Automation Selenium Appium

## An [EMI calculator](https://play.google.com/store/apps/details?id=com.continuum.emi.calculator) is automated by testing with varities of datasets and whether it gives correct results with correct data.Appium is utilized on an emulated device powered by Android Studio.

Here the following tasks are done:
- An EMI Calculator app extracted from [EMI calculator](https://play.google.com/store/apps/details?id=com.continuum.emi.calculator) is automated by extracting its apk.
- Different data is tested where user gives Amount,Interest,Period and Processing fee and hits Calculate button.
- The monthly EMI,total interest ,processing fee and total payment generated are matched with the expected data provided in the dataset.
- Dataset Testing is performed on a minor scale to check whether the system handles varieties of data to give correct result or not.
- It is tested for five different data and a reset button will be pressed after a test case with a single data is executed.

## Technology: </br>
- Tool: Selenium Webdriver
- IDE: Intellij, Android Studio
- Build tool: Gradle
- Language: Java
- Test_Runner: Appium

## Prerequisites</br>
- Install Android Studio latest version
- Install Appium 1.17.1
- Install jdk 8 or any LTS version
- Configure **ANDROID_HOME**, **JAVA_HOME** and **GRADLE_HOME**
- Stable internet connection

## Project Run

### Appium
- Turn on **Developer Options** on your android phone
- Connect your android phone with USB cable/ Create an emulated virtual device via Android Studio and run it.
- Open cmd and give ```adb devices``` command to get uuid.
- Open Appium and start server. Then open inspector tool.
- In the **JSON Representation** section, paste the following desired capabilities after adding your uuid and version:
- 
```
  "deviceName": "My Device",
  "platformName": "Android",
  "uuid": Enter your uuid here,
  "platformVersion": Enter your android version,
  "appPackage": "com.continuum.emi.calculator",
  "appActivity": "com.finance.emicalci.activity.Splash_screnn"
```
- Click **Start Server**.

## Java IDE
- Clone this Project [App-Automation-with-Selenium-Appium](https://github.com/ahnafahmad/App-Automation-Selenium-Appium.git)

## Screenshot of the overall project run in appium**

 ![EMI-9](https://user-images.githubusercontent.com/58990500/202900631-07fc758d-70c8-443d-aef5-03fa11e2b09b.PNG)<br><br>

- After automation to view allure report , give the following commands:
 ```
allure generate allure-results --clean -o allure-report
allure serve allure-results
 ```
 
## Here is the Allure report overview:**

![EMI-1](https://user-images.githubusercontent.com/58990500/202900666-176ae918-dd63-4dce-ba41-cdb7a6773a1b.PNG)


![EMI-8](https://user-images.githubusercontent.com/58990500/202900686-129fae2a-a47a-4bb1-8bb8-576e75e3ef39.PNG)


![EMI-2](https://user-images.githubusercontent.com/58990500/202900691-2231d067-4aec-401f-aa77-7ce19bb3a725.PNG)


![EMI-3](https://user-images.githubusercontent.com/58990500/202900697-ec4ad9cd-cd1f-4fae-be21-864f87300b0f.PNG)


![EMI-4](https://user-images.githubusercontent.com/58990500/202900700-b9c46b37-639e-4c7f-994c-ae92d84fb77d.PNG)


![EMI-5](https://user-images.githubusercontent.com/58990500/202900702-283ef8c9-86b8-4c68-a301-ca00b05d0f29.PNG)


![EMI-6](https://user-images.githubusercontent.com/58990500/202900709-40db7de0-0a5c-4415-b1c4-a35b2d095f57.PNG)


![EMI-7](https://user-images.githubusercontent.com/58990500/202900714-a7c93267-1114-414e-ad4b-6e01cb7f22d9.PNG)<br><br><br>


## Watch the Project video and test run:<br><br>

Uploading EMI Calculator Output Video.mp4…


