package tdd;

import static org.junit.Assert.assertTrue;
import static tdd.PalindromChecker.isPalindrome;
import org.junit.Test;

public class PalindromCheckerTest {

    @Test
    public void Return_true_for_a_valid_palindrom() {
        String text = "anna";
        boolean isPalindrome = isPalindrome("anna");
        assertTrue("Given text should be a palindrome.", isPalindrome );
    }

    // Return false for a invalid palindrome

    // Return false for a value of NULL

    // Return false for a empty string
}
