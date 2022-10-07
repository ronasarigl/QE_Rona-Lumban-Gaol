package PackageB;

public class p1 {
        private static int pangkat(int a, int b){
            double c = Math.pow(a,b);
            System.out.println(c);
            return 0;
        }
        public static void main(String[] args) {
            System.out.println(pangkat(2,3));
            System.out.println(pangkat(5,3));
            System.out.println(pangkat(10,2));
            System.out.println(pangkat(2,5));
            System.out.println(pangkat(7,3));
        }
    }

