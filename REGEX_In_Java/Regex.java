package REGEX_In_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/regex/package-summary.html ">Java Docs</a>
 */
public class Regex {

    public static void main(String[] args) {

        while(true) {
            String regex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
            Pattern pattern = Pattern.compile(regex);
            System.out.println("Enter the string : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            Matcher matcher = pattern.matcher(str);
            boolean isMatch = matcher.matches();
            System.out.println(isMatch);

            System.out.println("Continue : ");
            int choice= sc.nextInt();
            if(choice==1)
            {
                continue;
            }
            else
                break;
        }
    }

}
