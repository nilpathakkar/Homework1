import java.util.Arrays;
import java.util.Collections;

public class AscendingValues {
    public static void main(String[] args) {
        int[]array=new int[]{2,4,5,3,1};
        System.out.println("Numbers are before shorting in Ascending order");
        for (int i=0;i<array.length;i++)
            System.out.println(array[i]);
        Arrays.sort(array);
        System.out.println("Numbers are in Ascending order");

        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);


            }




    }
}
