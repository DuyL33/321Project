import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ImmigrantTest {
	private Immigrant immigrant = null;
	private Immigrant immigrant3 = null;
	
	public static void main(String[] args)
    {
        org.junit.runner.JUnitCore.main("ImmigrantTest");
    }
	
    @Before
    public void setUp() {
    	immigrant = new Immigrant("John", "Doe", "123456");
    	
    }
	
    @Test
    public void testCreateImmigrant() {
        //Assuming Database.getImmigrant is a mock or is handled appropriately in testing
        //Immigrant createdImmigrant = immigrant.createImmigrant("John", "Doe", "123456");
        
        assertNotNull(immigrant);
        assertEquals(null, immigrant3);
        
        assertEquals("John", immigrant.getFirstName());
        assertEquals("Doe", immigrant.getLastName());
        assertEquals("123456", immigrant.getAlienID());
        
        immigrant3 = new Immigrant("Joe", "Deck", "0987654");
        assertEquals("Joe", immigrant3.getFirstName());
        assertEquals("Deck", immigrant3.getLastName());
        assertEquals("0987654", immigrant3.getAlienID());
        
    }

    @Test
    public void testValidateInfo() {
        assertTrue(immigrant.validateInfo());
        
        // Test with null values
        immigrant = new Immigrant(null, "Doe", "123456");
        assertFalse(immigrant.validateInfo());
        
        immigrant = new Immigrant("John", null, "123456");
        assertFalse(immigrant.validateInfo());
        
        immigrant = new Immigrant("John", "Doe", null);
        assertFalse(immigrant.validateInfo());
    }

    @Test
    public void testCompareTo() {
        Immigrant immigrant2 = new Immigrant("Alice", "Smith", "789012");
        assertTrue(immigrant.compareTo(immigrant2) > 0); // John comes after Alice in alphabetical order

        // Test with the same first name
        immigrant2 = new Immigrant("John", "Smith", "789012");
        assertTrue(immigrant.compareTo(immigrant2) == 0); // Same first name, should return 0
    }

    @Test
    public void testSetStatus() {
        assertNull(immigrant.getStatus()); // Status should be null initially
		assertNull(immigrant3.getStatus());
		
		
        immigrant.setStatus("Pending");
        assertEquals("Pending", immigrant.getStatus());
        
        immigrant3.setStatus("Approved");
        assertEquals("Approved", immigrant3.getStatus());
    }
}