/**
 * Created by lin on 2016/8/21.
 */
//使用ShowBits作为本地类。
public class LocalClassDemo {
    public static void main(String args[]) {
        //一个内部类ShowBits版本。
        class ShowBits { // 局部类嵌套在一个方法中。
            int numbits;
            ShowBits (int n) {
                numbits = n;
            }
            void show(long val) {
                long mask = 1;
                // 左移一个1到适当的位置
                mask <<= numbits-1;
                int spacer = 0;
                for(; mask != 0; mask >>>= 1) {
                    if((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for(byte b = 0; b < 10; b++) {
            ShowBits byteval = new ShowBits(8);
            System.out.print(b + " in binary: ");
            byteval.show(b);
        }  //本例中，ShowBits类是一个不为main()以外所知的类，除了main()以外，对它的任何访问
    }      //都会导致错误发生。
}
