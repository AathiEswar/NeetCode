package NeetCode;

public class ArrangingCoins {
    public int arrangingCoins(int n){
        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end - start)/2;

            int pivot = mid * (mid +1)/2;

            if(pivot == n){
                return mid;
            }
            else if(pivot < n){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return end;
    }
}
