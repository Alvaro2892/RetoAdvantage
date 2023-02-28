package co.com.certificacion.RetoTEnvolvers.tasks;

import co.com.certificacion.RetoTEnvolvers.interactions.Wait;
import co.com.certificacion.RetoTEnvolvers.model.CreateUserModel;
import co.com.certificacion.RetoTEnvolvers.userinterface.CreateUserUI;
import co.com.certificacion.RetoTEnvolvers.userinterface.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.certificacion.RetoTEnvolvers.util.Constants.ZERO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task
{

    private List<CreateUserModel> data;


    public LoginTask(List<CreateUserModel> data)
    {
        this.data = data;
    }

    public static LoginTask inadvantage(List<CreateUserModel> createUserModels)
    {
        return Tasks.instrumented(LoginTask.class, createUserModels);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        CreateUserModel info = data.get(ZERO);
        actor.attemptsTo(
                Wait.por(5000),
                Click.on(CreateUserUI.CLICKONUSER),
                WaitUntil.the(LoginUI.CLICKONUSERNAME, isVisible()),
                Enter.theValue(info.getUsername()).into(LoginUI.CLICKONUSERNAME),
                Enter.theValue(info.getPassword()).into(LoginUI.CLICKONPASSWORD),
                WaitUntil.the(LoginUI.CLICKONBUTTONSIGNIN, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LoginUI.CLICKONBUTTONSIGNIN)


        );

    }
}
