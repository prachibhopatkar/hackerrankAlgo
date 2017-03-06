/*
 * Consider a word consisting of lowercase English alphabetic letters, where each letter is  wide.
 *  Given the height of each letter in millimeters (),
 *  find the total area that will be highlighted by blue rectangle in when the given word is selected in our new PDF viewer.
 */
import java.util.*;
public class designerPDFViewer {
	public static int findTallestLetter(int[]ht,char[] arr){
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(ht[arr[i]-'a']>max){
				max = ht[arr[i]-'a'];
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
	
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        char[] arr = word.toCharArray();
        int tallestLetterHeight = findTallestLetter(h,arr);
        int l = arr.length;
        System.out.println(l*tallestLetterHeight);
        
    }
}
