/**
 * Created by lin on 2016/8/18.
 */
// 与方法一样，构造函数也可以被重载，就这样可以用不同的方法来构造对象了，如下面程序所示：
public class MyClass2 { // 重载构造函数。
    int x;
    MyClass2() {  // 以不同方式构造对象
        System.out.println("Inside MyClass().");
        x = 0;
    }
    MyClass2(int i) { // 以不同方式构造对象
        System.out.println("Inside MyClass(int).");
        x = i;
    }
    MyClass2(double d) {  // 以不同方式构造对象
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }
    MyClass2(int i, int j) {  // 以不同方式构造对象
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }
}
class OverloadConsDemo {
    public static void main(String args[]) {
        MyClass2 t1 = new MyClass2();
        MyClass2 t2 = new MyClass2(88);
        MyClass2 t3 = new MyClass2(17.23);
        MyClass2 t4 = new MyClass2(2, 4);
        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
/*MyClass()有四个重载版本，每一个都会构造一个不同的对象。执行new时，它就根据指定的形参来调
用合适的构造函数。通过重载一个类的构造函数，可以为类的用户提供灵活的构造对象的方法。
 */