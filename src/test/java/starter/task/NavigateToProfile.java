package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebElement;
import starter.ui.LoggedInView;

public class NavigateToProfile  implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoggedInView.profileLinkButton)
        );

    }
}
