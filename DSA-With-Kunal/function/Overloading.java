import java.util.Arrays;

public class Overloading {

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void sum(int a, int b)
    {
        System.out.println(a + b);
    }
    static void sum(int ...c){
        System.out.println(Arrays.toString(c));
    }
    
    public static void main(String[] args) {
        fun("Usman");
        sum(4,6);
    }
}
