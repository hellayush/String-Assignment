import java.util.Scanner;
public class stringprog1 {

    public static void main(String[] args)
    {
        String s1 = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the strng :");
         s1 = scan.nextLine();
        
        String s2 = "";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2= s2 + s1.charAt(i) ;
        }
        System.out.println(s2 + " ");
    }
}