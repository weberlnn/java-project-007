/**
 * Created by lin on 2016/8/17.
 */
public class Test { // 按值传递的原始类型。
    //这个方法会导致调用中使用的参数变化。
    void noChange(int i, int j){
        // 在noChange()内部发生的运算没有影响调用中使用的a和b的值。
        i = i +j;
        j = -j;
    }
}
class CallByValue{
    public static void main(String args[]) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a and b before call: " + a + " " + b);
        ob.noChange(a, b);
        System.out.println("a and b after call: " + a + " " +b);
    }
}
// 在onChange()内部发生的运算没有影响调用中使用的a和b的值。