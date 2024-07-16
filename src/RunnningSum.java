import java.lang.reflect.Array;
import java.util.Arrays;

public class RunnningSum {
    public static void main(String[] args) {
            int [] sum ={1,2,3,4};
        for(int i=0;i<3;i++){
            int start_value=1;
            int end_value= sum.length;
            int output = 1;
            output+=i;
        }
        System.out.println(Arrays.toString(sum));
    }
}
