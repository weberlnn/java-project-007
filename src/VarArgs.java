/**
 * Created by lin on 2016/8/21.
 */
/*  注意v使用下面的语句声明：
  int...v      这种语法告诉编译器，vaTest()方法可以带有零个或者多个实参。而且，它把v隐式声明
  为一个int[]类型的数组。这样，在vaTest()内部，v将使用正常的数组语法访问。  vaTest:增值税*/
// 下面是演示vaTest()的一个完整的程序： 证明了变长参数
class VarArgs {
    // vaTest()使用一个变量参数
    static void vaTest(int ...v) {  // 声明一个可变长度实参列表
        System.out.println("数量的参数: " + v.length);
        System.out.println("内容: ");
        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + "：" + v[i]);
            System.out.println();
    }
    public static void main(String args[]){
        // 注意vaTest()可以调用
        // 数量可变的参数
        vaTest(10); // 1个参数
        vaTest(1, 2, 3); // 3个参数
        vaTest(); // 没有参数
        //使用不同数量的实参调用
    }
}
/*关于该程序有两点需要注意。首先，如上述所述，在vaTest()内部，v作为数组操作这是因为v是一个数组。
“...”只是告诉编译器使用了可变长度的实参，这些实参保存在v数组中。其次在main()中，vaTest()使用不
同数目的实参调用，包括零个实参。实参被自动地放入数组并传递给v。在没有实参的情况下，数组的长度为0。
 */