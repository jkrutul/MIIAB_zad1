/**
 * 
 */
package miiab.zad1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author krutulj
 *
 */
public class UserServiceImplTest {
	
	private static UserService us;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		us = new UserServiceImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		us = null;
	}

	/**
	 * Test method for {@link miiab.zad1.UserServiceImpl#addUser(miiab.zad1.User)}.
	 */
	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link miiab.zad1.UserServiceImpl#getUser(java.lang.String)}.
	 */
	@Test
	public void testGetUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link miiab.zad1.UserServiceImpl#removeUser(java.lang.String)}.
	 */
	@Test
	public void testRemoveUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link miiab.zad1.UserServiceImpl#verifyUser(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testVerifyUser() {
		fail("Not yet implemented");
	}

}
