package PatternProblem;

public class PaternProb {
    public static void main(String[] args) {
        int n = 5; // for all type of patern
        /*
         * *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */

        // int i=1; // Initialistaion
        // while (i<=n){ // While Conditton
        // for(int j=0 ;j<=i-1 ;j++){
        // System.out.print("* ");
        // }System.out.println();
        // ++i; // while increment/decrement;
        // }

        // 2 patern Question
        /*
         * * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         * 
         */
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >=i; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // 3.Patern Question
        /*
         
         * * * * * *
         *       *
         *     *
         *   *
         * *
         * 
         
         */

        //  for(int row=1;row<=n;row++){
        //    for(int col =1;col<=n;col++){
        //     if(row==1||col==1){
        //       System.out.print("* ");
        //     }
        //   }
        //   if(row>1){
        //     for(int space=1;space<=n-row;space++){
        //     System.out.print("  ");
        //   }
        //   }
        //   for(int col=1;col<=1;col++){
        //     System.out.print("* ");
        //   }         
        //   System.out.println();
        //  }


        // 4. patern
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= row; col++) { // is the best condition for print reverse
        //         System.out.print(col + " ");
        //     }
        //     System.out.println();
        // }

        // 4.1 patern
        /*
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n + 1 - row; col++) { // is the best condition for print reverse
        //         System.out.print(col + " ");
        //     }
        //     System.out.println();
        // }

        // 5 patern problem
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        // Ans : Print the above patern then you will add the 4 & 4.1 patern code/
//1 ans        
         // FOR print the above  patter  here is simeple & lest line of code
        //  for(int row =1 ; row<= 2*n ; row++){
        //     int totalNewUpdateRow = row > n ? 2*n-row: row;
        //     for(int col=1; col<=totalNewUpdateRow ; col++){
        //         System.out.print(row+" ");
        //     }
        //     System.out.println();
        //  }
//2 ans
        // for (int row = 1; row <=n; row++) {
        //     for(int col = 1; col<=row;col++){
        //         System.out.print(col+" ");
        //     }
        //     System.out.println();
        // }
        // for (int row = 1; row <=n; row++) {
        //     for(int col = 1; col<=n+1-row;col++){
        //         System.out.print(col+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        
        // 6 patern
        /*
          *            1
          * *          1 2
          * * *        1 2 3
          * * * *      1 2 3 4
          * * * * *    1 2 3 4 5
          * * * *      1 2 3 4 
          * * *        1 2 3 
          * *          1 2
          *            1
          ("* ")       (col+" ")
         */

         // FOR print the above  patter  here is simeple & lest line of code
        //  for(int row =1 ; row<= 2*n ; row++){
        //     int totalNewUpdateRow = row > n ? 2*n-row: row;
        //     for(int col=1; col<=totalNewUpdateRow ; col++){
        //         System.out.print(row+" ");
        //     }
        //     System.out.println();
        //  }


         //
        //  for (int row = 1; row < n; row++) {
        //     for(int col = 1; col<=row;col++){
        //         System.out.print("* "); //col
        //     }
        //     System.out.println();
        // }
        // for (int row = 1; row <=n; row++) {
        //     for(int col = 1; col<=n+1-row;col++){
        //         System.out.print("* ");  // col
        //     }
        //     System.out.println();
        // }

        // 7 patern highly specific Nice (* * * * *).....
        /*               *
                        * *
                       * * *
                     * * * * *
                    * * * * * *
                     * * * * *
                      * * * *
                       * * *
                        * *
                         * 
           */ 
          // for(int row=0;row<=2*n;row++){
          //   for(int space =)
          //   int UpdatedRow = row > n ? 2*n-row: row;
          //   for(int col =0;col<=UpdatedRow;col++){
          //       System.out.print("* ");
          //   }
          //   System.out.println();
          // }


          // 8. patern problem
          /*
             * * * * * *
             *         *
             *         *
             *         *
             *         *
             * * * * * *
           */
        //  for(int row =0; row< n ; row++){
        //    for(int col = 0; col< n ; col++){
        //       if(col==0 || row==0 || col==n-1 || row==n-1){
        //         System.out.print("* ");
        //       }else{
        //         System.out.print("  ");
        //       }
        //    }  
        //    System.out.println();
        // }


        // 9. patern problem 
        /*  
                       *
                     * *
                   * * *
                 * * * *
               * * * * *  
         */
        // for (int row = 1;row <=n; row++) {
        //   for(int space = row;space<=n;space++){
        //     System.out.print("  ");
        //   }
        //   for(int col = 1;col<=row;col++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        // }

        //10 patern problem
        /*
              * * * * *
               * * * *
                * * *
                 * *
                  *
         */
        // for(int row =0; row<n;row++){
        //   for(int space = 0; space<row;space++){
        //     System.out.print(" ");
        //   }
        //   for(int col =row;col<n;col++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        // }

        //11 patern problem
        /*
          * * * * *
            * * * *
              * * *
                * *
                  *
         */
        // for(int row =0; row<n;row++){

        //   for(int space = 0; space<=row;space++){
        //     System.out.print("  ");
        //   }
        //   for(int col=row;col<n;col++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        // }

        // 12. patern problem 
        /*
                       * 
                     * * * 
                   * * * * * 
                 * * * * * * * 
               * * * * * * * * * 
        */
        // for (int row = 1;row <=n; row++) {
        //   for(int space = row;space<=n;space++){
        //     System.out.print("  ");
        //   }
        //   for(int col = 1;col<row*2;col++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        // }

        // 13. patern problem 
        /* 
              * * * * * * * * * 
                * * * * * * * 
                  * * * * * 
                    * * * 
                      *  
                      * 
                     * * * 
                   * * * * * 
                 * * * * * * * 
               * * * * * * * * * 
        */

        // for(int row=1;row<=2*n;row++){
        //   int updaterowspace= row>n? 2*n-row:row;
        //   for(int space = 1; space<=updaterowspace;space++){
        //     System.out.print(" ");
        //   }
        //   // int updateRow= row>=n ? 2*n-row:row;
          
        //   for(int col =row;col<=n;col++){
        //     System.out.print("* ");
        //   }
        //   for(int col = 1;col<=row-n;col++){
        //     System.out.print(" *");
        //   }

        //   System.out.println();
        // }
        // System.out.println();
      
        //  . patern problem
        /*         1
                 2 1 2
               3 2 1 2 3
             4 3 2 1 2 3 4 
           5 4 3 2 1 2 3 4 5
        */ 

        // for(int row = 1;row<=n;row++){
        //   for(int space = 1;space<=n-row;space++){
        //     System.out.print("  ");
        //   }
        //   for(int col=row;col>=1;col--){
        //     System.out.print(col+" ");
        //   }
        //   for(int col=2;col<=row;col++){
        //     System.out.print(col+" ");
        //   }
        //   System.out.println();
        // }

        //  . patern problem
        /*         1
                 2 1 2
               3 2 1 2 3
             4 3 2 1 2 3 4 
           5 4 3 2 1 2 3 4 5
             4 3 2 1 2 3 4
               3 2 1 2 3
                 2 1 2
                   1
        */
        
        // This is for Row is it Outer Loop
        // for(int row =0;row<=2*n;row++){
          
        //   int updateRow = row>n ? 2*n-row:row;
        //   // this is for space print in row (inner Loop)
        //   for(int space = 1;space<=n-updateRow;space++){
        //     System.out.print("  ");
        //   }
        //   // This for print col value of left side from 1
        //   for(int col=updateRow;col>=1;col--){
        //     System.out.print(col+" ");
        //   }
        //   // This is also for print col value of right side from 1
        //   for(int col=2;col<=updateRow;col++){
        //     System.out.print(col+" ");
        //   }
        //   System.out.println();
        // }

        // Patern Problem

        /*
            5 5 5 5 5 5 5 5 5
            5 4 4 4 4 4 4 4 5
            5 4 3 3 3 3 3 4 5
            5 4 3 2 2 2 3 4 5
            5 4 3 2 1 2 3 4 5
            5 4 3 2 2 2 3 4 5
            5 4 3 3 3 3 3 4 5
            5 4 4 4 4 4 4 4 5
            5 5 5 5 5 5 5 5 5
        */

        /*Think in which patern coding is each box(specific element) have four distance as(left,right,uper,botom) = this element value is Min from these all four value  = you can analyse on papper 
         * And Here the four value is Right = n-col; | left = col | Upper = row | down = n-row
        */
        //  n = 2 * n;
        // for(int row=0;row<=n;row++){
        //   for(int col=0;col<=n;col++){
        //      int elementValue = Math.min(Math.min(row,col),Math.min(n-row,n-col));
        //      System.out.print(elementValue+" ");
        //   }
        //   System.out.println();
        // }

        // patern problem
        /* 
           *****
           *   *
           *   *
           *   *
           *****
        */
        // for(int row = 1; row<=n;row++){
        //   for(int col =1;col<=n;col++){
        //      if(row==1|| row==n ||col==1|| col==n){
        //       System.out.print("* ");
        //      }else{
        //       System.out.print("  ");
        //      }
        //   }
        //   System.out.println();
        // }

         // 6 patern
        /*                        r  c
          
          *                   *   1
          * *               * *   2
          * * *           * * *   3
          * * * *       * * * *   4
          * * * * *   * * * * *   5
          * * * * * * * * * * *   6
          * * * * *   * * * * *   7
          * * * *       * * * *   8
          * * *           * * *   9
          * *               * *   10
          *                   *   11

          ("* ")              (col+" ")
         */

         // FOR print the above  patter  here is simeple & lest line of code
        //  for(int row =1 ; row<= 2*n ; row++){
        //   int updateRow = row>n ? 2*n-row:row;
        //      for(int col = 1;col<=updateRow;col++){
        //          System.out.print("* ");
        //      }
        //      for(int space = 1;space<=n-updateRow;space++){
        //        System.out.print("  ");  // here if you write four backspace then you dont need to write below loop again for space print
        //       }
        //        for(int space = 1;space<=n-updateRow;space++){
        //           System.out.print("  ");
        //          }    
        //         for(int col = 1;col<=updateRow;col++){
        //             System.out.print("* ");
        //         }

        //     System.out.println();
        //  }

         // patern from Apna college toutorials
         /*
           *             *
           * *         * *
           * * *     * * *
           * * * * * * * *
           * * * * * * * *
           * * *     * * *
           * *         * *
           *             *
          */
          // System.out.println();

          // System.out.println();
          // n =4;
          // for(int row=1;row<=n;row++){
          //   for(int col=1;col<=row;col++){
          //     System.out.print("* ");
          //   }
          //   for(int space =1;space<=2*(n-row);space++){
          //     System.out.print("  ");
          //   }
          //   for(int col=1;col<=row;col++){
          //     System.out.print("* ");
          //   }
            
          //   System.out.println();
          // }
          // for(int row=n;row>=1;row--){
          //   for(int col=1;col<=row;col++){
          //     System.out.print("* ");
          //   }
          //   for(int space =1;space<=2*(n-row);space++){
          //     System.out.print("  ");
          //   }
          //   for(int col=1;col<=row;col++){
          //     System.out.print("* ");
          //   }
            
          //   System.out.println();
          // }


          // patern problem
          /* 
             1 2 3 4 5  
              2 3 4 5  
               3 4 5  
                4 5  
                 5    
             */
            //  for(int row=1;row<= n;row++){
            //    for(int space = 1 ; space <= row ; space++){
            //       System.out.print(" ");
            //    }
            //    for(int col = row ; col <= n ; col++){
            //       System.out.print(col+" ");
            //    }
            //    System.out.println();
            //  }


            // patern problem
            /*
                    *
                   * *
                  *   *
                 *     *
                *       *
               *         *
                *       *
                 *     *
                  *   *
                   * *
                    *
             */
                  //  int i, j;
        // int num = 1;
        // outer loop to handle upper part
        // for (int i = 1; i <= n; i++) {
        //     // inner loop to print spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // inner loop to print stars
        //     for (int j = 1; j <= 2 * i - 1; j++) {
        //         if (j == 1 || j == 2*i-1)
        //             System.out.print("*");
        //         else
        //             System.out.print("-");
        //     }
        //     System.out.println();
        // }
  
        // outer loop to handle lower part
        // for (int i = n-1; i >= 1; i--) {
        //     // inner loop to print spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // inner loop to print stars
        //     for (int j = 1; j <= 2 * i - 1; j++) {
        //         if (j == 1 || j == 2*i-1)
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // Patern Problem Solve
        /*
            * * * * * * * 
             *          *
              *        *
               *     *
                *  *
                  *
                *  *
               *     *
              *       *
             *         *
            * * * * * * *
         */
        // code
        n = 2*n;
        for(int row =1;row<n;row++){
          for(int col =1;col<n;col++){
            if(row==col ||row ==1||row==9){
              System.out.print("* ");
            }else if(row+col==9){
              System.out.print("* ");
            }else{
              System.out.print("  ");
            }
          }
          System.out.println();
        }
    }
}
