import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true){
            
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
            if(a==1){
        int x=(int)Math.floor(Math.random()*(101));
        int y=(int)Math.floor(Math.random()*(101));
        System.out.println("R("+x+","+y+")");
            }
    }}
}
