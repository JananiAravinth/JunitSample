import org.testng.annotations.*;

public class JunitSampleGit {
	
	@BeforeClass
		public static void beforeclass() {
			System.out.println("Before Class");
		
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("After Class");
	
	}
	
	@Test
	public void test1() {
		System.out.println("Here Comes the Business Logics");
	}
	

}
