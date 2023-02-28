package co.com.certificacion.RetoTEnvolvers.tasks;

import co.com.certificacion.RetoTEnvolvers.interactions.Wait;
import co.com.certificacion.RetoTEnvolvers.model.CreateUserModel;
import co.com.certificacion.RetoTEnvolvers.userinterface.AddItemsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;


import java.util.List;




public class Additems implements Task
{



    private List<CreateUserModel> data;

    public Additems (List<CreateUserModel> data)
    {
        this.data = data;
    }


        public static Additems ToShoppingCart(List<CreateUserModel> createUserModel){
            return Tasks.instrumented(Additems.class, createUserModel);
        }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.attemptsTo
                (
                    LoginTask.inadvantage(data),
                    Click.on(AddItemsUI.CLICKONTABLETS),
                    Scroll.to(AddItemsUI.SCROLLONTABLETS),
                    Click.on(AddItemsUI.CLICKONTABLETHPPRO),
                    Click.on(AddItemsUI.CLICKONADDTOCART),
                    Click.on(AddItemsUI.CLICKONHOME),
                    Click.on(AddItemsUI.CLICKONSPEAKERS),
                    Scroll.to(AddItemsUI.SCROLLONTABLETS),
                    Click.on(AddItemsUI.PRICEOFTABLETHPELITE),
                    Click.on(AddItemsUI.CLICKONADDTOCARTT),
                    Click.on(AddItemsUI.CLICKONMENUCART),
                    Click.on(AddItemsUI.CLICKONCHECKOUT),
                    Click.on(AddItemsUI.CLICKONBUTTONNEXT)
                 );

        String FirstItems = Text.of(AddItemsUI.PRICEOFTABLET).viewedBy(actor).asString().replaceAll("[^0-9]", "");
        String SecondItems = Text.of(AddItemsUI.PRICEOFTABLETHPELITEV).viewedBy(actor).asString().replaceAll("[^0-9]", "");
        String Total = Text.of(AddItemsUI.PRICETOTAL).viewedBy(actor).asString().replaceAll("[^0-9]", "");
        Integer ItemsFirst  = Integer.valueOf(FirstItems);
        Integer ItemsSconds  = Integer.valueOf(SecondItems);
        Integer TotalItems  = Integer.valueOf(Total);
        Integer TotalItemsD = ItemsFirst + ItemsSconds + 18000;

        actor.attemptsTo(
                Check.whether(TotalItemsD.equals(TotalItems))
                        .andIfSo(Click.on(AddItemsUI.CLICKONBUTTONPAYNOW)),
                Wait.por(5000)
        );





    }
}
