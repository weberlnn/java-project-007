/**
 * Created by lin on 2016/8/18.
 */
/*方法可以返回包含类类型在内的任何类型的数据。例如，如下所示的用于报告错误的ErrorMsg类它的
getErrorMsg()方法就返回一个String对象，该对象包含根据传递的错误代码而得到的一个出错描述。*/
 // 返回一个字符串对象。
public class ErrorMsg {
    String msgs[] = {
            "输出误差",
            "输入错误",
            "磁盘已满",
            "索引 禁止入内的"
    };
    // 返回错误信息。
    String getErrorMsg(int i) { // 返回一个String类型的对象
        if(i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "无效的错误代码";
    }
}
class ErrMsg {
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}
