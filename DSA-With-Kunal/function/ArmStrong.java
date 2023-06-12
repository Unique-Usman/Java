public class ArmStrong {
    public static void main(String[] args) {
        // System.out.println(isArmstrong(23));

        for (int i = 100; i < 1000; i++){
            if (isArmstrong(i)) System.out.println(i);
        }
    }
    static boolean isArmstrong(int num){
        int sum = 0;
        
        Integer n = num;
        int tmp = num;        
        int count  = n.toString().length();
        while (num != 0){
            int rem = num %10;
            sum += Math.pow(rem, count);
            num /= 10;
        }
        return (sum == tmp);

    }
}