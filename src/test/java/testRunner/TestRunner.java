package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/salesLogin.feature", glue = {
		"stepDefinitons" }, monochrome = true, plugin = { "pretty", "html:target/HtmlReprots" }

)
public class TestRunner {

}
