
public class ReverseTheSentence {

	public static void main(String[] args) {
		reverseWords("Let's take LeetCode contest");

	}
	
	public static String reverseWords(String s) {
        int start = 0;
        int end = 0;
        char[] chars = s.toCharArray();
        
        while(end <= chars.length){
            if(end == chars.length || chars[end] == ' '){
                reverse(chars, start, end-1);
                end++;
                start = end;
            }
            else{
                end++;
            }
        }
        System.out.println(new String(chars));
        return new String(chars);
    }
    
    public static void reverse(char[] c, int start, int end) {
        while (start < end) {
            char tmp = c[end];
            c[end] = c[start];
            c[start] = tmp;
            start++;
            end--;
        }
    }

}
