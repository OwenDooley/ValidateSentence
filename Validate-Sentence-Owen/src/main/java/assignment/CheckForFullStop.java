package assignment;

import org.apache.commons.lang3.StringUtils;

public class CheckForFullStop {

    /*
    Uses Chop function to remove the last character in sentence.
    This allows the method to return true if the sentence doesnt contain a Full stop
    anywhere as the last character won't return a false positive as contains function
    checks entire string
     */
    public String endsInFullStop(String input){

       String shortSentence = StringUtils.chop(input);

       //Adding method so that it doesnt return as Not Valid when Question mark or Exclamation Mark used to end sentence
       CheckForEndingChar checkForEndingChar = new CheckForEndingChar();

        if(checkForEndingChar.checkForSentenceEnding(input).equals("Valid") && !shortSentence.contains(".")){
            return "Valid";
        }else{
            return "Not Valid";
        }


    }

}
