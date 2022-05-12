public class Transpose {
    private static Object[][] original;

    public static void main(String[] args) {
        int A[][]={{1,2,3},{3,4,5},{5,6,7}};

        int transposeA[] []= new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                transposeA[i][j] = A[j][i];
            }
        }
        System.out.println("Original Matrix:");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
            System.out.print(A[i][j] +" ");
        }
            System.out.println();
    }
        System.out.println("Transpose Matrix");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(transposeA[i][j] + " ");
            }
            System.out.println();
        }
}}
