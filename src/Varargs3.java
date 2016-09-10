/**
 * Created by lin on 2016/8/21.
 */
//可以重载接受可变长度实参的方法。例如，下面的程序重载了vaTest()方法3次：varargs和重载。
public class Varargs3 {
    static void vaTest(int ... v){ //vaTest()的第一个版本。
        System.out.println("vaTest(int ...): " + "数量的参数: " + v.length);
        System.out.println("内容: ");
        for(int i = 0; i < v.length; i++)
            System.out.println(" 参数 "  + i + ": " + v[i]);
        System.out.println();
    }
    static void vaTest(boolean ... v) { // vaTest()的第二个版本。
        System.out.println("vaTest (boolean ...): " + "数量的参数: " + v.length);
        System.out.println("内容：");
        for(int i=0; i < v.length; i++)
            System.out.println(" 参数 " + i + ": " + v[i]);
        System.out.println();
    }
    static void vaTest(String msg, int ...v) { // vaTest()的第三个版本。
        System.out.println("vaTest(String, int ...): " + msg + v.length);
        System.out.println("内容: ");
        for(int i=0; i < v.length; i++)
            System.out.println(" 参数 " + i + ": " + v[i]);
        System.out.println();
    }
    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("测试: ", 10, 20);
        vaTest(true, false, false);
    }
}
/*该程序演示了重载varargs方法的两种方式。首先，可变长度形参的类型可以不同，例如程序中的
vaTest(int...)和vaTest(boolean ...)。前面讲过，“...”使得形参被作为指定类型的数组处理。因此
就像使用不同类型的数组形参重载方法一样，可以使用不同类型的varargs重载varargs方法。这时，java
使用不同的类型来确定调用哪一个重载的方法。   重载varargs方法的第二种方式是添加一个或多个正常的
形参。vaTest(String int...)就是这么做的，这时，java同时使用实参数目和实参类型来确实调用哪一个。
 */