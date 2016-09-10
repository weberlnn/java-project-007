/**
 * Created by lin on 2016/8/19.
 */
/*在java中，一个方法可以调用其自身。这个过程称为递归(recursion)，调用自己的方法称为递归方法。
递归是某一事物内部定义自己的过称，它与循环定义有些相似。递归方法的关键在于调用其自身的一个语句。
递归是一种功能强大的控制机制。     递归的经典示例是计算一个数值的阶乘。数N的阶乘是从1到N的所有
整数的积。  例如:3的阶乘是1*2*3或6。
下面的程序展示了计算数的阶乘的递归方法。为了进行比较,程序中还有一个非递归的方法。*/
// 一个递归的例子。
public class Factorial { // 类的阶乘。
    int factR(int n) {
        // 这是一个递归函数。
        int result;
        if(n==1) return 1;
        result = factR(n-1) * n;//(n-1)  执行对factR的递归调用
        System.out.println(n);
        return result;
    }
    //这是一个迭代的等效。
    int factI(int n) {   // 非递归方法factI的运算应该很清楚。它使用一个从1开始的循环，将
        int t, result;   // 每一个数值与不断变化的乘积相乘。
        result = 1;
        for(t=1; t <= n; t++) result *= t;
        System.out.println(t);
        return result;
    }
}
class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();
        System.out.println("阶乘使用递归方法.");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));
        System.out.println();
        System.out.println("阶乘使用迭代方法.");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
    }
}
/*递归方法factR()的运算则有点复杂。当实参为1时调用factR()，方法返回为1；否则，它返回的结果为
factR(n-1)*n。为计算这个表达式，就要以形参n-1来调用factR()。这个过程会重复进行直到n等于1为止，
然后对方的调用开始返回。例如，计算2的阶乘时，第一个调用factR()会导致第二个以1为实参的factR()被
调用。这个调用会返回1，然后该值与2相乘（即n的初值）。那么答案就是2。如果把println()语句放入
factR()中来显示每一级调用以及中间的结果，你可能会发现十分有趣。
当一个方法调用其自身时，新的局部变量和形参被存储到堆栈中，然后从堆栈的开始用这些新的变量来执行
方法代码。一个递归调用不会生成方法的新的副本。只有实参是新生成的。在每个递归调用返回时，旧的局部
变量和形参将从堆栈中删除，执行继续从方法内部的调用点开始。递归方法可以被看成是把“压缩式望远镜”
抽出，又缩回。
许多例程的递归版本比相应的循环版本执行速度慢，这是因为有了额外的方法调用开销。某个方法的过多递归
调用会导致堆栈溢出。因为形参和局部变量都存储在堆栈中，而且每一个新的调用都会创建这些变量的新副本，
所以这可能会把堆栈的空间耗尽。如果发生溢出，就会导致一个java运行时错误。然而，只要递归不疯狂运行，
一般无须担心溢出。递归的主要优点是，与使用循环相比，它在现实某些类型的算法时跟清楚，更简单。例如，
快速排序算法用循环方法实现是十分困难的。同时，有些问题，特别是与人工智能相关的问题看起来更适合用
递归方法来解决。当编写递归方法时，必须在某处有一个条件语句，如if，来强迫方法在没有执行递归调用时
返回。如果没有这样做，一旦调用方法，它就再也不会返回了。在使用递归时这种类型的错误十分常见。可以
自由使用println()语句，这样你就可以观察正在执行什么，并且在发现有错误时终止执行。
 */








