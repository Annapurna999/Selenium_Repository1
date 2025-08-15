package Com.ShoppersStack_GenericUtility;

public interface FrameWorkConstants {

	JavaUtility javaUtility = new JavaUtility();

	static final String propertyFilePath = "./src/test/resources/TestData/ShoppersStackTestData.properties";

	static final String excelFilePath = "./src/test/resources/TestData/ShoppersStackTestData.xlsx";

	static final String screenShotPath = "./screenShot/" + javaUtility.getLocalDateAndTime() + ".png";

	static final String reportsPath = "./reports/" + javaUtility.getLocalDateAndTime() + ".html";

	static final String chromeKey = "webdriver.chrome.driver";

	static final String chromeValue = "./src/main/resources/driver/chromedriver.exe";
}
