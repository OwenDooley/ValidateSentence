package assignment;

public class CheckForEvenNumberOfQuotationMarks {


    /*
    Method declares a char with value being a quotation mark. Uses countChar function
    to count the amount of Quotation Marks and modular function with 2 to find out if even.
    If it equals 0 then there is even amount and returns Valid and if not there is an
    odd amount and returns Not Valid
     */
    public String checkStringForEvenNumberOfQuotationMarks(String input){

        char quotationMark = '"';

       int quotationMarkCount = countChar(input, quotationMark);

       if(quotationMarkCount % 2 == 0){
           return "Valid";
       }else{
           return "Not Valid";
       }


    }


    /*
    Method to Loop through String and count the char given in the parameter
     */
    public static int countChar(String input, char c){

        int counter = 0;

        for(int i =0; i<input.length(); i++){
            if(input.charAt(i)== c){
                counter++;
            }
        }


        return counter;
    }


}
