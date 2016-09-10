/**
 * Created by lin on 2016/8/17.
 */
/*为了解访问控制如何应用于更实际的示例，请考虑下面这个实现“软失效”的int数组的程序。在数组中，
越界访问是被禁止的，这样做可避免发生运行时异常。这是依靠把数组封装为类的私有成员来实现的，以
求只允许通过成员方法来访问数组。使用这种方法，可以使任何对数组的越界访问温和失效（即导致“软着
陆”而不是“砰然坠地”），以防止这种异常发生。“软失效”数组是由FailSoftArray类来实现的。*/
class FailSoftArray { // 这个类实现了一个“失效弱化”数组防止运行时错误。
        private int a[];
        private int errval;
        public int length;
    // 构建数组鉴于其规模和返回值of get()失败。
        public FailSoftArray(int size, int errv){
            a = new int[size];
            errval = errv;
            length = size;
        }
    // 返回值在给定索引。
        public int get(int index) { // index（索引)
        if(ok(index)) return a[index];
        return errval;
        }
    // 一个值在一个索引。返回false失败。
    public boolean out (int index, int val) {
        if(ok(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }
    // 返回true，如果指数在允许范围内。
    private boolean ok(int index) {
        if(index >= 0 & index < length) return true;
        return false;
    }
}
// 证明失效弱化数组。
class FSDemo{
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;
        // 显示quiet失败。
        System.out.println("quietly失败 .");
        for(int i=0; i < (fs.length * 2); i++)
            fs.out(i, i * 10);
        for(int i=0; i < (fs.length * 2); i++){
            x = fs.get(i);
            if(x != -1) System.out.print(x + " " );
        }
        System.out.println();
        // 现在，处理故障。
        System.out.println("\n失败与错误报告.");
        for(int i=0; i < (fs.length * 2); i++)
            if(!fs.out(i, i*10))
                System.out.println("索引" + i + " 禁止入内的");
        for(int i=0; i < (fs. length * 2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
            else
                System.out.println("索引 " + i + " 禁止入内的");
        }
    }
}
/*在FailSoftArray中定义了3个private成员。第一个是a，它存储了对实际存储信息的数组的引用。第二
个是errval，它是当调用get()失败后返回的一个值。第三个是private方法ok()，他确定索引是否在范围
之内。通常，类中的其他方法可以使用a和errval，而FailSoftArray的其他成员可以调用ok()。其他类成员
都是public，程序中的任何使用FailSoftArray的代码都可以调用它们。
在构造FailSoftArray对象时，必须指定数组的大小和调用get()失败时所要返回的值。错误值必须是一个值
否则不会存储到数组中。一旦构造成功，FailSoftArray对象的使用者就不能访问a引用的数组以及存储在
errval中的错误。因此它们不会被滥用。例如，用户不能直接索引a，也就不会出现越界。访问只能通过get()
和put()方法进行。
为了进行演示，ok()方法设置成了private。但是把它变成public也是无害的，因为他没有修改对象。然而，
因为它是FailSoftArray类内部使用的，所以它可以是private。
注意，实例变量length是public。这与java实现数组的方法是一致的。为了获得FailSoftArray的长度，使
用length方法即可。      要使用数组FailSoftArray,可以调用put()在指定的索引位置存储一个值。调用
get()从指定的索引位置检索一个值。如果索引越界，put()就返回false，get()返回errval。
为方便起见，本书大部分示例的多数成员都将使用默认访问设置。但是请记住，在现实生活中，限制成员访问
（特别是对于实例变量的访问）是成功的面向对象程序设计的一个重要部分。
 */