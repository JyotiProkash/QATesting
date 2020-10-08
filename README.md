# QA Testing Instruction

**Automated Test scripts:** 
Verify that page title of Statements page.
Verify that all record showing.
Verify search result filtered by specific account.
Verify search result filtered by From date.
Verify search result filtered by To date.
Verify search result filtered by both From date and To date.
Verify search result filtered by date and specific account.
Verify search result without filtering date and specific account.
Verify search result zero for non registered account.

**Test Data:** 
Serial AccountId Money       Date
1	   123	    10.00 EUR	1970-01-01 00:33:40
2	   123	    10.00 EUR	1970-01-01 00:33:40
3	   1234	    10.00 EUR	1970-01-01 00:33:40
4	   1234	    50.00 EUR	1970-01-01 00:33:40
5	   12345	60.00 EUR	1972-12-17 16:12:01
6	   12345	60.00 EUR	2020-10-05 12:03:00
7	   12345	60.00 EUR	2020-10-05 12:05:00

**Environment/Platform/Tools/Language:**
Java
Selenium WebDriver
TestNG
TestNG Extent report
Linux(Ubuntu) 20.04
JDK 1.8
IntelliJIdea Community Edition 2019.3

**Script Writing Information:**
Page Class: Statements 
Location: (src/main/java/com/hybridframework/qa/sourcepages)
Test Class: StatementsTest 
Location: (src/test/java/com/hybridframework/qa/testpages)

**Test Run:**
clean mvn test

**HTML Test Report:**
After test execution, to get test report, visit as follows.
Location: src -> test -> output -> TestReport -> ExtentReport.html

**Final Test Report File:**
TestReport.xls
