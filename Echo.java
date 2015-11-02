/* simple echo app */

public class Echo {
    public static void main(String[] args) {
        String rlt = null;

        System.out.println("this echo is from project/blog");

        for (int i = 1; i < args.length; i++) {
            rlt += args[i] + " ";
        }

        System.out.println(rlt);
    }
}
