public class setBits {
    
    // Function to count the number of set bits in a number
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1; // Add 1 if the rightmost bit is set
            n >>= 1; // Shift the number to the right by 1 bit
        }
        return count;
    }
    
    public static void main(String[] args) {
        int num = 7; // Example number
        int setBitsCount = countSetBits(num);
        System.out.println("Number of set bits in " + num + " is: " + setBitsCount);
    }
}
