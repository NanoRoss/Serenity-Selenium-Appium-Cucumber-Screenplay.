package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import starter.task.Login;
import starter.task.NavigateToLogin;
import starter.task.NavigateToProfile;
import starter.ui.LoggedInView;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.ui.LoggedInView.profileLinkButton;

public class LogInStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("User use Login Link")
    public void user_use_LoginLink() {
        theActorCalled("User").attemptsTo(
                new NavigateToLogin()
        );
    }

    @When("User send his credentials with username {string} and password {string}")
    public void user_send_his_credential(String user, String pass){
        theActorInTheSpotlight().attemptsTo(
                new Login(user,pass)
        );
    }

    @Then("User see Profile Button")
    public void validate_login_successfully() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(profileLinkButton).isDisplayed());
    }

    @Then("User not see Profile Button")
    public void validate_login_unsuccessfully() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(profileLinkButton).isNotDisplayed());
    }

}
