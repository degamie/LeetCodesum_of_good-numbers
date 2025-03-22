class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
      //Newer Approach
      //T(C(N)) and S(C(N)) ==O(N) as it requires non contigous space alloc iteratively
        int sum = 0;//initialize sum
        int n = nums.length;//Length Decalre

        for (int i = 0; i < n; i++) {//iterating through sum's length
            boolean leftExists = (i - k) >= 0;//Checking sum Left and right idnx val
            boolean rightExists = (i + k) < n;

            if (!leftExists && !rightExists) {sum += nums[i];} //Incr Sum next indx val

            else if (!leftExists) {
                if (nums[i] > nums[i + k]) sum += nums[i]; //Incr Sum next's Left  indx val
            } 
            else if (!rightExists) {
                if (nums[i] > nums[i - k]) sum += nums[i]; //Incr Sum next's Right indx val
            } 
            else {
                if (nums[i] > nums[i - k] && nums[i] > nums[i + k]) sum += nums[i]; //Incr Sum next's Right indx val
            }
        }
        return sum;//Printing Sum
    }
}
 //Older Approach
    //     int left=0;int right=long(Math.sqrt(right));
    //     while(left!=0){
    //         int sum=left*left+right*right;
    //         if(left==0) sum =0; 
    //         else if(left>0)sum+=right;
    //         else sum-=right;
    //     }return sum ;
    // }
// }
