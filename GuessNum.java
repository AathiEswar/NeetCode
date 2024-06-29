package NeetCode;

public class GuessNum {
    public int guess(int n ){
        return 0;
    }
    public int guessNumber(int n) {
        int start = 1 ;
        int end = n;

        while(start <= end){
            int mid = start + (end - start)/2;

            int guessNum = guess(mid);

            if(guessNum == 0){
                return mid;
            }
            if(guessNum == 1){
                start =mid+1;
            }
            else{
                end = mid - 1;
            }
        }

        return n;
    }
}
