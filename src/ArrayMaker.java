import java.util.Scanner;

public class ArrayMaker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?>> ");
        int num = scanner.nextInt();
        int[] array = new int[num];;

        for(int i=0; i<array.length; i++){
            int input= (int)(Math.random()*100 +1);
            for(int j=0; j<i; j++){
                if(input==array[j]) {
                    j--;
                    continue;
                }
            }
            array[i] = input;
        }
        for(int i=0; i<array.length; i++){
            if(i%10==0)
                System.out.println();
            System.out.print(array[i]+" ");
        }
        scanner.close();
    }
}
