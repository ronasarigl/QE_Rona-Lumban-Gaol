package PackageB;

public class p2 {
    private static void PlayWithAsterisk(int n){
        for (int i = 0; i<= n; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PlayWithAsterisk(5);
    }
}
