package PatternProblem;

public class first {
    /* 1 2 3 4 
     * 1 2 3 4 
     * 1 2 3 4
     * 1 2 3 4
     */
    public static void main(String[] args) {
        // int n=4;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // Another Method of using while loop
         
        // System.out.println();
        // int i=1;
        // while(i<=n){
        //     int j=1;
        //     while(j<=n){
        //         // System.out.print(j+" ");
        //         System.out.print(n-j+1+" ");// if you want to print reverse of row ex->4 3 2 1
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // 2 nd Question 
        /* n =3;
         * 1 2 3 
         * 4 5 6
         * 7 8 9
         */
        int n =3;
        int count =1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
