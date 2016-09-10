/**
 * Created by lin on 2016/8/18.
 */
//第2章中介绍过java提供的某些自动类型转换。这些转换；也可以应用于重载方法的形参，
public class Overload2 { // 自动类型转换会影响重载方法解析。
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }
    void f(double x){
        System.out.println("Inside f(double): " + x);
    }
}
class TypeConv{
    public static void main(String args[]) {
        Overload2 ob = new Overload2();
        int i =10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        ob.f(i); // 调用 ob.f(int)
        ob.f(d); // 调用 ob.f(double)
        ob.f(b); // 调用 ob.f(int)     类型转换
        ob.f(s); // 调用 ob.f(int)     类型转换
        ob.f(f); // 调用 ob.f(double)  类型转换
    }
}
/*在本例中，只定义了两个版本的f()。第一个版本有一个int形参，第二个版本有一个double形参。
然而也可以向f()传递byte、short或float值。传递byte类型和short类型时，java会自动将他们
转换为int，因此就会调用f(int)。在传递float时，该值就会转换为double，所以会调用f(double)。
 */