import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String s;
            if(x<10){
                s="00"+String.valueOf(x);
            }
            else if (x<100){
                s="0"+String.valueOf(x);
            }else{
                s=String.valueOf(x);
            }

            String sol=s1;
            for(int j= 0;j<=(17-(s1.length()+s.length()));j++){
                sol=sol + " ";
            }
            sol=sol+s;
            System.out.println(sol);
        }
        System.out.println("================================");
    }
}

