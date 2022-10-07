package PackageB;

import java.util.Set;
import java.util.stream.IntStream;

public class p6 {
    private static float Mean(float[] numbers){

        float total = 0;
        int jumlahdata = numbers.length;

        for (int i = 0; i<jumlahdata;i++){
            total += numbers[i] ;
        }

        return total/jumlahdata;
    }
    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value));
    }
}
