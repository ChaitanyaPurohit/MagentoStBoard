# Selenium Automation Framework

[![N|Solid](http://www.seleniumhq.org/images/selenium-logo.png)](http://www.seleniumhq.org/) 

#### This is a Selenium Hybrid Framework.
 - Written in **JAVA** (V - JDK21)
 - Implemented using **TestNG** and **Cucumber**
 - Build Toold - Maven (V - 3.9.9)
 - Implemented Page Object Model Design Pattern
 
### Browsers Supported
*Mozilla Firefox, Google Chrome, Internet Explorer,  Microsoft Edge*

### Headerless Support
 *Chrome Headless, HTMLUnit*

### Platform Support
 - Windows
---
### Reporting
 - [Allure Reporting]([https://allurereport.org/])
 
---
## Features
* Cucumber test case
* Parallel/sequential execution
* Selenium grid support
* Execute through maven, testng.xml, java class[TestRunner.java], feature file
* Auto/customisable reporting
* Scenario context
* Logs support
* Configurable environment
* Interaction helper and wait utils functions
* Controllable browser version
---
 
## Prerequisite

#### Plugins needed
* Cucumber for Java
* Gherkin
* Maven
* TestNG
* Surefire
  
## Test Execution

### We can execute the test in different ways
* Locally
	* Through maven
		* `mvn clean test` to execute test from `testng.xml` through maven.
		* Default value for browser and execType is chrome and local
		* Through `testng.xml`
	* Through the `TestRunner.java` class

In any point the execution in framework is start from `runners.TestRunner.java` class. Test that need to execute are defined in the features files present in the Features folder, The set of test cases are identified by appropriate tag name using the tags section in TestRunner class.

## Test Execution Configurations

* **Execution mode(parallel or sequentially):** In scenarios method in `runners.TestRunner.java` class, we can set if the test need to execute parallel or sequentially. Set the parallel flag to true or false.
	* The default test case count executing at a time is specified in the `testng.xml`, The default value is `2`
* **Report configuration:** Test report high level(suit level) configured will be done through `@BeforeClass` and `@AfterClass` annotations of TestNG inside TestRunner class. Each scenario wise step will be added to report through `stepDef.Hooks`.

**RunnerHelper** class will be shared among `runners.TestRunner` and `runners.FailedTCRunner` class to implement code re-usability.
## Test case creation
Test cases are defined in the Features folder in the form of `.feature` file. The first step in the feature file is used to provide the test data used in the test case. Once we get the appropriate test data we can continue rest of the test step. The testdata fields in the json file should same as the fields present in the model class.

**Test steps(com.stepDef)**
* This package contain all the step defined in the feature file like
	* Reading test data
	* Do the functionality like login, create order etc
## Test reporting:

**Suit level configuration:**
Test report high level(suit level) configured will be done through `@BeforeClass` and `@AfterClass` annotations of TestNG inside TestRunner class. each scenario wise step will be added to report through `stepDef.Hooks`

**Scenario level configuration:**
Each common scenario operations like opening and closing Chrome browser, starting and closing test scenario, Adding screenshots for passed test etc. are done through Cucumber hooks present in the com.stepDef.Hooks class. We are using `@Before` and `@After` hooks of cucumber to achieve this.

## Logs:
We are using `slf4j` to implement `log4j`

## Other utils:
**WaitHelper:** This helper class contains all the type of waits for the framework. like explicit wait etc...

## Test output
* The output of the test execution like order number, payment id etc. can be logged in report for the later use, so 
  didn't create any other mechanism for that.

  # ✳️ Key Features
 
#### 🟨Framework Modular Structure:
The framework follows a `modular design`, allowing you to organize your test cases efficiently.
Implement the `POM design pattern` for cleaner and more maintainable page object classes.
#### 🟨 Configuration Management:
Easily configure `test environments`, `browsers`, and other settings using external `properties files`.
#### 🟨 Selenium WebDriver Integration:
The framework seamlessly integrates with `Selenium WebDriver` for easy web automation.
#### 🟨 TestNG Integration:
Harness the full capabilities of `TestNG` for test `execution`, `parallelization`, and `reporting`.
#### 🟨 Logging and Reporting:
Detailed `logs` and comprehensive test reports help you identify issues quickly.
#### 🟨 Continuous Integration:
Seamlessly integrate your tests with popular `Github Actions` for automated testing.
#### 🟨 Extensibility:
Extend the framework with custom `utilities`, `listeners`, and more to suit  your specific needs.


## Other Features
* Added Same test case with multiple types of data - Scenario outline mode
* Added testng file so that we can control the thread count in parallel mode
* In the current framework we have optimised the page management by combining POM with step def files, By doing so it is easily manageable, also creating new test case require only small effort.
* Added `ActionHelper` class
* Added `WaitHelper` class
* Added gitignore file to ignore unnecessary file tracking

### 🟦 POM(PageObjectModel)

**The `Page Object Model (POM)` is a design pattern commonly used in test automation to enhance the maintainability and reusability of automated tests. It provides a structured way to represent the web pages of an application as objects in the test code.**

####  Benefits of POM:

#### 🟨 Modularity: 
POM divides the application into manageable, modular components, making it easier to create and maintain tests.
#### 🟨 Reduced Code Duplication:
 Reusable Page Objects reduce code duplication across test cases, leading to more efficient test development.
#### 🟨 Enhanced Collaboration:
 Testers and developers can collaborate effectively as they work with well-defined Page Objects.
#### 🟨 Scalability:
 POM scales well with growing test suites, ensuring maintainability as the project evolves.
#### 🟨 Improved Debugging:
 Isolating issues to specific Page Objects simplifies the debugging process.

**In summary, the `Page Object Model (POM)` is a design pattern that promotes a structured and maintainable approach to web test automation. By representing web pages as Page Objects, it enhances code readability, reusability, and maintainability while reducing code duplication.**

