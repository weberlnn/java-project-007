/**
 * Created by lin on 2016/8/23.
 */
class Stack {
    private char q[];
    private int putloc;//getloc;
    Stack(int size) {
        q = new char[size];
        putloc = 0;
        //getloc = 0;
    }
    Stack(Stack ob){
        putloc = ob.putloc;
        //getloc = ob.getlic;
        q = new char[ob.q.length];
        for(int i=putloc+1; i <= putloc; i++)//i=putloc
            q[i] = ob.q[i];
    }

    Stack(char a[]){
        putloc = 0;
        //getloc = 0;
        q = new char[a.length];
        for(int i = 0; i < a.length; i++) push(a[i]);
    }
    void push(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Stack is full.");
            return;
        }
        q[putloc] = ch;
        putloc++;

    }
    char pop() {
        if (0 == putloc) {
            System.out.println(" -Stack is empty");
            return (char) 0;
        }

        putloc--;
        return q[putloc];
    }
}
class QDemo {
    public static void main(String args[]) {
        Stack q1 = new Stack(10);
        char name[] = {'T', 'o', 'm'};
        Stack q2 = new Stack(name);
        char ch;
        int i;
        for(i = 0; i < 10; i++)
            q1.push((char) ('A' + i));
        Stack q = new Stack(q1);
        System.out.print("Contents of q1: ");
        for(i=0; i < 10; i++) {
            ch = q1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Contents of q2: ");
        for(i=0; i < 3; i++){
            ch = q2.pop();
            System.out.print(ch);
       /* }
        System.out.println("\n");
        System.out.print("Contents of q3: ");
        for(i=0; i < 10; i++){
            ch = q3.pop();
            System.out.print(ch);*/
        }
    }
}

