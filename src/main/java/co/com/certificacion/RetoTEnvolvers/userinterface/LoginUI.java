package co.com.certificacion.RetoTEnvolvers.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI
{
    public static final Target CLICKONUSERNAME = Target.the("click on username").located(By.name("username"));
    public static final Target CLICKONPASSWORD = Target.the("click on PASSWORD").located(By.name("password"));
    public static final Target CLICKONBUTTONSIGNIN = Target.the("click on sign in").located(By.id("sign_in_btnundefined"));




}
