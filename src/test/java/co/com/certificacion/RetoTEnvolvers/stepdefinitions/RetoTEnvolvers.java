package co.com.certificacion.RetoTEnvolvers.stepdefinitions;

import co.com.certificacion.RetoTEnvolvers.model.CreateUserModel;
import co.com.certificacion.RetoTEnvolvers.questions.VerifyBuySuccess;
import co.com.certificacion.RetoTEnvolvers.tasks.Additems;
import co.com.certificacion.RetoTEnvolvers.tasks.CreateUserTask;
import co.com.certificacion.RetoTEnvolvers.tasks.Start;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetoTEnvolvers
{

    @Given("^that the user opens the browser and searches the requested website$")
    public void thatTheUserOpensTheBrowserAndSearchesTheRequestedWebsite()
    {
        theActorCalled("Alvaro").wasAbleTo(Start.webSite());
    }

    @When("^he enters and looks for the desired item, he selects it and takes it to the shopping cart$")
    public void heEntersAndLooksForTheDesiredItemHeSelectsItAndTakesItToTheShoppingCart(List<CreateUserModel> data)
    {
        theActorInTheSpotlight().attemptsTo(Additems.ToShoppingCart(data));

    }

    @Then("^verify that your product is in the shopping cart and with the corresponding value (.*)$")
    public void verifyThatYourProductIsInTheShoppingCartAndWithTheCorrespondingValue(String messagetoverify)
    {
        theActorInTheSpotlight().should(seeThat(VerifyBuySuccess.inAdvantage(messagetoverify)));

    }

}
