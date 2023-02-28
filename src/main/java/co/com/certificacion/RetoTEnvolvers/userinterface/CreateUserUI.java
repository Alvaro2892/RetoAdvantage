package co.com.certificacion.RetoTEnvolvers.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUserUI
{
    public static final Target CLICKONUSER = Target.the("click on user").located(By.id("menuUser"));
    public static final Target CLICKONCREATENEWACCOUNT = Target.the("click on account").located(By.xpath("(//a[contains(text (), 'CREATE NEW ACCOUNT')])"));
    public static final Target CLICKONUSERNAME = Target.the("click on username").located(By.name("usernameRegisterPage"));
    public static final Target CLICKONEMAIL = Target.the("click on email").located(By.name("emailRegisterPage"));
    public static final Target CLICKONPASSWORD = Target.the("click on PASSWORD").located(By.name("passwordRegisterPage"));
    public static final Target CLICKONCONFIRMPASSWORD = Target.the("click on confirm password").located(By.name("confirm_passwordRegisterPage"));
    public static final Target CLICKONFIRSTNAME = Target.the("click on  firstname").located(By.name("first_nameRegisterPage"));
    public static final Target CLICKONLASTNAME = Target.the("click on  lastname").located(By.name("last_nameRegisterPage"));
    public static final Target CLICKONPHONENUMBER = Target.the("click on  phone number").located(By.name("phone_numberRegisterPage"));
    public static final Target CLICKONCOUNTRY= Target.the("click on  country").located(By.name("countryListboxRegisterPage"));
    public static final Target CLICKONCITY = Target.the("click on  city").located(By.name("cityRegisterPage"));
    public static final Target CLICKONADDRESS = Target.the("click on  address").located(By.name("addressRegisterPage"));
    public static final Target CLICKONSTATE = Target.the("click on  state").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target CLICKONPOSTALCODE = Target.the("click on  postal code").located(By.name("postal_codeRegisterPage"));
    public static final Target CLICKONIAGREE  = Target.the("click on  TYC").located(By.name("i_agree"));
    public static final Target CLICKONREGISTER  = Target.the("click on  register").located(By.id("register_btnundefined"));







}
