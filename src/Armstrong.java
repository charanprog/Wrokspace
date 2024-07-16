public class Armstrong {
    public static void main(String[] args) {
        int a = 100;
        int b = 1000;
        System.out.println("Armstrong numbers betwee"+  a + "and" +  b + " are :" );
        for(int i = a; i<b ; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrong(int i){
        int original ;
        int sum = 0 ;
        int rem;
        original =i;
                while (original!=0) {
                 rem = original % 10;
                 sum = sum + rem * rem * rem;
                 original/= 10;
            }
         return sum == i;
        }
    }

