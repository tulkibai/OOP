package practice_5;

//What error was generated?
// example2.java:21: error: variable i might not have been initialized
//                 numbers[i] + "/" + numbers[i + 1]);
//                         ^
// 1 error
// error: compilation failed

//What error was generated?
// example2.java:31: error: variable i might not have been initialized
//                 numbers[i] + "/" + numbers[i + 1]);
//                         ^
// 1 error
// error: compilation failed

//Why is this error generated anyway?
//because if there is any error into try block - every action in the try
//block is not considered as happend to any other blocks

// What output is generated?
// 100/10=10
// Couldn't calculate 10/0

//Why aren't all of the divisions even attempted?
// whenever there is any error into try block - any actions in it stop and 
// catch block starts

// What did you change? What has happened?
// 100/10=10
// Couldn't calculate 10/0
// 0/5=0
// 5/2=2
// 2/8=0
// Couldn't calculate 8/0
// 0/30=0

public class Example2
{
    public static void main(String[] args)
    {
        int i = 0, ratio;
        int[] numbers = {100,10,0,5,2,8,0,30};

        for (i = 0; i < numbers.length - 1; i++)
        {
            try 
            {
                ratio = numbers[i] / numbers[i + 1];
                System.out.println(numbers[i] + "/" + numbers[i + 1] + "=" + ratio);
            }
            catch (ArithmeticException ae)
            {
                System.out.println("Couldn't calculate " +
                    numbers[i] + "/" + numbers[i + 1]);
            }   
        }
    }
}
