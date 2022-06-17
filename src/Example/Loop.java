package Example;

public class Loop {
    public static void main(String[] args) {
        int number = 6;
        for (int row = 1; row <= 6; row++) {
            for (int num = 1; num <= row; num++) {

             System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}