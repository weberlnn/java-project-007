/**
 * Created by lin on 2016/8/17.
 */
/*当向一个方法传递对象时，情况就不大一样啦，因为对象是通过引用来传递的。切记，当创建一个类
类型的变量时，就在创建对象的引用。实际传递给对方的是引用而不是对象本身。因此，当向一个方法
传递该引用时，接受它的形参与实参会指向同一个对象。这就意味着向方法传递对象使用的是引用调用。
方法内部对对象的修改就会影响作为实参的对象。*/
public class Test2 {
    int a, b;
    Test2(int i, int j) {
        a = i;
        b = j;
    }
    void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
class PassObRef{
    public static void main(String args[]) {
        Test2 ob = new Test2(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
/*本例中，change()内部的动作影响了作为实参使用的对象。在本例中很有趣的是当对象引用被传递给一
个方法时，引用本身是使用传值调用方式传递的。然而，因为被传递的值引用了一个对象，所以该值的副本
依然引用了被相应实参引用的同一个对象。 */
    }
}
