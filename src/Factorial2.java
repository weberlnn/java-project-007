/**
 * Created by lin on 2016/8/23.
 */
public class Factorial2 {
    public static void main(String args[]) {
        Factorial2("1, 2, 3, 4, 5");
    }
    public static void Factorial2(String sum){
        if(sum.length() == 0) {
            System.out.print(sum);
        }
        else{
            String str1 = sum.substring(0, sum.length()-1);
            String str2 = sum.substring(sum.length()-1);
            System.out.print(str2);
            Factorial2(str1);
        }
    }
}
