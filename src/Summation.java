/**
 * Created by lin on 2016/8/18.
 */
/*最常见的重载构造函数的原因就是允许一个对象初始化一个对象。例如，下面是使用Summation类
计算整数值总和的程序：       */
 // 初始化一个对象和另外的。
public class Summation {
    int sum;
    //构建的int
    Summation(int num) {
        sum = 0;
        for(int i = 1; i <= num; i++)
            sum += i;
    }
    // 构建从另一个对象。
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
class SumDemo {
    public static void main(String args[]){
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);
        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}
/*如本例所示，提供构造函数来使用一个对象初始化另一个对象的效率是非常高的。对于本例，当构造s2时，
没有必要重新求和。当然，即使效率不是问题的时候，提供一个生成对象副本的构造函数也是非常有用的。
 */