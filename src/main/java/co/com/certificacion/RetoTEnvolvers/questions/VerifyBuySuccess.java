package co.com.certificacion.RetoTEnvolvers.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.certificacion.RetoTEnvolvers.userinterface.PayFinishedUI.VERIRYMESSAGEBUYFINISHED;

public class VerifyBuySuccess implements Question<Boolean>
{
    String word;

    public VerifyBuySuccess(String word)
    {
        this.word = word;
    }

    public static VerifyBuySuccess inAdvantage(String messagetoverify)
    {
        return new VerifyBuySuccess(messagetoverify);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Text.of(VERIRYMESSAGEBUYFINISHED).viewedBy(actor).asString().replaceAll("\n", " ");
        return word.equals(text);
    }
}
