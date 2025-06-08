public class Reverse {
    public static void main(String[] args) {
        System.out.println(Reverse(123));
    }
    public  static int  Reverse(int number)
    {
        int rem=0,rev=0;
        while(number!=0)
        {
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;

        }
        return rev;
    }

}
