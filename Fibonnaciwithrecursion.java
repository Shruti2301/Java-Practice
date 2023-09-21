public class Fibonnaciwithrecursion {
    
    static int num1 = 0, num2 = 1, num3 = 0;

    static void printFibonacci(int count)
    {
        if(count>0)
        {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" "+num3);
            printFibonacci(count-1);
        }
    }

    public static void main(String args[]){
        int count = 10;
        System.out.print(num1+" "+num2); // print 0 and 1
        printFibonacci(count-2); // 2 numbers already printed
    }
  

}