public class ArrayPrinter {
    public static void main(String[] args){
        int[][] n = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};

        System.out.println("2차원 배열 n을 출력하는 프로그램.");
        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[i].length; j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}
