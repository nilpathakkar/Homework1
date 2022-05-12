import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {


        String[] array1 = {"Apple", "Ball", "Cat", "Dog", "Elephant"};
        String[] array2 = {"Fish","Cat","Igloo","jar","Apple"};
        System.out.println("array 1 :" + Arrays.toString(array1));
        System.out.println("array 2 :" + Arrays.toString(array2));
        System.out.println("Common elements between array1 and array2 :  ");
        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j]))
                {
                    System.out.println (array1[i]);
                }

            }

        }
    }
}













