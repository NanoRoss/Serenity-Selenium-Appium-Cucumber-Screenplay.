package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.LoginView;


public class Login implements Task {

    public final String user;
    public final String password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(user).into(LoginView.username),
                SendKeys.of(password).into(LoginView.password),
                Click.on(LoginView.button)
        );
    }
}
