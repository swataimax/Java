package unittest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * 2026/06/21
 */
class UnitTestSampleTest {

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

	@Test
	void test3() {
		UnitTestSample sample = new UnitTestSample();
		String str = null;
		boolean result = sample.isBlank(str);
		assertTrue(result);						// Trueであることの検証
	}

	@Test
	void test4() {
		UnitTestSample sample = new UnitTestSample();
		String str = "abc";
		boolean result = sample.isBlank(str);
		assertFalse(result);						// Falseであることの検証
	}

	@Test
	void test5() { // 繰り返し処理あり
		UnitTestSample sample = new UnitTestSample();
		int x = 10;
		int expected = 55;
		int actual = sample.calc(x);
		assertEquals(expected, actual);
	}

	//	void test6() { // 繰り返し処理なし
	//		UnitTestSample sample = new UnitTestSample();
	//		int x = -1;
	//		int expected = 0;
	//		int actual = sample.calc(x);
	//		assertEquals(expected, actual);
	//	}

	@Test
	void test7() {
		UnitTestSample sample = new UnitTestSample();
		int a = 1, b = 1, c = 0;
		boolean actual = sample.judge(a, b, c);
		assertTrue(actual);
	}

	@Test
	void test8() {
		UnitTestSample sample = new UnitTestSample();
		int a = 1, b = 0, c = 0;
		boolean actual = sample.judge(a, b, c);
		assertFalse(actual);
	}

	@Test
	void test13() {
		UnitTestSample sample = new UnitTestSample();
		int a = 0, b = 0, c = 1;
		boolean actual = sample.judge(a, b, c);
		assertFalse(actual);
	}

	@Test
	void test14() {
		UnitTestSample sample = new UnitTestSample();
		int a = 0, b = 0, c = 0;
		boolean actual = sample.judge(a, b, c);
		assertTrue(actual);
	}
	
	
}

// 右クリック→実行→JUnitテスト
// 右クリック→カバレッジ→JUnitテスト