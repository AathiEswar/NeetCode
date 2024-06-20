package NeetCode;

public class FlowerBed {
    public static boolean flowerbed(int n , int[] flowers){
        // initialize
        int i = 0;
        int len = flowers.length;

        // iterate till len
        while(i < len){
            // if its 1 then go to the alternate flower pot
            if(flowers[i] == 1) i+=2;

            // else it will always be 0
            else{
                // check if both the left and right of the current flower pot is valid

                // left either contains one element or itself the first element
                boolean left = (i == 0 || flowers[i-1] == 0);

                // right either contains one element or itself has the last element
                boolean right = ( i == len-1 || flowers[i+1] == 0);

                // if both are valid
                if(right && left){

                    // decrement n to check if its less than 0 at the end
                    n--;

                    // move pointer one tinme
                    i+=1;
                }
                // default move pointer to iterate
                i+=1;
            }
        }
        // checking if the flowerbed is satisfied
        return n<1;
    }
}
