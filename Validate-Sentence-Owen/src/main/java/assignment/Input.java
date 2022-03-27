package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    /*
    Using scanner to allow user to input their sentence and then use all
    the validators to check the sentence and return valid if it meets the criteria.
    If all methods return Valid then the program declares the overall Sentence as valid
     */
    public void userInput(){
        ArrayList<String> validList = new ArrayList<String>();

        System.out.println(" ******** Validate your sentence ******** ");

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String input = reader.nextLine();

        //Capital letter check
        CheckForCapitalLetter checkForCapitalLetter = new CheckForCapitalLetter();
        validList.add(checkForCapitalLetter.checkStringStartsWithCapital(input));
        System.out.println("Valid if sentence starts with capital letter: " +checkForCapitalLetter.checkStringStartsWithCapital(input));

        //Even number of quotation marks check
        CheckForEvenNumberOfQuotationMarks checkForEvenNumberOfQuotationMarks = new CheckForEvenNumberOfQuotationMarks();
        validList.add(checkForEvenNumberOfQuotationMarks.checkStringForEvenNumberOfQuotationMarks(input));
        System.out.println("Valid if sentence has even number of quotation marks: " +checkForEvenNumberOfQuotationMarks.checkStringForEvenNumberOfQuotationMarks(input));

        //Check sentence ends with termination character
        CheckForEndingChar checkForEndingChar = new CheckForEndingChar();
        validList.add(checkForEndingChar.checkForSentenceEnding(input));
        System.out.println("Valid if sentence ends in either a Full Stop, Question Mark or Exclamation Mark : " + checkForEndingChar.checkForSentenceEnding(input));

        //Check sentence has no period characters other than the last character.
        CheckForFullStop checkForFullStop = new CheckForFullStop();
        validList.add(checkForFullStop.endsInFullStop(input));
        System.out.println("Valid if sentence has no Full Stop characters other than the last : " + checkForFullStop.endsInFullStop(input));

        //Check for numbers spelled out below 13
        CheckForNumbers checkForNumbers = new CheckForNumbers();
        validList.add(checkForNumbers.numberChecker(input));
        System.out.println("Valid if sentence has no numbers under 13 that aren't spelled out : " + checkForNumbers.numberChecker(input));

        //Printing out if sentence is valid overall
        System.out.println();
        System.out.println("The overall status of the sentence is that it is : " + validCheck(validList));

    }

    /*
    Loops through all counts of Valid returned by the methods. If it contains any count of
    Not Valid then the overall Sentence is deemed Not Valid. If every value in the array is
    Valid then the program deems the overall Sentence as Valid.
     */
    public String validCheck(ArrayList<String> validList){

        String message = "";

        for(int i =0; i<validList.size(); i++){

            if(validList.get(i).equals("Valid")){
                message = "Valid";
            }else {
                message = "Not Valid";
                break;
            }
        }

        return message;

    }
}
