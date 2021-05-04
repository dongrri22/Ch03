import java.util.Scanner;

public class CourseAndScore {
    public static void main(String[] args){
        String[] course = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int[] score = {96,88,76,62,55};
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("과목 이름>>");
            String input = sc.next();
            if(input.equals("그만")){
                break;
            }else {
                int output=0;
                for (int i = 0; i < course.length; i++) {
                    if (course[i].equals(input))
                        output = score[i];
                }
                if(output!=0)
                    System.out.println(input + "의 점수는 " + output);
                else
                    System.out.println("없는 과목입니다.");
            }
        }
        sc.close();
    }
}
