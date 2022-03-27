import assignment.CheckForNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckForNumbersTest {

    CheckForNumbers checkForNumbers = new CheckForNumbers();

    @Test
    public void testForValidCheckIfNumberIsSpelledOut(){

        String sentence = "One lazy dog is too few, eleven is too many";

        assertEquals("Valid", checkForNumbers.numberChecker(sentence));

    }
    @Test
    public void testForNotValidCheckIfNumberIsNotSpelledOut(){

        String sentence = "One lazy dog is too few, 4 is too many.";

        assertEquals("Not Valid", checkForNumbers.numberChecker(sentence));

    }
    @Test
    public void testForNotValidCheckIfNumberWhenSentenceContains12(){

        String sentence = "One lazy dog is too few, 12 is too many.";

        assertEquals("Not Valid", checkForNumbers.numberChecker(sentence));

    }

    @Test
    public void testForValidCheckIfNumberIsSpelledOutButOver12(){

        String sentence = "15 lazy dog is too few, four is too many.";

        assertEquals("Valid", checkForNumbers.numberChecker(sentence));

    }

    @Test
    public void testForNotValidCheckIfThereAreMultipleNumbersWithOneBeingBetweenUnder13(){

        String sentence = "4 lazy dogs is too few, 15 is too many.";

        assertEquals("Not Valid", checkForNumbers.numberChecker(sentence));

    }



}
