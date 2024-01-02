package work;
import work.folder1.demo1;

public class Demo2 {
    static int num1=10;
    int num2=20;
    public static void main(String[] args) {
        int num3=30;
        demo1 demo=new demo1();
        Demo2 demo2=new Demo2();
        Demo3 demo3=new Demo3();
        System.out.println("Mark value--"+demo.mark);
        System.out.println("num1="+num1);
        System.out.println("num2="+demo2.num2);
        System.out.println("num3="+num3);
        System.out.println("num4="+demo3.num4);
        System.out.println("num5="+Demo3.num5);
    }
}
class Demo3
{
    int num4=40;
    static int num5=50;
}
