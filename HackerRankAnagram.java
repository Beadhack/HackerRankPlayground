
import java.util.Scanner;
/**
 *
 * @author prtaylor
 */
public class HackerRankAnagram {
    
    
    static boolean isAnagram(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        
        if (aLen != bLen) {
            return false;
        }
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        
        String aSpace = aLower + " ";
        String bSpace = bLower + " ";
        
        for (int i=0; i< aLen; i++) {
            String lett = aSpace.substring(i,i+1);
            int aLettCount = frequencyCounter(lett,aSpace,aLen);
            int bLettCount = frequencyCounter(lett,bSpace,bLen);
            if (aLettCount != bLettCount ) {
                return false;
            }
        }
        return true;
    }    
    static int frequencyCounter(String lett, String s, int length){
        int count = 0;
        for ( int i=0; i<length; i++) {
            if(lett.equals(s.substring(i,i+1))){
                count++;
            }
        }
        return count;
    }
    
    
   public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
