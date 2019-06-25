$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:SignIn.feature");
formatter.feature({
  "name": "Sign In",
  "description": "  as a user of the site\n  I want to sign in to my account",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigating to accounts page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteStepDef.i_am_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the SignIn button",
  "keyword": "When "
});
formatter.match({
  "location": "SiteStepDef.i_click_the_SignIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The accounts page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteStepDef.the_accounts_page_displays()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the accounts page",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteStepDef.i_am_on_the_accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am not logged in",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_am_not_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Email address is registered",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.email_address_is_registered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password matches email address",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.password_matches_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "When "
});
formatter.match({
  "location": "SiteStepDef.i_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The SignIn page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteStepDef.the_SignIn_page_displays()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my status becomes logged in",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.my_status_becomes_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Incorrect password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the accounts page",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteStepDef.i_am_on_the_accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am not logged in",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_am_not_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Email address is registered",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.email_address_is_registered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password does not match email address",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.password_does_not_match_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "When "
});
formatter.match({
  "location": "SiteStepDef.i_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_enter_password()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: keys should be a string\n  (Session info: chrome\u003d75.0.3770.100)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.10.0\u0027, revision: \u0027176b4a9\u0027, time: \u00272018-03-02T19:03:16.397Z\u0027\nSystem info: host: \u0027LT-LON-W016\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\rrajeev\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:58195}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.100, webStorageEnabled: true}\nSession ID: dcb7c7f9e425ed4558d3c0c68aa9b98c\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:100)\r\n\tat com.spartaglobal.cucumberminiproject.sitepages.AccountPage.enterSignInPassword(AccountPage.java:42)\r\n\tat com.spartaglobal.cucumberminiproject.stepdefs.SiteStepDef.i_enter_password(SiteStepDef.java:62)\r\n\tat ✽.I enter password(classpath:SignIn.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The authentication page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteStepDef.i_remain_on_the_accounts_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "my status remains logged out",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.my_status_remains_logged_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I recieve error message \"Authentication failed.\"",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_receive_error_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the accounts page",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteStepDef.i_am_on_the_accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am not logged in",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_am_not_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Email address is registered",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.email_address_is_registered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password is too short",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.password_is_too_short()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "When "
});
formatter.match({
  "location": "SiteStepDef.i_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The authentication page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteStepDef.i_remain_on_the_accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my status remains logged out",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.my_status_remains_logged_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I recieve error message \"Invalid password.\"",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_receive_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid email",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the accounts page",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteStepDef.i_am_on_the_accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am not logged in",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_am_not_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Email address is too short",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.email_address_is_too_short()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password matches email address",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.password_matches_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "When "
});
formatter.match({
  "location": "SiteStepDef.i_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The authentication page displays",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteStepDef.i_remain_on_the_accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my status remains logged out",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.my_status_remains_logged_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I recieve error message \"Invalid email address.\"",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_receive_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:basket.feature");
formatter.feature({
  "name": "Adding to basket",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding item  to basket from home screen",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteStepDef.i_am_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see a grid of items",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_see_a_grid_of_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover over on and item",
  "keyword": "When "
});
formatter.match({
  "location": "SiteStepDef.i_hover_over_on_and_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.click_Add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "That item gets added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteStepDef.that_item_gets_added_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding a dress from the dresses category page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the the dresses category page",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteStepDef.i_am_on_the_the_dresses_category_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Add to cart button under the printed summer dress",
  "keyword": "When "
});
formatter.match({
  "location": "SiteStepDef.i_click_the_Add_to_cart_button_under_the_printed_summer_dress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a printed summer dress gets added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteStepDef.a_printed_summer_dress_gets_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding a size medium printed dress",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the page for the printed dress",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteStepDef.i_am_on_the_page_for_the_printed_dress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the size to be medium",
  "keyword": "When "
});
formatter.match({
  "location": "SiteStepDef.i_select_the_size_to_be_medium()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_click_Add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a size medium printed dress gets added to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteStepDef.a_size_medium_printed_dress_gets_added_to_the_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding 3 printed dresses to basket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the page for the printed dress",
  "keyword": "Given "
});
formatter.match({
  "location": "SiteStepDef.i_am_on_the_page_for_the_printed_dress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change the quantity to 3",
  "keyword": "When "
});
formatter.match({
  "location": "SiteStepDef.i_change_the_quantity_to(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SiteStepDef.i_click_Add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "3 printed dresses gets added to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "SiteStepDef.printed_dresses_gets_added_to_the_basket(Integer)"
});
formatter.result({
  "status": "passed"
});
});