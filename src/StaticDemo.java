/**
 * Created by lin on 2016/8/19.
 */
 /*声明为static的变量本质上都是全局变量。声明对象时，不生成static变量的副本。相反，类的所有
 实例共用一个static变量。下面的示例显示了static变量和实例变量之间的不同： */
public class StaticDemo {
    int x;
    static int y;
    int sum() {
        return x + y;
    }
}
class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("当然，ob1.x和ob2.x是独立的 " + "是独立的.");
        System.out.println("ob1.x: " + ob1.x + "\n0b2.x: " + ob2.x);
        System.out.println();

        System.out.println("静态变量y是共享的.");
        StaticDemo.y = 19;
        System.out.println("Set StaticDemo.y to 19.");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
        StaticDemo.y = 100;
        System.out.println("StaticDemo.y更改为100 ");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();  // 如你所见，静态变量y被ob1和ob2共享。修改它会影响
    }                          // 整个类，而不是一个实例。
}
/*有时你会想要定义一个类成员，其使用与任何对象都无关。通常，必须通过类的对象访问类成员，但是类
可以创建一个无须引用指定的实例就可以单独使用的成员。要创建这样的成员，应该在它的声明之前添加关
键字static，当一个成员被声明为static后，可以在创建类的对象之前访问该成员，而无须引用任何对象。
方法和变量都可以声明为static。最常用的static成员实例是main()。将main()声明为static是因为它必
须在程序即可，不需要创建对象。例如，如果想把值10赋给一名为count的static变量，该变量是Timer类
的一部分，可以使用下面这一行代码：   Timer.count = 10;
这种格式与通过对象访问普通实例变量相似，只不过使用的是类名。static方法可以同样的方式被调用——即
通过在类名后使用点操作符。  */

