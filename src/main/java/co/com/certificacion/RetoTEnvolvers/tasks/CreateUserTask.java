package co.com.certificacion.RetoTEnvolvers.tasks;


import co.com.certificacion.RetoTEnvolvers.interactions.Wait;
import co.com.certificacion.RetoTEnvolvers.model.CreateUserModel;
import co.com.certificacion.RetoTEnvolvers.userinterface.CreateUserUI;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;

import static co.com.certificacion.RetoTEnvolvers.util.Constants.ZERO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateUserTask implements Task

{
    Faker faker = new Faker();
    String username = faker.name().username();



    private List<CreateUserModel> data;

    public CreateUserTask (List<CreateUserModel> data)
    {
        this.data = data;
    }

    public static CreateUserTask advantage(List<CreateUserModel> createUserModels)
    {
        return Tasks.instrumented(CreateUserTask.class, createUserModels);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {


        CreateUserModel info = data.get(ZERO);
        actor.attemptsTo(
                Click.on(CreateUserUI.CLICKONUSER),
                Wait.por(5000),
                WaitUntil.the(CreateUserUI.CLICKONCREATENEWACCOUNT, isVisible()),
                Click.on(CreateUserUI.CLICKONCREATENEWACCOUNT),
                Click.on(CreateUserUI.CLICKONUSERNAME),
                Enter.theValue(username).into(CreateUserUI.CLICKONUSERNAME),
                //Enter.theValue(info.getUsername()).into(CreateUserUI.CLICKONUSERNAME),
                Click.on(CreateUserUI.CLICKONEMAIL),
                Enter.theValue(info.getEmail()).into(CreateUserUI.CLICKONEMAIL),
                Enter.theValue(info.getPassword()).into(CreateUserUI.CLICKONPASSWORD),
                Enter.theValue(info.getPassword()).into(CreateUserUI.CLICKONCONFIRMPASSWORD),
                Enter.theValue(info.getFirst_name()).into(CreateUserUI.CLICKONFIRSTNAME),
                Enter.theValue(info.getLast_name()).into(CreateUserUI.CLICKONLASTNAME),
                Enter.theValue(info.getPhone()).into(CreateUserUI.CLICKONPHONENUMBER),
                SelectFromOptions.byVisibleText(info.getCountry()).from(CreateUserUI.CLICKONCOUNTRY),
                Enter.theValue(info.getCity()).into(CreateUserUI.CLICKONCITY),
                Enter.theValue(info.getAddress()).into(CreateUserUI.CLICKONADDRESS),
                Enter.theValue(info.getState()).into(CreateUserUI.CLICKONSTATE),
                Enter.theValue(info.getPostal_code()).into(CreateUserUI.CLICKONPOSTALCODE),
                Click.on(CreateUserUI.CLICKONIAGREE),
                Click.on(CreateUserUI.CLICKONREGISTER),





                Wait.por(5000)
        );

    }
}
