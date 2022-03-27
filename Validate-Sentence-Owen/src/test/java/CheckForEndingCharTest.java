import assignment.CheckForEndingChar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckForEndingCharTest {

    CheckForEndingChar checkForEndingChar = new CheckForEndingChar();

    @Test
    public void testForValidCheckWithSentenceEndingWithAQuestionMark(){

        String sentence = "How many \"lazy dogs\" are there?";

        assertEquals("Valid", checkForEndingChar.checkForSentenceEnding(sentence));

    }

    @Test
    public void testForValidCheckWithSentenceEndingWithAnExclamationMark(){

        String sentence = "How many \"lazy dogs\" are there!";

        assertEquals("Valid", checkForEndingChar.checkForSentenceEnding(sentence));

    }

    @Test
    public void testForValidCheckWithSentenceEndingWithAPeriod(){

        String sentence = "How many \"lazy dogs\" are there.";

        assertEquals("Valid", checkForEndingChar.checkForSentenceEnding(sentence));

    }

    @Test
    public void testForNotValidCheckWithSentenceEndingWithoutTerminationCharacter(){

        String sentence = "How many \"lazy dogs\" are there";

        assertEquals("Not Valid", checkForEndingChar.checkForSentenceEnding(sentence));

    }

    @Test
    public void testForNotValidCheckWithSentenceEndingWithSemicolon(){

        String sentence = "How many \"lazy dogs\" are there;";

        assertEquals("Not Valid", checkForEndingChar.checkForSentenceEnding(sentence));

    }



}
