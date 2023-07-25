import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/



class Solution {
    public int reverse(int x) {
        long sum = 0;
        int temp = x;
        if(x<0) 
        temp = (-1)*temp;
        while(temp > 0){
            sum=sum*10+x%10;
            x = x/10;
            temp = temp/10;

        }
        if(sum< Math.pow(-2,31) || sum > Math.pow(2,31)) return 0;
        else return (int)sum;

    }
}