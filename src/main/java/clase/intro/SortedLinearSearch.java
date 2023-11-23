package clase.intro;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class SortedLinearSearch {
    public static int indexOf(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            {
                if (a[i] == key)
                    return i;
                else
                    if(a[i] > key)
                        return -1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (indexOf(key, whitelist) == -1){
                StdOut.println(key);
            }
        }
    }



}
