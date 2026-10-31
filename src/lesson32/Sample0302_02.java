package lesson32;

public class Sample0302_02 {
    public static void main(String[] args) {
        Student[] stArr = new Student[3];
        for (int i = 0; i < stArr.length; i++) {
            // コンストラクタ引数に値を設定（setter呼び出しは不要）
            Student st = new Student(i, "yamada" + i);
            stArr[i] = st; // 配列にStudentオブジェクトを格納する
        }
        for (Student s : stArr) {
            // 参照するときはgetId()ではなく、id()のようになる
            System.out.println(s.id() + "," + s.name());
        }
    }
}
