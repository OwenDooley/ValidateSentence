import assignment.CheckForCapitalLetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckForCapitalLetterTest {

    CheckForCapitalLetter checkForCapitalLetter = new CheckForCapitalLetter();

    @Test
    public void testForValidCheckWithSentenceStartingWithACapital(){

        String sentence = "The quick brown fox said hello Mr lazy dog.";

        assertEquals("Valid", checkForCapitalLetter.checkStringStartsWithCapital(sentence));

    }

    @Test
    public void testForNotValidCheckWithSentenceNotStartingWithACapital(){

        String sentence = "the quick brown fox said hello Mr lazy dog.";

        assertEquals("Not Valid", checkForCapitalLetter.checkStringStartsWithCapital(sentence));

    }




}
