

package TestNGPractice;

import org.testng.annotations.*;

public class FacebookLoginTest {
	@Test
	public void loginWithValidCredentials() {
		System.out.println("Successfully Login ");
	}
	@Test
	public void loginWithINValidCredentials() {
		
		System.out.println("Login Fail");
	}

}
