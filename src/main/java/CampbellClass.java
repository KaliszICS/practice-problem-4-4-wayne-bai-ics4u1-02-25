/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19366933)
# Instructions  

Create a Utility class called _CampbellClass_

Inside the class should be the following methods:

 1. **convertString** - Can take in int, double, char or boolean and returns a string version of each one.</br>  
 2. **convertMetersToCenti** - Can take int or double of inches and return the converted amount in centimeters. Your methods should return the data type it was given.</br>    
 3. **removeNonAlpha** - Takes in a string and removes all non-letter characters.  Can also take a boolean as a parameter that when true returns all letters as uppercase, when false, all lowercase.

*/
public final class CampbellClass {
  
  /**
   * A private constructor
   */
  private CampbellClass(){}

  /**
   * converts an int into a string
   * 
   * @param a the integer in question
   * @return the string in answer
   */
  public static String convertString(int a) {
    return String.valueOf(a);
  }

  /**
   * converts a double into a string
   * 
   * @param a the double in question
   * @return the string in answer
   */
  public static String convertString(double a) {
    return String.valueOf(a);
  }

  /**
   * converts a boolean into a string
   * 
   * @param a the boolean in question
   * @return the string in answer
   */
  public static String convertString(boolean a) {
    return a ? "true" : "false";
  }

  /**
   * converts a character into a string
   * 
   * @param a the character in question
   * @return the string in answer
   */
  public static String convertString(char a) {
    return String.valueOf(a);
  }
  
  /**
   * converts a meter value to centimetres
   * 
   * @param a the meter value
   * @return the centimetre value
   */
  public static int convertMetersToCenti(int a) {
    return a * 100;
  }

  /**
   * converts a double meter value to centimetres
   * @param a the meter value
   * @return the centimetre value
   */
  public static double convertMetersToCenti(double a) {
    return a * 100.0;
  }

  /**
   * Removes characters that aren't part of the alphabet in a provided
   * @param mystr the string to be dissected
   * @return the dissected string
   */
  public static String removeNonAlpha(String mystr) {
    String result = "";
    for (int i = 0; i < mystr.length(); i++) {
      char myChar = mystr.charAt(i);
      if ((myChar >= 65 && myChar <= 90) || (myChar >= 97 && myChar <= 122)) {
        result += myChar;
      }
    }
    return result;
  }

  /**
   * Removes characters that aren't part of the alphabet in a provided string, and converts the characters to upper or lower case
   * @param mystr the string to be 
   * @param convertToUpper if true, uppercase else lowercase
   * @return the dissected string with its new case
   */
  public static String removeNonAlpha(String mystr, boolean convertToUpper) {
    mystr = removeNonAlpha(mystr);
    return convertToUpper ? mystr.toUpperCase() : mystr.toLowerCase();
  }
}

