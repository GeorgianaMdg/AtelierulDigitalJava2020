package lab1;

public class Challenge1 {
    public static void main(String[] args) {
        System.out.println("Challenge1");
        for(int i=1; i<=100; i++)
        {
            if(i%3==0){
                System.out.println("fizz");
            }
            else if(i%5==0){
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }
}