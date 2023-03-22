import java.util.Arrays;

public class Lab {
    /**
     * Return a string with an array's contents, formatted with spaces.
     * For example, given the array {3,4,5,6} the string should look like this:
     * 3 4 5 6
     *
     * Spaces at the end of the string will not affect test results.
     *
     * You will need to use a for loop here. Again, the structure of that loop would look similar to a previous problem.
     * However, this challenge introduces the idea that a for loop can manipulate a variable that exists outside of the
     * for loop, which looks something like this:
     *
     * String str;
     * for(int i = 0; i < nums.length; i++){
     *      //do something to str here
     * }
     * return str;
     *
     * Where i represents a variable that is used to visit every number between 0 and the length of nums. Inside of the
     * for loop, you will need to write code that appends elements from nums to str, one by one, in the format described
     * above.
     *
     * After completing the problem, I recommend using your IDE's debugger to walk through the loop
     * goes through to help you visualize the values changing, as understanding this process is critical for all future
     * coding challenges.
     *
     * @param nums the array to be manipulated.
     * @return a string representation of all values of nums, with the values separated by spaces.
     */
  
     // input primitive integer array
    //int[] intArray = {};
    //int[] nums = {}; 
     //String[] strArray = new String[intArray.length];
     //String chr; 
    
    public String arrayToString(int[] nums){
        //int[] intArray = {};
     //int array
 //int[] intNumbers = new int[]{1, 2, 3, 4, 5};
    //nums = new int[]{1,2,3,4,5}; 
    //nums = new int[]{};
 /*
 * First approach is to loop through all elements of an int array 
 * and append them to StringBuffer object one by one. At the end,
 * use toString method to convert it to String.
 */
//create new StringBuffer object
StringBuffer sbfNumbers = new StringBuffer();
//define the separator you want in the string. This example uses space.
String strSeparator = " ";
if(nums.length > 0)
{
    //we do not want leading space for first element
 sbfNumbers.append(nums[0]);
 /*
 * Loop through the elements of an int array. Please
 * note that loop starts from 1 not from 0 because we 
 * already appended the first element without leading space.s	
 */
        for(int i = 1; i < nums.length; i++){
          
            sbfNumbers.append(strSeparator).append(nums[i]);
        
         }

}
System.out.println("int array converted to String using for loop");
//finally convert StringBuffer to String using toString method
System.out.println(sbfNumbers.toString());
/*
 * Second options is to use Arrays class as given below.
 * Use Arrays.toString method to convert int array to String.
 * 
 * However, it will return String like [1, 2, 3, 4, 5]
 */
String strNumbers = Arrays.toString(nums);
System.out.println("String generated from Arrays.toString method: " + strNumbers);
//you can use replaceAll method to replace brackets and commas
strNumbers = strNumbers.replaceAll(", ", strSeparator).replace("[", "").replace("]", "");
System.out.println("Final String: " + strNumbers);
return strNumbers; 
//for (int i = 0; i < nums.length; i++) {
        
       
       // strArray[i] = String.valueOf(intArray[i]);
       // nums[i] = Integer.parseInt(str[i]);
        //String[] strArray = new String[nums.length];
        //nums = Arrays.copyOf(nums, nums.length);
        //strArray[i] = String.valueOf(nums[i]);
        //String str = strArray[i]; 
        //strArray[i] = String.valueOf(nums[i]);
        // Program to convert primitive integer array to string array in 
        //strArray[i] = String.valueOf(nums);
         //Arrays.toString(nums);
        //System.out.println(Arrays.toString(nums));
         //Arrays.toString(nums);  


//String str[] = {"apple", "banana", "cherry"};//
//String arrNew[] = {"apple", "banana", "cherry"};//
//int[] nums = {};//
//String [] str = {"1", "345", "437", "894"};//
//int size = str.length;//
//int [] nums = new int [size];//
//String [] strArray = new String[nums.length];//
//nums = Arrays.copyOf(intArray, nums.length -1);//
//intArray[i] = nums[i];//
//chr = intArray.toString(); //
//String  str = strArray[i]; //
//chr = Arrays.toString(nums); //
//strArray[i] = String.valueOf(nums);//
//strArray[i] = String.valueOf(intArray[i]);//
//nums[i] = Integer.parseInt(str[i]);//
//String[] strArray = new String[nums.length];//
//nums = Arrays.copyOf(nums, nums.length-1);//
//strArray[i] = String.valueOf(nums[i]);//
//String str = strArray[i]; //
//strArray[i] = String.valueOf(nums[i]);//
// Program to convert primitive integer array to string array in 
//strArray[i] = String.valueOf(nums);//
//Arrays.toString(nums);//
//System.out.println(Arrays.toString(nums));//
//Arrays.toString(nums);  //
// return chr; //
 }//
 ///return Arrays.toString(nums);//
 //return chr; 
 //return chr;


         }
       
  
