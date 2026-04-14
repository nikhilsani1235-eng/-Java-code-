public class SwapThreeNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);

        
        int temp = a; 
        a = c;        
        c = b;        
        b = temp;    

        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
    }
}
