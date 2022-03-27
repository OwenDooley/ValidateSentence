import assignment.CheckForFullStop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckForFullStopTest {

    CheckForFullStop checkForFullStop = new CheckForFullStop();

    @Test
    public void testForValidCheckIfTheSentenceContainsOnePeriodAtTheEnd(){

        String sentence = "The quick brown fox said hello Mr lazy dog.";

        assertEquals("Valid",  checkForFullStop.endsInFullStop(sentence));

    }

    @Test
    public void testForNotValidCheckIfTheSentenceContainsAPeriodInsideTheSentence(){

        String sentence = "The quick brown fox. said hello Mr lazy dog.";

        assertEquals("Not Valid",  checkForFullStop.endsInFullStop(sentence));

    }

    @Test
    public void testForNotValidCheckIfTheSentenceContainsAPeriodInsideTheSentenceAndNoPeriodAtTheEnd(){

        String sentence = "The quick brown fox said “hello Mr. lazy dog”.";

        assertEquals("Not Valid",  checkForFullStop.endsInFullStop(sentence));

    }

    @Test
    public void testForNotValidCheckIfTheSentenceContainsNoPeriods(){

        String sentence = "The quick brown fox said hello Mr lazy dog";

        assertEquals("Not Valid",  checkForFullStop.endsInFullStop(sentence));

    }



}
