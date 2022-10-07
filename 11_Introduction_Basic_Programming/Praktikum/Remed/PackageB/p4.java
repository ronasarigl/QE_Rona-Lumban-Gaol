package PackageB;

public class p4{
    private static void CetakPerkalian(int n) {
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(" "+ i * j + "\t");
            }
            System.out.print("\n\n");
        }
    }
    public static void main(String[] args) {
        CetakPerkalian(9);
    }
}

