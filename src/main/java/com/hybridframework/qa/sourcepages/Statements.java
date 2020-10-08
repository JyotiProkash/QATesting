package com.hybridframework.qa.sourcepages;

import com.hybridframework.qa.helper.javascript.JavaScriptHelper;
import com.hybridframework.qa.helper.logger.LoggerHelper;
import com.hybridframework.qa.helper.wait.WaitHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jyoti 07/10/2020
 */
public class Statements
  {
      private WebDriver driver;
      private final Logger log= LoggerHelper.getLogger(Statements.class);
      WaitHelper waitHelper;

      public Statements(WebDriver driver) throws IOException
        {
            this.driver=driver;
            PageFactory.initElements(driver,this);
            waitHelper=new WaitHelper(driver);
            waitHelper.waitForElement(searchButton,10,2000);
        }

      @FindBy(css ="button.btn.btn-primary")
      WebElement searchButton;

      @FindBy(xpath ="//table[@class='table']/tbody/tr")
      List<WebElement> recordAllRow;

      @FindBy(id ="search_account_id")
      WebElement accountIdField;

      @FindBy(name ="from_date")
      WebElement fromDateField;

      @FindBy(name ="to_date")
      WebElement toDateField;

      // Method Clear all filed data
      public void clearAllField()
        {
            accountIdField.clear();
            fromDateField.clear();
            toDateField.clear();
        }

      // Method Display all record
      public int displayAllRecord()
        {
            int totalRecord=recordAllRow.size();
            return totalRecord;
        }
      // Method filtered by specific account
      public void SearchResultFilteredBySpecificAccount(String accountId)
        {
            clearAllField();
            accountIdField.sendKeys(accountId);
        }
      // Method filtered by from date
      public void SearchResultFilteredByFromDate(String fromDate)
        {
            clearAllField();
            fromDateField.sendKeys(fromDate);
        }
      // Method filtered by To date
      public void SearchResultFilteredByToDate(String toDate)
        {
            clearAllField();
            toDateField.sendKeys(toDate);
        }

      // Method filtered by From date and To date
      public void SearchResultFilteredByFromDateAndToDate(String fromDate, String toDate)
        {
            clearAllField();
            fromDateField.sendKeys(fromDate);
            toDateField.sendKeys(toDate);
        }

      // Method filtered by From date and To date with specific Account
      public void SearchResultFilteredByDateAndSpecificAccount(String accountId, String fromDate, String toDate)
        {
          clearAllField();
          accountIdField.sendKeys(accountId);
          fromDateField.sendKeys(fromDate);
          toDateField.sendKeys(toDate);
        }

      // Method search button action event
      public void clickSearchButton()
        {
            searchButton.click();
            waitHelper.pageLoadTime(10, TimeUnit.SECONDS);

        }

  }
