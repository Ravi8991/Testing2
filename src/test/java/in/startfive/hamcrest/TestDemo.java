package in.startfive.hamcrest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static in.startfive.hamcrest.IsEven.isEven;

import org.junit.jupiter.api.Test;

public class TestDemo {
	
	@Test
	public void m1() {
	
		String str = null;
		assertThat(1, equalTo(1));
		assertThat("hello", notNullValue());
		assertThat(str, nullValue());
		assertThat(4, isEven());

	}

}
