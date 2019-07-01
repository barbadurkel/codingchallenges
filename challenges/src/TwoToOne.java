import java.util.Arrays;

public class TwoToOne {

    /**
     *
     Take 2 strings s1 and s2 including only letters from ato z.
     Return a new sorted string, the longest possible, containing distinct letters,

     each taken only once - coming from s1 or s2.
     *
     */


    public static String longest(String s1, String s2){
        String res = s1 + s2;

        char tempArray[] = res.toCharArray();
        Arrays.sort(tempArray);

        res = new String(tempArray);

        for (int i =0; i<res.length() -1 ; i++){
            if(res.charAt(i) == res.charAt(i+1)) {
                // remove the i+1 character, then re-check the new i vs i+1
                res = res.substring(0, i + 1) + res.substring(i + 2);
                i--;
            }
        }

        return res;
    }



}
