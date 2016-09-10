/**
 * Created by lin on 2016/8/21.
 */
/*在java中，可以定义嵌套类，这是一种在其他类当中声明的类。坦率的讲，嵌套类是一项比较高级的内容。
嵌套类不是独立于包含它的类而存在的。因此，嵌套类的作用域就局限在它的外层类当中。直接在一个类中声
明的嵌套类是前者的成员。另外，还可以在一个代码块中声明一个嵌套类。
嵌套类有两种基本类型：带有static修饰符的和不带该修饰符的。这种类型的嵌套类也称为内部类。它有权
访问其外层类的所有变量和方法，可以像外层类的其他非静态成员那样直接引用它们。有时内部类用于提供一
系列只为封装类使用的服务。下面是一个使用内部类为封装类计算不同值的示例：使用一个内部类。*/
public class Outer {  // 外部的类。
    int nums[];
    Outer(int n[]) {
        nums = n;
    }
    void analyze() {   //analyze (分析)
        Inner inOb = new Inner();
        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }
    // 这是一个内部类。
    class Inner {
            int min() {
                int m = nums[0];
                for(int i=1; i < nums.length; i++)
                    if(nums[i] < m) m = nums[i];
                return m;
            }
            int max() {
                int m = nums[0];
                for(int i = 1; i < nums.length; i++)
                    if(nums[i] > m) m = nums[i];
                return m;
            }
            int avg() {
                int a = 0;
                for(int i = 0; i < nums.length; i++)
                    a += nums[i];
                return a / nums.length;
            }
        }
    }
    class NestedClassDemo {
        public static void main(String args[]) {
            int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 };
            Outer outOb = new Outer(x);
            outOb.analyze();
    }
}
/*在本例中，内部类Inner计算来自Outer(外部)的成员——数组nums——的不同值。如上所述，内部类有权访
问封装类的成员，所以Inner直接访问nums数组是完全可以的。当然，反之则不正确。例如，如果不创建
Inner对象，analyze()就无法直接调用min()方法。
 */