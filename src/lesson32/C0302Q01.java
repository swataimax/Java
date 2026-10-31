package lesson32;

public class C0302Q01 {
    public static void main(String[] args) {
        Prefecture p1 = new Prefecture("神奈川県", "横浜市");
        Prefecture p2 = new Prefecture("埼玉県", "さいたま市");
        Prefecture p3 = new Prefecture("千葉県", "千葉市");
        
        Prefecture[] pre = {p1, p2, p3};
        for (Prefecture p : pre) {
            System.out.println(p.prefectureName() + ", " + p.capital());
        }
    }
}
