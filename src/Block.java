/**
 * Created by lin on 2016/8/17.
 */
/*到目前为止，本书的示例一直在使用简单类型作为形参传递给方法。然而，向方法传递对象也是正确的，
而且十分常见。例如，下面这个程序定义了一个存储三维方块各维长度的名为Block的类： */
public class Block { //对象可以被传递给方法
    int a, b, c;
    int volume;
    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    //返回true，if ob 定义了相同的块。
    boolean sameBlock(Block ob) {  // 使用对象类型作为形参。
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }
    //返回true，if ob 相同的体积
    boolean sameVolume(Block ob) {  // 使用对象类型作为形参。
        if(ob.volume == volume) return true;
        else return false;
    }
}
class PassOb {
    public static void main(String args[]){
        Block ob1 = new Block(10, 2, 5);// 传递对象
        Block ob2 = new Block(10, 2, 5);// 传递对象
        Block ob3 = new Block(4, 5, 5); // 传递对象
        System.out.println("ob1与ob2的尺寸一样: " + ob1.sameBlock(ob2));
        System.out.println("ob1与ob3的尺寸一样: " + ob1.sameBlock(ob3));
        System.out.println("ob1与ob3相同的体积: " + ob1.sameVolume(ob3));
    }
}
/*sameBlock()和sameVolume()方法比较了作为形参传递给它们的Block对象。sameBlock()比较的是
对象的各个维的长度，如果两个块一样，就返回true。sameVolume()比较的是两个块的体积是否相等。
注意，在两个类中，形参ob指定Block为其类型。尽管block是程序创建的一个类，但是它也可以作用
java的内置类型。
 */