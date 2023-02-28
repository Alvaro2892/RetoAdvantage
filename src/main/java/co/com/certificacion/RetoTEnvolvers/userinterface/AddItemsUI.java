package co.com.certificacion.RetoTEnvolvers.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddItemsUI
{
    public static final Target CLICKONTABLETS = Target.the("CLICK ON SECTION TABLETS sobre la opción Content").located(By.id("tabletsImg"));
    public static final Target CLICKONSPEAKERS = Target.the("CLICK ON SECTION TABLETS sobre la opción Content").located(By.id("speakersImg"));

    public static final Target SCROLLONTABLETS = Target.the("SCROLL ").located(By.xpath("*//h3[@class='categoryTitle roboto-regular sticky ng-binding']"));
    public static final Target CLICKONTABLETHPPRO = Target.the("CLICK ON TABLE HP PRO").located(By.xpath("(*//a[@class='productPrice ng-binding'])[3]"));
    public static final Target CLICKONADDTOCART = Target.the("CLICK ON ADD TO CART ").located(By.xpath("(//button[contains(text (), 'ADD TO CART')])"));
    public static final Target CLICKONHOME = Target.the("CLICK ON HOME ").located(By.xpath("(//span[contains(text (), 'DEMO')])"));
    public static final Target CLICKONMENUCART = Target.the("CLICK ON MENU CART ").located(By.id("menuCart"));
    public static final Target CLICKONCHECKOUT = Target.the("CLICK ON CHECK OUT ").located(By.id("checkOutButton"));
    public static final Target CLICKONBUTTONNEXT = Target.the("click on next").located(By.id("next_btn"));
    public static final Target CLICKONBUTTONPAYNOW = Target.the("click on pay now").located(By.id("pay_now_btn_MasterCredit"));
    public static final Target PRICEOFTABLET = Target.the("PRICE OF TABLE").located(By.xpath("(*//p[@class = 'price roboto-regular ng-binding'])[4]"));
    public static final Target CLICKONADDTOCARTT = Target.the("CLICK ON ADD TO CART ").located(By.name("save_to_cart"));

    public static final Target PRICEOFTABLETHPELITE = Target.the("PRICE OF TABLE").located(By.xpath("(*//a[@class = 'productPrice ng-binding'])[3]"));
    public static final Target PRICEOFTABLETHPELITEV = Target.the("PRICE OF TABLEt").located(By.xpath("(*//p[@class = 'price roboto-regular ng-binding'])[3]"));
    public static final Target PRICETOTAL = Target.the("PRICE TOTAL").located(By.xpath("(*//span[@class = 'roboto-medium totalValue ng-binding'])"));








}

