/**
 * Created by lin on 2016/8/18.
 */
/*方法重载(method overloading)。在java中，同一个类中的两个或多个方法可以共享一个名称，
只要它们的形参声明不一样就可以。当这种情况发生时，就称方法被重载(overloaded)了，而这一过程
也就称为方法重载。方法重载是java实现多态性的途径之一。
总之，重载一个方法只需要声明它的几个不同版本就可以，其余的交给编译器处理即可。必须注意一个
重要限制：每个被重载的方法的形参类型和数量必须不同。两个方法仅仅返回类型不一样是不够的(返回
类型无法在所有的情况下为java提供足够的信息来确定使用哪个方法)。当然，被重载的方法的返回类型是
可以不一样的。当调用一个被重载方法时，将执行形参与实参相匹配的方法。*/
 // 证明方法重载。
public class Overload {
    void ovlDemo(){  //版本1
        System.out.println("没有参数");
    }
    // 过载ovlDemo为一个整型参数。
    void ovlDemo(int a){  //版本2
        System.out.println("一个参数: " + a);
    }
    // 过载ovlDemo为两个整数参数
    int ovlDemo(int a, int b){  //版本3
        System.out.println("两个参数: " + a + " " +b);
        return a + b;
    }
    // 过载ovlDemo两双精度参数。
    double ovlDemo(double a, double b) {  //版本4
        System.out.println("两个双精度参数: " + a + " " + b );
        return a + b;
    }
}
class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resI;
        double resD;
        // 调用所有版本的ovlDemo()。
        ob.ovlDemo();
        System.out.println();
        ob.ovlDemo(2);
        System.out.println();
        resI = ob.ovlDemo(4, 6);
        System.out.println("ob.ovlDemo(4, 6)的结果: " + resI);
        System.out.println();
        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("ob.ovlDemo(1.1, 2.32)的结果: " + resD);
    }
}
/*volDemo()被重载了4次。第一个版本没有形参，第二个版本有一个整形形参，第三个版本有两个整型
形参，第四个版本有两个double形参。注意，ovlDemo()的前两个版本返回void，后两个ovlDemo()返
回的是一个值。这几个版本都是有效的，然而如前所述，无论方法返回的类型是什么，都与能否重载无关。
*/


