package lesson32;

public class Sample0302_01 {
    public static void main(String[] args) {
        Student0[] stArr = new Student0[3];
        for (int i = 0; i < stArr.length; i++) {
            Student0 st = new Student0();
            st.setId(i);                          // プロパティのidに値を設定
            st.setName("Yamada" + i); // プロパティのnameに値を設定
            stArr[i] = st; // 配列にStudentオブジェクトを格納する
        }
        for (Student0 s : stArr) {
            // プロパティに設定された値をgetterで取得する
            System.out.println(s.getId() + "," + s.getName());
        }
    }
}
