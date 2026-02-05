import java.util.*;

public class RomantoInteger {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int map[] = new int[128];

        String s = sc.next();

        map['I']=1; map['V']=5; map['X']=10;
        map['L']=50; map['C']=100; map['D']=500; map['M']=1000;

        int total = 0;
        int prev = 0;

        
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map[s.charAt(i)];

            if (current < prev)
                total -= current;
            else
                total += current;

            prev = current;
        }

        System.out.println(total);
    }
}
