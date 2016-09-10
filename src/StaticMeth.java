/**
 * Created by lin on 2016/8/19.
 */
/*static方法和普通方法之间的不同就是static方法是通过类名调用的，不需要创建类的任何对象。你已
经看到了这样的示例：sqrt()方法，它是java的标准Math类中的一个方法。下面是一个创建static方法*/

public class StaticMeth {
    static int val = 1024;
    static int valDiv2() {
        return  val/2;
    }
}
class SDemo2 {
    public static void main(String args[]) {
        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
        StaticMeth.val = 4;
        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
    }
}
