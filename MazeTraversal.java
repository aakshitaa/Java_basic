public class MazeTraversal {
    public static int countpaths(int i, int j, int m, int n){
        if(i==n  || j==m) return 0;
        if(i==n-1 && j==m-1) return 1;
        int downwards= countpaths(i+1, j, m, n);
        int rightwards= countpaths(i, j+1, m, n);
        return downwards + rightwards;
    }
    public static void main(String[] args) {
        System.out.println(countpaths(0, 0, 2, 2));
    }
}
