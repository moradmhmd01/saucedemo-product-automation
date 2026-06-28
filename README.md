Project Title: SauceDemo Web Automation Framework

The Challenge: Automating an end-to-end user scenario (Adding an item to a cart) while handling modern browser security limitations (Google's data breach popups) and asynchronous web loading speeds.

The Stack: Java, Selenium WebDriver, JUnit 5, Maven.

Project Architecture: Page Object Model (POM)This project uses the Page Object Model (POM) design pattern. Instead of writing all our code in one messy file, we separate the web pages from the test scenarios.

The Page Classes (LoginPage.java, InventoryPage.java): These files hold the web locators (like IDs and class names) and the actions a user can take on that page. We keep the web elements private (applying Encapsulation), meaning they can only be interacted with through safe, public methods like login() or addBackpackToCart().

The Test Class (AddToCartTest.java): This file contains only the test scenario steps and validations. It has no idea what the HTML structure of the page looks like; it simply calls the page classes to execute the actions and asserts the final outcome.
