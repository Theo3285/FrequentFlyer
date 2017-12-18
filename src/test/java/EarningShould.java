import com.kata.tdd.model.FrequentFlyer;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class EarningShould {

    private FrequentFlyer member;

    @Test
    @Parameters({
            "John, Doe, Bronze, 0, 30, Bronze",
            "John, Doe, Bronze, 0, 300, Silver",
            "John, Doe, Bronze, 100, 200, Silver",
            "John, Doe, Silver, 0, 700, Gold",
            "John, Doe, Gold, 0, 1500, Platinum"
    })
    public void calculateStatus(String firstName, String lastName, String status, int points, int earned, String expected) {
        member = FrequentFlyerBuilder
                .aMember()
                .named(firstName,lastName)
                .withStatus(status)
                .andPoints(points)
                .earned(earned)
                .build();
        assertThat(member.getStatus(), is(expected));
    }
}
