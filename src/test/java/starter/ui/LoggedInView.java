package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedInView {

    public static Target profileLinkButton  = Target
            .the("Profile Button")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Tab5, tab, 5 of 5\"]/android.view.ViewGroup/android.widget.ImageView"));
}
