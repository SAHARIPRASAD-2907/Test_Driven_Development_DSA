import java.util.Arrays;

public class ExReverseString {
    public String reverseString(String str){
//        String string="whatever";
//        String reverse = new StringBuffer(string).reverse().toString();
//        System.out.println(reverse);
        if(str.length()==0) return "No String to reverse";
        if(str.length()==1) return str;
        char[] ch = str.toCharArray(); //O(n)
        int i,j=0;
        int len = str.length()-1;
        char[] rev = new char[str.length()];
        for (i = len; i>-1;i--) { //o(n)
            rev[j] = ch[i];
            j++;
        }
        return new String(rev);
    }
}
