//this is th e most stupid I can get, don't judge me cause I'm the God of Dumb guys!
import java.util.*;
class script {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String ans1, ans2, ans3, array1[] = {"H", "e", "l", "l", "o"}, array2[] = {"W", "o", "r", "l", "d"};
         int count = 0;
         System.out.println("What is your name?: ");
         ans1 = sc.next();

         System.out.println("What is your morning like?: ");
         ans2 = sc.next();

         System.out.println("Do you have a small pp?: ");
         ans3 = sc.next();
         sc.close();

         if(ans3.toLowerCase().equals("yes")) {
            for (int j = 0; j < 2; j++) {
                for(int i = 0; i < array2.length; i++) {
                    if (count == 0)
                        break;
                    else {
                        System.out.print(array2[i]);
                        }
                    }

                for(int i = 0; i < array1.length; i++) {
                    if (count == 1)
                        break;
                    else {
                        System.out.print(array1[i]);
                        }
                    }
                count++;
                System.out.print(' ');
                }
            }

         else if (ans3.toLowerCase().equals("no")){
            System.out.println("You lied to not have a small pp you liar!");
            System.exit(0);
        }

         else {
             System.out.println("Oof even my code is smarter than you, you extreme garbage of the stupid mankind!");
         }
             
     }
}