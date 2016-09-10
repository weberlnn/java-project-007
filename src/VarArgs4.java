/**
 * Created by lin on 2016/8/23.
 */
 class VarArgs4 {
    int sum(int...v) {
        int x = 0;
        for(int i=0; i < v.length; i++)
            x += v[i];
        System.out.println();
        return x;
    }
}
class Varargs{
    public static void main(String args[]) {
        VarArgs4 siObj = new VarArgs4();
        int total = siObj.sum(1, 2);
        System.out.println("总和为 " + total);
    }
}
