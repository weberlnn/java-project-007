/**
 * Created by lin on 2016/8/19.
 */
/*有时一个类在创建对象之前，需要进行一些初始化。例如，它可能需要建立与远程站点的连接。也可能
需要在使用类的任何static方法之前，初始化某些static变量。为了处理这些情况，java允许声明一个
static代码块在类第一次被加载时执行。因此它是在使用类之前执行的。static代码块的示例如下所示：*/

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Insids static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    StaticBlock(String msg) {
        System.out.println(msg);
    }
}
class SDemo3{
    public static void main(String args[]) {
        StaticBlock ob = new StaticBlock("内部构造函数");
        System.out.println("2的平方根是 " + StaticBlock.rootOf2);
        System.out.println("3的平方根是 " + StaticBlock.rootOf3);
    }
}