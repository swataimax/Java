package unittest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestSample2Test {

	@Test
	void test1() {
		// テスト対象のオブジェクト生成
		UnitTestSample sample = new UnitTestSample();
		// 入力値
		int a = 1, b = 2;
		// 期待値の定義
		int expected = 3;
//		int expected = 10;
		// メソッドを呼び出して結果値を出す
		int actual = sample.sum(a, b);
		// 期待値と結果値が等しいか確認
		assertEquals(expected, actual);

		assertThat(expected, equalTo(actual));			// 等しい
		assertThat(expected, is(equalTo(actual)));	// 等しい
		assertThat(expected, is(actual));				// 等しい
		assertThat(expected, greaterThan(1));			// より大きい

	}

	@Test
	void test2() {
		UnitTestSample sample = new UnitTestSample();
		String str = ""; // 空文字
		boolean actual = sample.isBlank(str);
		assertTrue(actual);						// Trueであることの検証
	}

}
