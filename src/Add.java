public class Add {
    public static void main(String[] args){
        int sum = 0;
        for(int i=0; i<args.length; i++) {
            try {
                int input = Integer.parseInt(args[i]);
                sum = sum + input;
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(sum);
    }
}
