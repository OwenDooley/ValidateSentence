
import assignment.Input;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class InputTest {
    Input input = new Input();
    ArrayList<String> validList = new ArrayList<String>();
    @Test
    public void testForOverallValidCheckWhenAllValidatorsAreValid(){

        validList.add("Valid");
        validList.add("Valid");
        validList.add("Valid");
        validList.add("Valid");
        validList.add("Valid");


        assertEquals("Valid",  input.validCheck(validList));

    }

    @Test
    public void testForOverallValidCheckWhenAllValidatorsExcept1AreValid(){

        validList.add("Valid");
        validList.add("Valid");
        validList.add("Valid");
        validList.add("Not Valid");
        validList.add("Valid");


        assertEquals("Not Valid",  input.validCheck(validList));

    }

    @Test
    public void testForOverallValidCheckWhenAllValidatorsExcept2AreValid(){


        validList.add("Not Valid");
        validList.add("Valid");
        validList.add("Valid");
        validList.add("Not Valid");
        validList.add("Valid");


        assertEquals("Not Valid",  input.validCheck(validList));

    }

    @Test
    public void testForOverallValidCheckWhenAllValidatorsAreNotValid(){

        validList.add("Not Valid");
        validList.add("Not Valid");
        validList.add("Not Valid");
        validList.add("Not Valid");
        validList.add("Not Valid");


        assertEquals("Not Valid",  input.validCheck(validList));

    }
}
