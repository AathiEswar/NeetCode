package NeetCode;

public class MaxBalloon {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for(int i = 0 ; i < text.length(); i++){
            freq[text.charAt(i) - 'a' ]++;
        }

        int max = freq[1] < freq[0] ? freq[1] : freq[0];
        max = max > freq[11]/2 ? freq[11]/2 : max;
        max = max > freq[14]/2 ? freq[14]/2 : max;
        max = max > freq[13] ? freq[13] : max;

        return max;

    }
}
