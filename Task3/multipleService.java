package Task3;

import java.util.ArrayList;
import java.util.List;

public class multipleService {
    public static void main(String[] args) {

        int[] listOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> divisableBy3 = new ArrayList<Integer>();

        for (int i = 1; i < listOfNumbers.length; i++) {
            int temp = listOfNumbers[i];

            if (temp % 3 == 0) {
                divisableBy3.add(temp);
            }
        }

               for (int num : divisableBy3) {
            System.out.println("Number divisable by 3 : " + num);
        }
    }
}