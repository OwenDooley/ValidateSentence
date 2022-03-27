import assignment.CheckForEvenNumberOfQuotationMarks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckForEvenNumberOfQuotationMarksTest {

    CheckForEvenNumberOfQuotationMarks checkForEvenNumberOfQuotationMarks = new CheckForEvenNumberOfQuotationMarks();

    @Test
    public void testForValidCheckWithEvenNumberOfQuotationMarks(){

        String sentence = "The quick brown fox said \"hello Mr lazy dog\".";

        assertEquals("Valid", checkForEvenNumberOfQuotationMarks.checkStringForEvenNumberOfQuotationMarks(sentence));

    }
    @Test
    public void testForNotValidCheckWithOddNumberOfQuotationMarks(){

        String sentence = "The quick brown fox said \"hello Mr lazy dog.";

        assertEquals("Not Valid", checkForEvenNumberOfQuotationMarks.checkStringForEvenNumberOfQuotationMarks(sentence));

    }



}
