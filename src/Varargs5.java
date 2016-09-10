/**
 * Created by lin on 2016/8/23.
 */
public class Varargs5 {
    static void sum(int... v) {
        System.out.println("vaTest(int ...): " + "数量的参数: " + v.length);
        System.out.println("内容: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" 参数 " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String args[]) {
        sum(1, 2, 3);
    }
}
