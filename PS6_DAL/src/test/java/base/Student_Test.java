package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

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
	public void test() {
		assertTrue(1==1);
	}
@Test
public void createtest() {
	
	PersonDAL Per = new PersonDAL();
	Per.addPerson(person1);
}
@Test
public void gettest(){
	
}
@Test
public void updatetest(){
	
}
@Test
public void deletetest(){
	
}
}
