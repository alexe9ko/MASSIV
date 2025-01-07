import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи 1, 2 ");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] tail = {1.57, 7.654, 9.986};
        int[] free = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(tail));
        System.out.println(Arrays.toString(free));
        System.out.println("Задача 3");
        System.out.println(weight[2] + ", " + weight[1] + ", " + weight[0]);
        System.out.println(tail[2] + ", " + tail[1] + ", " + tail[0]);
        System.out.println(free[9] + ", " + free[8] + ", " + free[7] + ", " + free[6] + ", " + free[5] + ", " + free[4] + ", " + free[3] + ", " + free[2] + ", " + free[1] + ", " + free[0]);


        System.out.println("Задача 4");
        for (int l = 0; l < weight.length; l++) {
            if (weight[l]%2!= 0)
            { weight[l] = weight[l] + 1;
            }
            }
        System.out.println(Arrays.toString(weight));
        }

    }


