import java.util.Arrays;

public class RemoveEleArray {
    public static void main(String[] args) {
        int[] X = {5,10,32,20,80};
        System.out.println("Actual Array: "+ Arrays.toString(X));
        int index = 2;
        System.out.println("Element to be remove at index :"+ index);
        int [] Y = new int[X.length - 1];
        System.arraycopy(X,0,Y,0,index);
        System.arraycopy(X,index+1,Y,index,X.length-index-1);
        System.out.println("Arrays after removing Element" + Arrays.toString(Y));
    }
}
