public class RecursivePaths {

    /*
    *You are standing at the point (n,m) of the grid of positive integers and want to go to origin (0,0) by taking steps either to left or down:
    * that is, from each point (n,m) you are allowed to move either to the point (n-1, m) or the point (n, m-1).
    *  Implement the countPaths method that based on recursion counts the number of different paths from the point (n,m) to the origin.
    * */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(countPaths(3,3));
    }

    public static int countPaths(int n, int m){
        //base case
        if(n == 1 || m == 1){
            return 1;
        }
        return countPaths(n-1, m) + countPaths(n, m - 1);

        //method to implement. remember: find the base cases, then find the recursive step(s).

    }


}
