import java.util.Random;
import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {
        int c, b;
        Scanner scanner_variable = new Scanner(System.in);
        System.out.print("Введи сложность 3,4 or 5: ");
        int start_number = scanner_variable.nextInt();

        //генерируем  случайное уникальное число
        int[] start_array = new int[start_number];
        Random rand = new Random();

        for (int i = 0; i < start_number; i++) {
            start_array[i] = rand.nextInt(10);

            int j = i - 1;
            boolean foundNumber = false;
            while (j >= 0){
                if (start_array[i] == start_array[j]){
                    foundNumber = true;
                    break;
                }
                j--;
            }

            if (foundNumber) {
                i--;
            }
        }

        for (int i = 0; i < start_number; i++) {
            System.out.print(start_array[i]);
        }


        do {
            int[] arrUser = userNumber(start_number);
            if (arrUser[0] == 999) break;
            int[] resultArr = bullsCows(start_array, arrUser);
            c = resultArr[1];
            b = resultArr[0];
            System.out.println("Быки: " + c + ", " + "Коровы: " + b);
            if (c == start_number){
                System.out.println("Вы выйграли!");
            }

        }while (c != start_number);



    }

    public static int[] userNumber(int start_number){
        Scanner scanner_variable = new Scanner(System.in);
        System.out.print("\nВведи свой ответ: ");
        String lose;
        lose = scanner_variable.nextLine();
        if (lose.compareTo("сдаюсь") == 0){
            return new int[] {999};
        }

        String strAll[] = lose.split("");
        int[] arrUser = new int[start_number];

        for (int i = 0; i < lose.length(); i++) {
            arrUser[i] = Integer.parseInt(strAll[i]);
        }

        return arrUser;
    }

    public static int[] bullsCows(int[] start, int[] user){
        int c = 0;
        int b = 0;
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < user.length; j++) {
                if (start[i] == user[j]){
                    c++;
                    if (i == j) b++;
                }
            }
        }
        return new int[] {c,b};
    }
}
