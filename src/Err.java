/**
 * Created by lin on 2016/8/18.
 */
/*下面是前面创建两个出错类的程序的改版。两个出错类一个名为Err，它把一个出错消息和严重级别代
码封装在一起。另一个。名为ErrorInfo,它定义了一个名为getErrorInfo()的方法，用来返回一个Err
对象。一个名为ErrorInfo,它定义了一个名为getErrorInfo()的方法，用来返回一个Err对象。*/
 // 返回一个programmer-defined 对象。
public class Err {
    String msg;
    int severity;
    Err(String m, int s) {
        msg = m;severity = s;
    }
}
class ErrorInfo{
    String msgs[] = {
            "输出误差",
            "输入错误",
            "磁盘已满",
            "索引 禁止入内的"
    };
    int howbad[] = {3, 3, 2, 4 };
    Err getErrorInfo(int i) { // 返回一个Err类型的对象
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("无效的错误代码", 0);
    }
}
class ErrInfo {
    public static void main(String args[]){
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " 严重程度: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " 严重程度: " + e.severity);
    }
}
/*每次调用getErrorInfo()都会创建一个新的Err对象，并将该对象的引用返回给调用例程。然后
该对象在main()中用于显示出错消息和严重级别代码。当一个方法返回对象时，对象将一直存在，直
至没有对它的引用为止，这时该对象就会被回收。因此，一个对象不会因为创建它的方法结束而被销毁。
 */