package com.hybridframework.qa.testpages;

import com.hybridframework.qa.sourcepages.Statements;
import com.hybridframework.qa.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

/**
 * Created by Jyoti 07/10/2020
 */

public class StatementsTest extends TestBase {

    public Statements st;

    public StatementsTest() throws IOException{
      }

    @Test(priority = 1)
    public void verifyPageTitleOfStatementsPage()
      {
        st= PageFactory.initElements(driver, Statements.class);
        Assert.assertEquals(driver.getTitle(),"Welcome!");
      }

    @Test(priority = 2)
    public void verifyThatAllRecordShowing()
      {
          st= PageFactory.initElements(driver, Statements.class);
          System.out.println("All records:"+st.displayAllRecord());
      }

    @Test(priority = 3)
    public void verifySearchResultFilteredBySpecificAccount()
      {
        st= PageFactory.initElements(driver, Statements.class);
        st.SearchResultFilteredBySpecificAccount("12345");
        st.clickSearchButton();
        System.out.println("Search Result Filtered By specific account:"+st.displayAllRecord());
      }
    @Test(priority = 4)
    public void verifySearchResultFilteredByFromDate()
      {
          st= PageFactory.initElements(driver, Statements.class);
          st.SearchResultFilteredByFromDate("1970-01-01 00:33:40");
          st.clickSearchButton();
          System.out.println("Search Result Filtered By From Date:"+st.displayAllRecord());
      }

    @Test(priority = 5)
    public void verifySearchResultFilteredByToDate()
      {
          st= PageFactory.initElements(driver, Statements.class);
          st.SearchResultFilteredByToDate("1972-12-17 16:12:01");
          st.clickSearchButton();
          System.out.println("Search Result Filtered By To Date:"+st.displayAllRecord());
      }

    @Test(priority = 6)
    public void verifySearchResultFilteredByFromDateAndToDate()
      {
        st= PageFactory.initElements(driver, Statements.class);
        st.SearchResultFilteredByFromDateAndToDate("1970-01-01 00:33:40","2020-10-05 12:03:00");
        st.clickSearchButton();
        System.out.println("Search Result Filtered By From and To Date:"+st.displayAllRecord());
      }

    @Test(priority = 7)
    public void verifySearchResultFilteredByDateAndSpecificAccount()
      {
        st= PageFactory.initElements(driver, Statements.class);
        st.SearchResultFilteredByDateAndSpecificAccount("12345","1970-01-01 00:33:40","2020-10-05 12:05:00");
        st.clickSearchButton();
        System.out.println("Search Result Filtered By Date and Specific Account:"+st.displayAllRecord());

      }
    @Test(priority = 8)
    public void verifySearchResultWithoutFilteringDateAndSpecificAccount()
      {
        st= PageFactory.initElements(driver, Statements.class);
        st.clearAllField();
        st.clickSearchButton();
        System.out.println("Search Results without Filtering Date And SpecificAccount:"+st.displayAllRecord());
      }

    @Test(priority = 9)
    public void verifySearchResultZeroForNonRegisteredAccount()
    {
        st= PageFactory.initElements(driver, Statements.class);
        st.SearchResultFilteredBySpecificAccount("J12345");
        st.clickSearchButton();
        Assert.assertEquals(st.displayAllRecord(),0);
        System.out.println("Search Result:"+st.displayAllRecord());
    }

}
