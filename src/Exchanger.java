import java.util.Scanner;

public class Exchanger {
    public static void main(String[] args){
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하세요>> ");
        int money = scanner.nextInt();

        for(int i=0; i<unit.length; i++) {
            if (money / unit[i] == 0) continue;
            else {
                System.out.println(unit[i] + "원 짜리: " + money / unit[i] + "개");
                money = money - unit[i] * (money / unit[i]);
            }
        }
        scanner.close();
    }
}
