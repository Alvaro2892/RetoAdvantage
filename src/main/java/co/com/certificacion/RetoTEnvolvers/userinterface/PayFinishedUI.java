package co.com.certificacion.RetoTEnvolvers.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PayFinishedUI
{
    public static final Target VERIRYMESSAGEBUYFINISHED = Target.the("Verify message").located(By.xpath("(//span[contains(text (), 'Thank you for buying with Advantage')])"));

}
