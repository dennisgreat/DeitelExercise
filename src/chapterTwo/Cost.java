package chapterTwo;
import java.util.Scanner;
    public class Cost{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("How many copies do you want?");
            int copies = input.nextInt();
            if (copies >= 1 ){
                if (copies <= 4){
                    int price = copies * 2000;

                    System.out.printf("Your total amount is %d%n", price);
                }
            }

            if (copies >= 5){
                if (copies <= 9){
                    int price = copies * 1800;
                    System.out.printf("Your total amount is %d%n",price);
                }
            }

            if (copies >= 10){
                if (copies <= 29){
                    int price = copies * 1600;
                    System.out.printf("Your total amount is %d%n", price);
                }
            }

            if (copies >= 30){
                if (copies <= 49){
                    int price = copies * 1500;
                    System.out.printf("Your total amount is %d%n", price);
                }
            }


            if (copies >= 50){
                if (copies <= 99){
                    int price = copies * 1300;
                    System.out.printf("Your total amount is %d%n", price);
                }
            }


            if (copies >= 100){
                if (copies <= 199){
                    int price = copies * 1200;
                    System.out.printf("Your total amount is %d%n", price);
                }
            }

            if (copies >= 200){
                if (copies <= 499){
                    int price = copies * 1100;
                    System.out.printf("Your total amount is %d%n", price);
                }
            }


            if (copies >= 500){
                int price = copies * 1000;
                System.out.printf("Your total amount is %d%n", price);
            }




        }
    }

