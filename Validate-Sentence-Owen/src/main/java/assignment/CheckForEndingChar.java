package assignment;

public class CheckForEndingChar {

    /*
    Uses endsWith function to return valid if String ends with . or ? or !
    or returns Not Valid if it does not
     */
    public String checkForSentenceEnding(String input){
        if(input.endsWith(".")  || input.endsWith("?")  || input.endsWith("!")){
            return "Valid";
        }else{
            return "Not Valid";
        }
    }
}
