/**
 * Created by lin on 2016/8/23.
 */
public class Queue3 {
    private char q[];
    private int putloc, getloc;

    Queue3 (int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }
    Queue3(Queue3 ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        for(int i=getloc+1; i <= putloc; i++)
            q[i] = ob.q[i];
    }
    Queue3(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length+1];
        for(int i = 0; i < a.length; i++) put(a[i]);
    }
    void put(char ch) {
        if(putloc == q.length-1) {
            System.out.println(" - Queue is full.");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    char get() {
        if(getloc == putloc) {
            System.out.println(" Queue is empty.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
class QDemo2{
    public static void main(String args[]) {
        Queue3 q1 = new Queue3(10);
        char name[] = {'T', 'o', 'm'};
        Queue3 q2 = new Queue3(name);
        char ch;
        int i;
        for(i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
            Queue3 q3 = new Queue3(q1);
            System.out.print("Contents of q1: ");
            for(i = 0; i < 10; i++) {
                ch = q1.get();
                System.out.print(ch);
            }
            System.out.println("\n");
            System.out.print("Contents of q2: ");
            for(i = 0; i < 3; i++){
                ch = q2.get();
                System.out.print(ch);
            }
            System.out.println("\n");
            System.out.print("Contents of q3: ");
            for (i=0; i < 10; i++) {
                ch = q3.get();
                System.out.print(ch);
            }
        }

    }
}
