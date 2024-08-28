import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class RandomWord {
    public static void main(String[] args) {
        System.out.println("RandomWord.main");
        // if (!StdIn.isEmpty()) {
        if (args.length != 0) {

            // String champion = StdIn.readString();
            String champion = args[0];

            System.out.println("champion = " + champion);
            System.out.println("args = " + Arrays.toString(args));


            for (int i = 1; i < args.length; i++) {
                if (StdRandom.bernoulli((double) 1 /i) )
                {
                    System.out.println("podmieniam na " + args[i]);
                    champion = args[i];
                }
            }
            System.out.println(champion);
        } else System.out.println("empty");
    }
}
