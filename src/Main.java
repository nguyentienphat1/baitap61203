import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        int chan=0;
        int le=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x= scanner.nextInt();
        System.out.println(" nhap y");
        y= scanner.nextInt();
        for (int i=x;i<=y;i++){
            if (i%2==0){
                chan++;
            }else{
                    le++;

            }
        }
        System.out.println("so le la:"+le);
        System.out.println("so chan la:"+chan);
    }
}