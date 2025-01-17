public class PalindromeChecker {
    // Attribute 
    String text;
    boolean isPalindrome = false;

    // Constructor 
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Member-functions
    //Method to check if the given string is palindrome
    public void isPalindrome() {
        int low = 0;
        int high = text.length()-1;
        while (low < high) {
            if (text.charAt(high) != text.charAt(low)) {
                isPalindrome = false;
                return;
            }
            low++;
            high--;
        }
        isPalindrome = true;
    }

    public void displayResult() {
        System.out.println("Is palindrome - " + isPalindrome);
    }

    public static void main(String[] args) {
        // Creating sample objects to test the class 
        PalindromeChecker sampleObject = new PalindromeChecker("abaccaba");
        PalindromeChecker sampleObject2 = new PalindromeChecker("srijan");

        // Calling the member-function to check internally if the string is palindrome  
        sampleObject.isPalindrome();
        sampleObject2.isPalindrome();

        // Output 
        sampleObject.displayResult();
        sampleObject2.displayResult();
    }   

}
