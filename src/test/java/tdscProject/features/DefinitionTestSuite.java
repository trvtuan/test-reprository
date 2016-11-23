package tdscProject.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {
//        "src/test/resources/features/CartPage.feature",
        "src/test/resources/features/Header.feature",
////        "src/test/resources/features/Footer.feature",
//        "src/test/resources/features/LogInRegister.feature",
//        "src/test/resources/features/MyAccount.feature",

        })
public class DefinitionTestSuite {}
