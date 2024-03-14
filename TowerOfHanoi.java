public class TowerOfHanoi {
    
    // Method to solve Tower of Hanoi and return the number of moves
    public static int towerOfHanoi(int n, char from, char to, char aux) {
        int moves = 0; // Initialize moves counter
        
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            moves = 1; // Increment moves counter by 1
        } else {
            moves += towerOfHanoi(n - 1, from, aux, to); // Move n-1 disks from 'from' to 'aux'
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            moves++; // Increment moves counter by 1 for the current move
            moves += towerOfHanoi(n - 1, aux, to, from); // Move n-1 disks from 'aux' to 'to'
        }
        
        return moves; // Return total number of moves
    }
    
    public static void main(String[] args) {
        int n = 5; // Number of disks
        int totalMoves = towerOfHanoi(n, 'S', 'D', 'H');
        System.out.println("Total moves required: " + totalMoves);
    }
}
