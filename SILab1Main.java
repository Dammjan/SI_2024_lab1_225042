import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SILab1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
<<<<<<< HEAD
      System.out.println(SILab1_1.filterOddLengthStrings(list));
=======
          System.out.println(SILab1_2.makeBigStringFrom(list)); 
>>>>>>> afcc0255b0c064e71e0c52288307b85435e5db36
    }
}
