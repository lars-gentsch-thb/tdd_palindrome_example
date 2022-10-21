package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tdd.PalindromChecker.isPalindrome;


public class PalindromCheckerTest {

    @Test
    public void A_text_with_valid_palindrome_should_work() {
        String text = "anna";
        boolean isPalindrome = isPalindrome("anna");
        assertTrue(isPalindrome, "Given text should be a palindrome.");
    }

    // Ein Text der kein Palindrom ist soll abgelehnt werden
/*    @Test
    public void A_text_with_a_invalid_palidrome_should_be_rejected() {
        String text = "bus";
        boolean isPalindrome = isPalindrome(text);
        assertFalse(isPalindrome, "Given text should not be a palindrome.");
    }
*/

    // Test mit führende Leerzeichen ist kein Palindrom

    // Ein null-Objekt ist kein Palindrom

    // Groß- und Kleinschreibung soll ignoriert werden

    // Sonderzeichen sind kein Palindrom

    // Leerzeichen vorn oder hinten sollen ignoriert werden

}
