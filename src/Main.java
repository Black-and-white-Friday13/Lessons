import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by abegansky on 12.09.16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++){
            mass[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = mass.length-1; i >= 0; i-- ){
            System.out.println(mass[i]);
        }
    }
}
