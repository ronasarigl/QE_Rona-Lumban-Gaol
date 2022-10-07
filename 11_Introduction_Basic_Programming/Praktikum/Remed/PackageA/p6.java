package PackageA;

import java.nio.file.LinkOption;
import java.util.Scanner;

public class p6 {
    private static boolean palindrom(String Value){
        String a = "";
        boolean B = false;
        //if(Value.length() %2 == 0){
        for(int i = Value.length()-1; i >= 0; i--){
            a = a + Value.charAt(i);
        }
        if(Value.equals(a)){
            B=true;
        }
        return B;
    }

    /*else{
        for(int i = 0; i < (Value.length()-1)/2-1; i++){
            if(i != Value.length()-i-1){
                return false;
            }else{
                return true;
            }
        }
    }
    return false;
}*/
    public static void main(String[] args) {

        System.out.println(palindrom("civic"));//True
        System.out.println(palindrom("katak"));//True
        System.out.println(palindrom("kasur rusak"));//True
        System.out.println(palindrom("kupu-kupu"));//False
        System.out.println(palindrom("lion"));//False

    }

}


