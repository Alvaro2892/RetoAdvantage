package co.com.certificacion.RetoTEnvolvers.runners;



import cucumber.api.CucumberOptions;
        import cucumber.api.SnippetType;
        import net.serenitybdd.cucumber.CucumberWithSerenity;
        import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Advantage.feature",
        glue = {"co.com.certificacion.RetoTEnvolvers.stepdefinitions","co.com.certificacion.RetoTEnvolvers.util"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}