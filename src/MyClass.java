/**
 * Created by lin on 2016/8/17.
 */
// 要想了解public和private的效果，请看下面的程序：
class MyClass {
    private int alpha; // 私人访问。
    public int beta; // 公共访问。
    int gamma; // 默认访问（本质上是公共的）。
    // 方法来访问alpha（开端）。它可以为一个类的成员访问同一个类的私有成员。
    void setAlpha(int a) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }
}
class AccessDemo {
    public static void main(String args[]) {
        MyClass ob = new MyClass();
        // 访问alpha是只允许通过它访问器方法。
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());
        // 不能访问这样的alpha。
        // ob.alpha = 10;    //错了，因为alpha是私有的。
        // 这些都是好的，因为beta和gamma是公开的。
        ob.beta = 88;
        ob.gamma = 99;
    }
}
/*在MyClass类中，指定alpha为private，显示指定beta为public，而gamma则使用了默认访问（本例
中与指定public相同）。因为alpha是私有成员，所以类以外的代码不能访问它。因此，在AccessDemo
类中不能直接使用alpha。必须通过类的公有访问方法steAlpha()和getAlpha()才能访问它。如果把下
面的代码行开始处的注释符号删去：// ob.alpha = 10   那么将无法编译该程序，因为这是一个非法
 访问。正如setAlpha()和getAlpha()方法所示的那样，尽管不允许MyClass以外的代码访问alpha，但
 是MyClass定义的方法可以自由地访问它。关键之处是，私有成员可以被自己的类中的其他方法自由访问，
 却不能被类以外的代码访问。
 */