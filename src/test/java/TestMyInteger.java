import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PS2.MyInteger;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestBoolean() {
		MyInteger iValue = new MyInteger(12);
		
		assertTrue(iValue.isEven());
		assertFalse(iValue.isOdd());
		assertFalse(iValue.isPrime());
		
		MyInteger specivValue1 = new MyInteger(12);
		
		assertTrue(specivValue1.isEven(12));
		assertFalse(specivValue1.isOdd(12));
		assertFalse(specivValue1.isPrime(12));
		assertTrue(iValue.equals(12));
		
		MyInteger specivValue2 = new MyInteger(111);
		
		assertFalse(specivValue2.isEven(111));
		assertTrue(specivValue2.isOdd(111));
		assertTrue(specivValue2.isPrime(111));
		assertFalse(iValue.equals(111));
		
		MyInteger specivValue3 = new MyInteger(12);
		
		assertTrue(specivValue3.isEven(specivValue3));
		assertFalse(specivValue3.isOdd(specivValue3));
		assertFalse(specivValue3.isPrime(specivValue3));
		assertTrue(iValue.equals(specivValue3));
		
		MyInteger specivValue4 = new MyInteger(23);
		
		assertFalse(specivValue4.isEven(specivValue4));
		assertTrue(specivValue4.isOdd(specivValue4));
		assertTrue(specivValue4.isPrime(specivValue4));
		assertFalse(iValue.equals(specivValue4));
		
	}

}
