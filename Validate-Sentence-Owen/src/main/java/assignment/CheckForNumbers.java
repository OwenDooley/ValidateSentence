package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
Numbers 1-12 declared in array. Used check method to loop through sentence and add all
numbers to numList array. Compare numList Array with numbers array. If any of the numbers
in numList are in numbers array then Message is not valid otherwise Message is valid
 */
public class CheckForNumbers {

        public String numberChecker(String input){

            List<String> numbers = Arrays.asList("1", "2", "3", "4","5","6","7","8","9","10", "11", "12");

            String message = "";

            List<String> numList =check(input);

            //Stop array being empty
            if(!numList.isEmpty()) {
                for (int i = 0; i < numList.size(); i++) {
                    if (numbers.contains(numList.get(i))) {
                        message = "Not Valid";
                        break;
                    } else {
                        message = "Valid";
                    }
                }
            }else{
                message = "Valid";
            }


          return message;

        }

        /*
        Search through array and return any digits found and add
        to String array
         */
        public List<String> check(String input){

            List<String> numbers = new ArrayList<>();

            Pattern p = Pattern.compile("-?\\d+");
            Matcher m = p.matcher(input);
            while (m.find()) {
                numbers.add(m.group());
            }

            return numbers;

        }



}
