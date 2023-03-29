public class HW_2 {
    public static void main(String[] args) {
        int a = 17;
        int b = 8;
        int sum = a +b;
        int sub =  a - b;
        int mult = a * b;
        int div = a / b;
        int rem = a % b;
        System.out.println(" сумма чисел а и b = " + sum + "\n" +
                " разность чисел a и b = " + sub + "\n" +
                " произведение чисел a и b = " + mult + "\n" +
                " частное чисел a и b = " + div + "\n" +
                " остаток от деления чисел a и b = " + rem + "\n" );
        if ( a % 2 == 0){
            System.out.println(a + " - четное число");
        } else {
            System.out.println(a + " - нечетное число");
        }
        if ( b % 2 == 0){
            System.out.println(b + " - четное число");
        } else {
            System.out.println(b + " - нечетное число");
        }
        String smail = "\uD83D\uDE00";
        System.out.println(smail);
        // \0uD83D\0uDE00
    }
}