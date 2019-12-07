package competitive;

import java.io.*;
import java.util.*;


import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A=0; i_A<arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        int[][] out_ = countConnect(A);
        for(int i_out_=0; i_out_<out_.length; i_out_++)
        {
            System.out.println(out_[i_out_][0]);
            for(int j_out_=1; j_out_<out_[i_out_].length; j_out_++)
            {
                System.out.print(out_[i_out_][j_out_]+ " ");
            }
            System.out.println("");
        }

        wr.close();
        br.close();
    }
    static int[][] countConnect(int[] A){
        // Write your code here
        int[][] result = new int[2][];
        result[0] = new int[1];

        for(int i=0;i<A.length;i++){
            int indexHIghest = getIndexOfHighest(A, i);
            if(indexHIghest != i){
                A[indexHIghest] = A[i] ^ A[indexHIghest];
                result[0][0] = result[0][0] + 1;
            }
            else{
                continue;
            }


        }

        return result;
    }

    static int getIndexOfHighest(int[] arr, int start){
        int high = arr[start];
        int index = 0;
        for(int i=start;i<arr.length;i++){
            if(arr[i]> high){
                high = arr[i];
                index = i;
            }
        }

        return index;
    }
}