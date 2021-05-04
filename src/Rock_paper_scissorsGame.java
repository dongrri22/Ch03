import java.util.Scanner;

public class Rock_paper_scissorsGame {
    public static void main(String[] args){
        String[] str = {"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("가위 바위 보!>>");
            String user = sc.next();
            if(user.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            } else {
                int n = (int)(Math.random()*3);
                String com = str[n];
                if(com.equals("바위")){
                    if(user.equals("보"))
                        System.out.println("사용자: "+user+", 컴퓨터: "+com+", 사용자가 이겼습니다.");
                    else if(user.equals("가위"))
                        System.out.println("사용자: "+user+", 컴퓨터: "+com+", 컴퓨터가 이겼습니다.");
                    else
                        System.out.println("사용자: "+user+", 컴퓨터: "+com+", 비겼습니다.");
                }else if(com.equals("가위")){
                    if(user.equals("바위"))
                        System.out.println("사용자: "+user+", 컴퓨터: "+com+", 사용자가 이겼습니다.");
                    else if(user.equals("보"))
                        System.out.println("사용자: "+user+", 컴퓨터: "+com+", 컴퓨터가 이겼습니다.");
                    else
                        System.out.println("사용자: "+user+", 컴퓨터: "+com+", 비겼습니다.");
                }else if(com.equals("보")){
                    if(user.equals("가위"))
                        System.out.println("사용자: "+user+", 컴퓨터: "+com+", 사용자가 이겼습니다.");
                    else if(user.equals("보"))
                        System.out.println("사용자: "+user+", 컴퓨터: "+com+", 컴퓨터가 이겼습니다.");
                    else
                        System.out.println("사용자: "+user+", 컴퓨터: "+com+", 비겼습니다.");
                }
            }
        }
        sc.close();
    }
}
