package p1;
//static and early binding
public class cpoly {
    public static void main(String[] args) {
        System.out.println("A");
        cpoly cc = new cpoly();
        cc.m1();
    }

    public static void main() {
        System.out.println("E");
    }
    void m1(int a){
        System.out.println("B");
    }
    void m1(){
        System.out.println("C");
    }
    void m1(int a,String b){
        System.out.println("D");
    }

}
