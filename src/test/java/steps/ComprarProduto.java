package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ComprarProduto {

private AndroidDriver driver;


      private URL getUrl() {
        try {
          return new URL("https://oauth-jysyamada-b3135:73fa63ef-c169-4d6e-bed9-c62a33691883@ondemand.us-west-1.saucelabs.com:443/wd/hub");
        } catch (MalformedURLException e) {
          e.printStackTrace();
        }
        return null;
      }


    @Before
    public void Iniciar(){
        var options = new BaseOptions()
            .amend("platformName", "Android")
            .amend("appium:platformVersion", "9.0")
            .amend("appium:deviceName", "Samsung Galaxy S9 FHD GoogleAPI Emulator")
            .amend("appium:deviceOrientation", "portrait")
            .amend("appium:app", "storage:filename=mda-2.2.0-25.apk")
            .amend("appium:appPackage", "com.saucelabs.mydemoapp.android")
            .amend("appium:appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity")
            .amend("appium:automationName", "UiAutomator2")
            .amend("browserName", "")
            .amend("appium:ensureWebviewsHavePages", true)
            .amend("appium:nativeWebScreenshot", true)
            .amend("appium:newCommandTimeout", 3600)
            .amend("appium:connectHardwareKeyboard", true);
        
            driver = new AndroidDriver(this.getUrl(), options);


    }

    @After
    public void finalizar() {
        driver.quit();
    }

    @E("que acesso o My Demo App")
    public void que_acesso_o_my_demo_app() {
        // o app foi averto no final do método iniciar
        
    }
    @E("verifico o logo e o nome da secao")
    public void verifico_o_logo_e_o_nome_da_secao() {
        var imgLogo = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/mTvTitle"));
        assertEquals(imgLogo.isDisplayed(), true);

        var lblTituloSecao = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/productTV"));
        assertEquals("Products", lblTituloSecao.getText());

        
    }
    @Dado("localizo o <produto> que esta por <preco>")
    public void localizo_o_produto_que_esta_por_preco() {
        // Home:
        // produto:
        // preço: 
    }
    @Quando("clico na imagem do <num_produto>")
    public void clico_na_imagem_do_num_produto() {
    
    }
    @Entao("verifico o <produto> e o <preco> na tela do produto")
    public void verifico_o_produto_e_o_preco_na_tela_do_produto() {
        // Tela do Produto:
        // botao adicionar no carrinho:

    }
    @Quando("arrasto para cima e clico no botão Add Cart")
    public void arrasto_para_cima_e_clico_no_botão_add_cart() {
        
    }
    @Entao("na tela do carrinho verifico o <produto> <preco> e <quantidade>")
    public void na_tela_do_carrinho_verifico_o_produto_preco_e_quantidade() {
        // Carrinho:
        // Produto:
        // Preço:
        // Quantidade:
    
        
    }
}

//
//android.widget.TextView[@content-desc="Product Title" and @text="Sauce Labs Backpack"]
(//android.widget.TextView[@content-desc="Product Price"])[1]
//final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");var start = new Point(525, 1698);var end = new Point (530, 563);var swipe = new Sequence(finger, 1);
swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
    PointerInput.Origin.viewport(), start.getX(), start.getY()));
swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
    PointerInput.Origin.viewport(), end.getX(), end.getY()));
swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
driver.perform(Arrays.asList(swipe));
com.saucelabs.mydemoapp.android:id/cartBt
com.saucelabs.mydemoapp.android:id/cartTV
com.saucelabs.mydemoapp.android:id/cartIV
com.saucelabs.mydemoapp.android:id/productTV
com.saucelabs.mydemoapp.android:id/titleTV
com.saucelabs.mydemoapp.android:id/priceTV
com.saucelabs.mydemoapp.android:id/itemsTV
com.saucelabs.mydemoapp.android:id/totalPriceTV