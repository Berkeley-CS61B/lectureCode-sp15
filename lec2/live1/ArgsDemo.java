public class ArgsDemo {
    public static void main(String[] args) {
        int index = 0;
        int sum = 0;
        while (index < args.length) {
            sum = sum + Integer.parseInt(args[index]);
//            System.out.println(args[index]);
            index += 1;
        }

        System.out.println(sum);
    }
}