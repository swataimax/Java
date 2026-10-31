package lesson39;

import java.util.ArrayList;
import java.util.List;

public class Sample0309_01 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Student st = new Student();
			st.setId(i); // プロパティのidに値を設定
			st.setName("山田" + i); // プロパティのnameに値を設定
			list.add(st); // リストの要素にStudentオブジェクトを格納する
		}
		for (Student s : list) {
			System.out.println(s.getId() + ", " + s.getName());
		}
	}
}
