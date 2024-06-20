package NeetCode;

public class OnesInBinary {
    public int hammingWeightBrianKernighan(int n){
        int count = 0;

        while(n != 0){
            // Brian Kernighan algorithm

            // turns off the right most bit (i.e 1)
            n = n & (n-1);
            count++;
        }

        return count;
    }
    public int hammingWeight(int n) {

        int count = 0;
        while(n!=0){

            // n % 2 can be replaced as  n&1
            count += n&1;

            // n / 2 can be replaced as n>>1
            // n * 2 can be replaced as n << 1
            n = n>>1;
        }
        return count;
    }
    public int hammingWeight2(int n) {

        int count = 0;
        while(n!=0){
            int rem = n%2;
            if(rem == 1){
                count++;
            }
            n = n/2;
        }
        return count;
    }
    public int hammingWeight1(int n) {
        String N = Integer.toBinaryString(n);

        int count = 0;

        for(int i=0;i<N.length();i++){
            if(N.charAt(i) == '1'){
                count++;
            }
        }

        return count;
    }
}
