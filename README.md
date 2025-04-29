"# AutomationSimefinalProject"
# AutomationSimefinalProject

This is a Java-based Selenium TestNG project that automates UI tests on the [CodenBox Automation Lab practice site](https://codenboxautomationlab.com/practice/). The project includes a range of test cases covering form elements, windows, alerts, tables, mouse actions, calendars, iFrames, and file downloads.

## Prerequisites

Before running the tests, ensure you have the following installed:

- Java JDK 8 or higher
- Maven
- Google Chrome browser
- ChromeDriver (version compatible with your browser)
- IDE (e.g., IntelliJ IDEA or Eclipse)

## Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/AutomationSimefinalProject.git
   cd AutomationSimefinalProject
Install dependencies This project uses Maven to manage dependencies. Add the following to your pom.xml if not already included:


<dependencies>
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
  </dependency>
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
  </dependency>
</dependencies>
Set ChromeDriver path Ensure chromedriver is added to your system's PATH or specify its location using:


System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
Running Tests
You can run tests via TestNG from your IDE or using Maven:

mvn test
Test Overview
The main class AppTest.java contains multiple test cases, each controlled with the enabled flag:


Test Case	Description
autoCompleteInputTest	Tests autocomplete text input with random country codes.
SelectTag	Tests selection from dropdown menu.
CheckBoxTest	Randomly selects a checkbox from a group.
Window_Example	Tests switching between browser windows.
Switch_Tab_Example	Tests switching between browser tabs.
AlertTest	Tests JavaScript alert acceptance.
ConfirmTest	Tests JavaScript confirm dismissal.
TableTest	Extracts and prints data from a table.
HideAndshow	Tests hiding and showing an input field.
EnableAndDisable	Tests enabling/disabling and inputting text.
MouseHover	Tests mouse hover interactions.
Calender	Navigates and extracts calendar table data.
IFrame	Handles iframe and nested tab switching.
DownloadFile	Clicks a link to download an APK file.
Notes
All tests are disabled by default. To run a specific test, set enabled=true on the @Test annotation.

Add Thread.sleep() only for demo or debug purposes; prefer using explicit waits in production tests.

Author
Created by [Your Name]


Would you like me to format this as an actual file for download, or help you generate the `pom.xml` as well?






You said:
put my name Ali zagibi


ChatGPT said:
Here is your updated README.md file with your name included as the author:


# AutomationSimefinalProject

This is a Java-based Selenium TestNG project that automates UI tests on the [CodenBox Automation Lab practice site](https://codenboxautomationlab.com/practice/). The project includes a range of test cases covering form elements, windows, alerts, tables, mouse actions, calendars, iFrames, and file downloads.

## Prerequisites

Before running the tests, ensure you have the following installed:

- Java JDK 8 or higher
- Maven
- Google Chrome browser
- ChromeDriver (version compatible with your browser)
- IDE (e.g., IntelliJ IDEA or Eclipse)

## Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/AutomationSimefinalProject.git
   cd AutomationSimefinalProject
Install dependencies This project uses Maven to manage dependencies. Add the following to your pom.xml if not already included:


<dependencies>
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
  </dependency>
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
  </dependency>
</dependencies>
Set ChromeDriver path Ensure chromedriver is added to your system's PATH or specify its location using:


System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
Running Tests
You can run tests via TestNG from your IDE or using Maven:


mvn test
Test Overview
The main class AppTest.java contains multiple test cases, each controlled with the enabled flag:


Test Case	Description
autoCompleteInputTest	Tests autocomplete text input with random country codes.
SelectTag	Tests selection from dropdown menu.
CheckBoxTest	Randomly selects a checkbox from a group.
Window_Example	Tests switching between browser windows.
Switch_Tab_Example	Tests switching between browser tabs.
AlertTest	Tests JavaScript alert acceptance.
ConfirmTest	Tests JavaScript confirm dismissal.
TableTest	Extracts and prints data from a table.
HideAndshow	Tests hiding and showing an input field.
EnableAndDisable	Tests enabling/disabling and inputting text.
MouseHover	Tests mouse hover interactions.
Calender	Navigates and extracts calendar table data.
IFrame	Handles iframe and nested tab switching.
DownloadFile	Clicks a link to download an APK file.
Notes
All tests are disabled by default. To run a specific test, set enabled=true on the @Test annotation.

Add Thread.sleep() only for demo or debug purposes; prefer using explicit waits in production tests.

Author
Created by Ali Zagibi 
