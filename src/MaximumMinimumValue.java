public class MaximumMinimumValue {
    private static int getMax(int[]B){
        int max = Integer.MIN_VALUE;
        for (int i:B){
            max = Math.max(max,i);
        }
        return max;
    }
    private static int getMIN(int[]B){
        int min = Integer.MAX_VALUE;
        for (int i:B){
            min=Math.min(min,i);
        }
        return min;
    }

    public static void main(String[] args) {
        int[ ] B ={1,15,27,36,50};
        System.out.println("Minimum value is "+ getMIN(B));
        System.out.println("Maximum value is "+ getMax(B));
    }
}
