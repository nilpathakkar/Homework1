public class totalnumberofa {
    public static void main(String[] args) {
        String string = "Today is Tuesday";
        int count = 0;
        for (int i=0;i<string.length();i++){
            if (string.charAt( i )=='a'){
                count++;
            }
        }
        System.out.println("The total number of charactar 'a' in a spring ="+count);

    }

}
