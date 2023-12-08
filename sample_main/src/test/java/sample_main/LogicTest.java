package sample_main;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class LogicTest {

	@Test
	public void test1() {

		assertThat("ねこ", is(PropKey.KEY1.getValue()));
	}

	@Test
	public void test2() {

		assertThat("いぬ", is(PropKey.KEY2.getValue()));
	}

	@Test
	public void test3() {

		assertThat("うさぎ", is(PropKey.KEY3.getValue()));
	}
}
