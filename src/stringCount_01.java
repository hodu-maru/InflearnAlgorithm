import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class stringCount_01 {

    public static void main(String args[]) throws IOException {
        stringCount_01 main = new stringCount_01();

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        char targetChar = scanner.next().charAt(0);

        System.out.println(main.solution(str,targetChar));
    }

    public static int solution(String str,char targetChar){

        str = str.toUpperCase(Locale.ROOT);
        //str을 전부 대문자로 만듦

        targetChar = Character.toUpperCase(targetChar);
        //target을 대문자로 만듦

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(targetChar == str.charAt(i))
                count++;
        }

        return count;

    }

}
