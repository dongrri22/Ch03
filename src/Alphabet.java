import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하세요>> ");
        String text = scanner.next();
        char c = text.charAt(0);

        for(char i=c; i>='a'; i--) {
            for(char j='a'; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
