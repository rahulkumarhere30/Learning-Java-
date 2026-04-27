public class Recursion2A {
    //Count total paths in a maze to move from (0,0) to (n,m)

    public static int countPaths(int i, int j, int n, int m){
        //Base case
        if(i == n-1 && j == m-1){
            return 1;
        }
        if(i >= n || j >= m){
            return 0;
        }

        //Kaam
        int downPaths = countPaths(i+1, j, n, m);
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String args[]) {
        int n = 3;
        int m = 3;
        
        int totalPaths = countPaths(0,0,n,m);
        System.out.println("Total paths: " + totalPaths);
    }
}
