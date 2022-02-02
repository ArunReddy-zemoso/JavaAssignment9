import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence=sc.nextLine();
        Boolean startsWithCapital= Pattern.compile("[A-Z].*").matcher(sentence).matches();
        Boolean endsWithPeriod=Pattern.compile(".*\\.").matcher(sentence).matches();
        if(startsWithCapital && endsWithPeriod)
            System.out.println("Sentence following Grammer");
        else if(startsWithCapital)
            System.out.println("Not end with '.'");
        else if(endsWithPeriod)
            System.out.println("Not start with capital");
        else
            System.out.println("not start with capital and endwith '.");
    }
}
