package PackageB;

public class p3 {
    private static void drawXYZ(int n){
        for (int a = 1; a < n; a++){
            for (int b = 1; b < n; b++){
                for(int c = 1; c < n; c++){
                    System.out.print(" " + a + b + c + "\t");
                }
            }
            System.out.print("\n\n");
        }
    }
    public static void main(String[] args) {
        drawXYZ(3);
        //drawXYZ(5);
        //drawXYZ(1);
    }
}

