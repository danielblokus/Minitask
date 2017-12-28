package luongvo.com.todolistminimal;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import luongvo.com.todolistminimal.Pages.Home;
import luongvo.com.todolistminimal.Pages.SignIn;
import static luongvo.com.todolistminimal.Utils.Delay.waitFor;

/**
 * Created by Daniel Blokus on 30.09.2017.
 *
 * ./gradlew clean connectedDebugAndroidTest
 * adb uninstall luongvo.com.todolistminimal
 * adb uninstall luongvo.com.todolistminimal.test
 */

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SignInTest {

    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void successfulWithEmail() throws InterruptedException {
        waitFor(500);
        new SignIn().withCredentials();
        waitFor(500);
        new Home(); //check if home is displayed
    }

}