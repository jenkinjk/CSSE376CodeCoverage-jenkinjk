package ExpediaTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Expedia.*;
public class HotelTest {

	@Test
	public void TestThatHotelInitializes()
	{
		boolean t = false;
		try{new Hotel(-1);}
		catch(RuntimeException e){
			t = true;
		}
		assertTrue(t);
	}
	
	@Test
	public void getMiles()
	{
		Hotel h = new Hotel(5);
		assertEquals(0,h.getMiles());
	}
	
}
