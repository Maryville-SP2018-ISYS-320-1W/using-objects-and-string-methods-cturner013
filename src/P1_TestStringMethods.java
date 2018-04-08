/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expression predictions:
 
 1. nothing
 2.G
 3.A
 4.1
 
 5.will make it upper case
 6.change to lower case
 7.will put a d
 8.-1
 
 9.replace the a with two o's
 10.replace gray with white
 11. ad the word range
 
  
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1.Yes
 2. Yes
 3. Yes
 4.No, I was off one number
 
 5.Yes
 6.Yes
 7.No, it put an o instead of a d
 8.Yes
 
 9.Yes
 10. didn't replace the word
 11.Yes
 
 */
public class P1_TestStringMethods {
	public static void main(String[] args) {
		String str1 = "Frodo Baggins";
        String str2 = "Gandalf the GRAY";
        str1.length();    
System.out.println(str1.charAt(7));      
System.out.println(str2.charAt(0));
System.out.println(str1.indexOf("o"));   
System.out.println(str2.toUpperCase());  
System.out.println(str1.toLowerCase().indexOf("A"));     
System.out.println(str1.substring(4));   
System.out.println(str2.substring(3, 14));       
System.out.println(str2.replace("a", "oo"));     
System.out.println(str2.replace("gray", "white"));       
System.out.println("str1".replace("r", "range"));
	
	}

}
