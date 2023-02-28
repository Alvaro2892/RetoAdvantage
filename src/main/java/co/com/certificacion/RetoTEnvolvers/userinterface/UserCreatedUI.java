package co.com.certificacion.RetoTEnvolvers.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserCreatedUI
{
    public static final Target VERIRYMESSAGE = Target.the("Verify message").located(By.xpath("(//span[contains(text (), 'DEMO')])"));

}
