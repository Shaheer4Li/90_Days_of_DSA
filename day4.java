import java.util.*;
public class day4 {
    //Task one Check if anagram
    public static boolean anagram(String s1, String s2){
        char[] arr = new char[s1.length()];
        char[] arr2 = new char[s2.length()];
        arr = s1.toCharArray();
        arr2 = s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(arr==arr2){
            return true;
        }
        
   return false; }
//    Task 2 Reverse string without string builder
public static String reverse(String str){
    char[] arr = new char[str.length()];
  
    arr = str.toCharArray();
      String str2 = "";
      for(int i = arr.length - 1; i >= 0; i--) {
          str2 += arr[i];
      }
      return str2;
}
// Task no 3 check if string is palindrome
      public static boolean ispalindrome(String str){
        for(int i =0, j=str.length()-1; i<str.length(); i++ , j-- ){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
     return true; }
 //  Task no 4 Count vowel and consonent
    public static void vowel(String str){
    char[] vowels = {'a','e','i','o','u'};
    boolean var1;
    int counter =0;
    for(int i =0;i<str.length();i++){
    var1 = false;
    for(int j = 0;j<vowels.length;j++){
        if(str.charAt(i)==vowels[j]){
         var1 = true;
         break;
        } }
        if(var1){
counter++;
        } }
        System.out.println("Vowels : "+counter);
        System.out.println("consonent: "+(str.length()-counter));
    }
}
