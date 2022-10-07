package PackageA;

public class p1 {

    static double LuasSegitiga(float a, float t){
        return 0.5*a*t;
    }
    public static void main(String[] args) {
        double luas = LuasSegitiga(20, 25);
        System.out.println("Luas segitiga = "+luas);

    }
}
