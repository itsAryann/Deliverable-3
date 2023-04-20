import content.cards;
import deliverable.pkg2.Main;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MainTest {
    
    @Test
    public void testContainsValidInput() {
        // Test when the target string is in the array
        cards[] arr = {cards.A, cards.B, cards.C};
        assertTrue(Main.contains(arr, "A"));
        assertTrue(Main.contains(arr, "B"));
        assertTrue(Main.contains(arr, "C"));
    }
    
    @Test
    public void testContainsInvalidInput() {
        // Test when the target string is not in the array
        cards[] arr = {cards.A, cards.B, cards.C};
        assertFalse(Main.contains(arr, "D"));
    }
    
    @Test
    public void testContainsEmptyArray() {
        // Test when the array is empty
        cards[] arr = {};
        assertFalse(Main.contains(arr, "A"));
    }
    
    @Test
    public void testContainsNullArray() {
        // Test when the array is null
        cards[] arr = null;
        assertFalse(Main.contains(arr, "A"));
    }
    
    @Test
    public void testContainsNullTarget() {
        // Test when the target string is null
        cards[] arr = {cards.A, cards.B, cards.C};
        assertFalse(Main.contains(arr, null));
    }
    
    @Test
    public void testContainsBoundaryCases() {
        // Test when the array has only one element
        cards[] arr1 = {cards.A};
        assertTrue(Main.contains(arr1, "A"));
        assertFalse(Main.contains(arr1, "B"));
        
        // Test when the array has maximum number of elements
        cards[] arr2 = {cards.A, cards.B, cards.C, cards.D, cards.E, cards.F, cards.G, cards.H, cards.I, cards.J};
        assertTrue(Main.contains(arr2, "A"));
        assertTrue(Main.contains(arr2, "J"));
        assertFalse(Main.contains(arr2, "K"));
    }
}