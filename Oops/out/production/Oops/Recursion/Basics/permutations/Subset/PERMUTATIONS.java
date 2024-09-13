package Recursion.Basics.permutations.Subset;

public class PERMUTATIONS {
    public static void main(String[] args) {
        permutations("","abc");
    }

    private static void permutations(String ps,String os) {
        if(os.isEmpty()){
            System.out.println(ps);
            return;
        }
        char ch=os.charAt(0);
        for(int i =0;i<ps.length();i++){
            String f=ps.substring(0,i);
            String s= ps.substring(i,ps.length());
            permutations(f+ch+s,os.substring(1));

        }
    }
}
