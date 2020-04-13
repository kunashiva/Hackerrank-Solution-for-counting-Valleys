import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class countingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int upstream=0,downstream=0;
        int valley=0;
        int iter=0;

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)== 'u')
            {
                upstream++;
            }
            else
            {
                downstream++;
            }
            if(upstream==downstream)
            {
                upstream=0;
                downstream=0;
                iter=0;
            }
            
            if((downstream>upstream)&&(iter==0))
            {
                valley++;
                iter++;
            }
            
        }
        return valley;



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();
        s=s.toLowerCase();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}