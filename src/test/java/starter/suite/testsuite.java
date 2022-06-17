package starter.suite;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.sampleSteps;

@RunWith(SerenityRunner.class)
public class testsuite {
    @Steps
    sampleSteps sampleSteps;

    @Test
    public void testrun() {
        sampleSteps.runtest();
    }





}
