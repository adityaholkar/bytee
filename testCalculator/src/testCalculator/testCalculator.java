package testCalculator;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
public class testCalculator {
	@Test
	public void sumEmptyStringAnswer0(){
		assertThat(	stringCalculator.Add(""),is(0));
	}
	
}
