package tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static tdd.PalindromChecker.isPalindrome;
import org.junit.Test;

public class PalindromCheckerTest {

    @Test
    public void A_text_with_valid_palindrome_should_work() {
        String text = "anna";
        boolean isPalindrome = isPalindrome("anna");
        assertTrue("Given text should be a palindrome.", isPalindrome );
    }

    // Ein text der kein Palindrom ist soll abgelehnt werden
    public void A_text_with_a_invalid_palidrome_should_be_rejected() {
        String text = "bus";
        boolean isPalindrome = isPalindrome(text);
        assertFalse("Given text should be a palindrome.", isPalindrome );
    }

    // Test mit führende Leerzeichen ist kein Palindrom

    // Ein null-Objekt ist kein Palindrom

    // Groß- und Kleinschreibung soll ignoriert werden

    // Sonderzeichen sind kein Palindrom

    // Leerzeichen vor oder hinten sollen ignoriert werden


}
