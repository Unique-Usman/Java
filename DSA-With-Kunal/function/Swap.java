public class Swap {
    static void swap(int a, int b){

    }
    static void changeName(String name){
       name = "Fawaz";
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // int tmp = a;
        // a  = b;
        // b  = tmp; 

        swap(a, b);

        String name = "Usman Akinyemi";
        changeName(name);
        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
    }
}
