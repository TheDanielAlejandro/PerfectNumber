public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        if(number >= 1){                                 //1. Check if the value is >=1 and if not print false
            int container;                               //2. Creating the variable to store the output of the module
            int result = 0;

            for(int i = 1; i < number; i++){             //3. Creating a loop to divide the number (input) by the index i (n) number times till index becomes number-1
                container = number % i;                  //4. Storing the result of the module in the container var
                if(container == 0){                      //5. Check if the value is == 0 (the division didn't had any number left)
                    result += i;                         //6. Storing and adding every value and add it to the previous one
                    //System.out.println(result);
                }
            }

            if(result == number){                        //7. Check after the end of the loop if the value is the same as the number in input
                return true;                             //8. Print the result.
            }else{
                return false;
            }
            
        }else{
            return false;
        }
    }

}
