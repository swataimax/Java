package unittest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterSampleTest {
	@BeforeAll
	static void beforeAll() {//テスト前に1度だけ実行される
		System.out.println("1:  BeforeAll");
	}

	@BeforeEach
	void beforeEach() { // 各テスト前にそれぞれ実行される
		System.out.println("2:  BeforeEach");
	}

	@AfterAll
	static void afterAll() { //テスト後に1度だけ実行される
		System.out.println("3: AfterAll");
	}

	@AfterEach
	void afterEach() { // 各テスト後にそれぞれ実行される
		System.out.println("4:  AfterEach ");
	}

	@Test
	void test1() {
		System.out.println("    test1");
	}

	@Test
    void test2() {
        System.out.println("    test2");
    }
}

