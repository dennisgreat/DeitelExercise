package Example;

import javax.swing.*;

public class WhileCounter {
    public static void main(String[] args) {

        int counter = 2;
        while (counter <= 10) {
            System.out.printf("%d ", counter );
            ++counter;
        }
        System.out.println();
    }
}