package PackageB;

import java.sql.Struct;

public class p5 {
        private static String UbahHuruf(String s){
                int key = 10;
                String[] huruf = new String[26];

                for (char c='A';c<='Z';c++)
                        huruf[c-65] =String.valueOf(c);

                String cipher = "";
                loop1:
                for(int a = 0; a < s.length();a++){
                        int index_plain = -1;
                        for(int b = 0; b < huruf.length; b++){
                                index_plain = (String.valueOf(s.charAt(a)).equals(huruf[b]))? b : -1;

                                if (index_plain != -1){
                                        cipher += huruf[(index_plain+key)%26];
                                        continue loop1;
                                }
                        }
                        cipher += s.charAt(a);
                }

                return cipher;
        }
        public static void main(String[] args) {
                System.out.println(UbahHuruf("SEPULSA OKE"));
                System.out.println(UbahHuruf("ALTERRA ACADEMY"));
                System.out.println(UbahHuruf("INDONESIA"));
                System.out.println(UbahHuruf("GOLANG"));
                System.out.println(UbahHuruf("PROGRAMMER"));
        }
}
