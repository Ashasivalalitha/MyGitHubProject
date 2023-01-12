package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest extends BaseTest{
	
	@Test
	private void skip_t() {
		
		throw new SkipException("Skipping this test case!!");
		
	}

}
