package br.com.alelo.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
				monochrome = true,
				snippets = SnippetType.CAMELCASE,
				dryRun = false,
				strict = true,
				features = "src/test/resources/features",
				glue = "br.com.alelo.test.steps",
				tags = {"@fast, @importacao"}
				)
public class Runner {

}