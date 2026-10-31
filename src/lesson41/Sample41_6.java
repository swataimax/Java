package lesson41;

import java.util.function.Consumer;
import java.util.function.Supplier;

/*
 * （参考）ラムダ式の注意点
 * 　ラムダ式は無名クラスと同じように扱えるがまったく同じというわけではない。
 * 　「this」が無名クラスとラムダ式では異なる。
 * 　　・無名クラスのthisは自身のオブジェクトを指す
 * 　　・ラムダ式のthisはラムダ式を定義しているクラスのオブジェクトを指す
 */

public class Sample41_6 {

	public static void main(String[] args) {
        new Sample41_6();
    }
	
	
	// コンストラクタ
    public Sample41_6() {
        
    	// 無名クラスのthis
    	Consumer<String> c1 = new Consumer<String>() {
            public void accept(String str) {
                System.out.println(this.getClass());
            }
        };
        
        // ラムダ式のthis
        Consumer<String> c2 = y -> System.out.println(this.getClass());
        
        c1.accept("a");	// class lesson41.Sample41_6$1	←無名クラスのオブジェクト
        c2.accept("b"); // class lesson41.Sample41_6	←Sample41_6のオブジェクト
        
        
        
        // 無名クラスのthis
        Supplier<String> c3 = new Supplier<String>() {
        	public String get() {
        		return this.getClass().toString();
        	}
        };
        System.out.println(c3.get());
        
        // ラムダ式のthis
        Supplier<String> c4 = () -> this.getClass().toString();
        System.out.println(c4.get());
        
    }
}
