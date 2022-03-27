package assignment;

public class CheckForCapitalLetter {

    /*
    Method that uses isUpperCase function to check first position in sentence and return Valid
    if its a capital or Not Valid if it is not.
     */
    public String checkStringStartsWithCapital(String input){
        if(!Character.isUpperCase(input.charAt(0))){
            return "Not Valid";
        }else{
            return "Valid";
        }
    }
}
