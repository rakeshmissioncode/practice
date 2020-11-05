package arrays;

import java.util.ArrayList;
import java.util.List;

public class sLoutions {
    public static void main(String[] args) {
        String [] arr={"bella","label","roller"};
        List<String>result=commonChars2(arr);

        for(String s:result){
            System.out.printf(" " +s);
        }
    }

    public static  List<String> commonChars2(String[] A) {
        List<String> ans = new ArrayList<>();
        for(char c:A[0].toCharArray()){
           // System.out.printf("Charater "+c);
            boolean flag=false;
            for(int i=0;i<A.length;i++){
               // System.out.printf("Charater "+c);
                if(A[i].contains(Character.toString(c))){
                    flag=true;
                }
                else{

                    flag=false;
                }

            }
            if(flag){
                ans.add(Character.toString(c));
            }

        }
        return ans;
    }

    public static  List<String> commonChars(String[] A) {



            int[][] count = new int[A.length][26];

            List<String> ans = new ArrayList<>();

            for(int i = 0; i < A.length; i++) {

                for(char ch : A[i].toCharArray()) {

                    count[i][ch - 'a']++;
                }
            }

            int[] res = new int[26];
            int min = 0;

            for(int j = 0; j < 26; j++) {

                min = count[0][j];
                for(int i = 0; i < count.length; i++) {

                    min = Math.min(min, count[i][j]);
                }
                res[j] = min;
            }

            for(int j = 0; j < 26; j++) {

                int c = res[j];
                while(c > 0) {
                    char f= (char) ('a'+j);
                    ans.add(Character.toString(f));
                    c--;
                }
            }

            return ans;
        }
    }

