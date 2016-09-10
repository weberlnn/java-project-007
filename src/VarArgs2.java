/**
 * Created by lin on 2016/8/21.
 */
// 下面是一个vaTest()方法的重写后的版本，即有常规实参，也有可变长度实参：
// 使用可变参数与标准参数。
public class VarArgs2 {
    //在这里，msg是一个正常的参数但是v是一个参数。
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("内容: ");
        for(int i = 0; i < v.length; i++)
            System.out.println(" 参数 " + i + ": " + v[i]);
        System.out.println();
    }
    public static void main(String args[]){
        vaTest("一个可变参数: ", 10);
        vaTest("三个可变参数: ", 1, 2, 3);
        vaTest("没有可变参数: ");
    }
}
