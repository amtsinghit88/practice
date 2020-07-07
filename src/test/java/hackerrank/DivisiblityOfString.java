package hackerrank;

public class DivisiblityOfString {

    public static void main(String [] args){

        String s = "bcdbcdbcdbcd", t = "bcdbcd";
        System.out.println(findSmallDivisor(s,t));
    }

    private static int  findSmallDivisor(String s, String t) {

        if (s.length() % t.length() > 0) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i*t.length()<s.length();i++){
            sb.append(t);
        }

        if(!sb.toString().equals(s))
            return -1;
        for(int i=1;i<=t.length();i++) {
            sb = new StringBuilder();
            String subStr = t.substring(0, i);
            while(sb.length() < t.length()) {
                sb.append(subStr);
            }
            if(sb.toString().equals(t))
                return i;
        }
        return -1;
    }
}
