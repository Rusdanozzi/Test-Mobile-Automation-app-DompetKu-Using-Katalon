import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

Mobile.startExistingApplication('com.example.wahidari.dompetku')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (7)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (3)'), 'Gaji Agustus')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (4)'), '2000')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SIMPAN (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (8)'), 0)

Mobile.sendKeys(findTestObject('android.widget.EditText'), 'Makan Agustus')

Mobile.sendKeys(findTestObject('android.widget.EditText (1)'), '1000')

Mobile.tap(findTestObject('android.widget.Button - SIMPAN'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/android.widget.TextView - Rp. 1000'), 'Rp. 1000')

driver = MobileDriverFactory.getDriver()
driver.resetApp()

