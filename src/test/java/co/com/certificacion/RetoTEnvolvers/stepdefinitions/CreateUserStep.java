package co.com.certificacion.RetoTEnvolvers.stepdefinitions;

import co.com.certificacion.RetoTEnvolvers.model.CreateUserModel;
import co.com.certificacion.RetoTEnvolvers.questions.UserCreatedQuestion;
import co.com.certificacion.RetoTEnvolvers.tasks.CreateUserTask;
import co.com.certificacion.RetoTEnvolvers.tasks.LoginTask;
import co.com.certificacion.RetoTEnvolvers.tasks.Start;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUserStep
{
    @Given("^that a user wants to enter the web page and create a user$")
    public void thatAUserWantsToEnterTheWebPageAndCreateAUser()
    {
        theActorCalled("Alvaro").wasAbleTo(Start.webSite());
    }

    @When("^he enters and fills in all the data on the registration form$")
    public void heEntersAndFillsInAllTheDataOnTheRegistrationForm(List<CreateUserModel> data)
    {
        theActorInTheSpotlight().attemptsTo(CreateUserTask.advantage(data));
        //theActorInTheSpotlight().attemptsTo(LoginTask.inadvantage(data));
    }

    @Then("^Verify that the user was created correctly (.*)$")
    public void verifyThatTheUserWasCreatedCorrectly(String questionv)
    {
        theActorInTheSpotlight().should(seeThat(UserCreatedQuestion.wasCreate(questionv)));
    }
}
