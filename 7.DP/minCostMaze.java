
import java.util.*;

public class minCostMaze {

      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++ ){
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[n][m];

        //backward direction filling dp array
        for(int i=n-1 ; i>=0 ; i--){
            for(int j=m-1 ; j>=0 ; j--){

                // four cases to solve

                // 1. single element
                if(i == n-1 && j == m-1){
                    dp[i][j] = arr[i][j];
                }

                // 2. last row
                else if(i==n-1){
                    dp[i][j] = dp[i][j+1] + arr[i][j];
                }

                // 3. last column
                else if(j == m-1){
                    dp[i][j] = dp[i+1][j] + arr[i][j];
                }

                // 4. all left out element
                else{

                    //compare for min -> then add the arr[i][j]
                   int min = Math.min(dp[i+1][j] , dp[i][j+1]);
                   dp[i][j] = min + arr[i][j];
                }
            }
        }

        System.out.println(dp[0][0]);
        scn.close();
    }

}