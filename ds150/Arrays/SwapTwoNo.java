public class SwapTwoNo {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //with third variable
        int temp=a;
        a=b;
        b=temp;

        //without using third variable
        
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);
    }
}
