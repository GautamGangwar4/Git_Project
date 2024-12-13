package Git;

import org.testng.annotations.Test;

public class Groups {
	@Test(dependsOnGroups  = "mechanical Engineer")
	public void devloper() {
		System.out.println("he is a software developer");
		
	}
	@Test

	public void tester() {
		System.out.println("he is a software tester");
		
	}
	@Test(groups = "mechanical Engineer")

	public void maruti() {
		System.out.println("this is maruti car");
		
	}
	@Test(groups = "mechanical Engineer")
	public void tata() {
		System.out.println("this is tata nano");
		
	}
}
