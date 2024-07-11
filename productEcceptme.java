public int[] productExceptSelf(int[] nums) {
    int n=nums.length;
    int result[]=new int[n];
    for(int i=0;i<n;i++){
        result[i]=1;
    }
    int leftprod=1;
    for(int i=0;i<n;i++){
        result[i]=leftprod;
        leftprod*=nums[i];
    }
    int rightprod=1;
    for(int i=n-1;i>=0;i--){
        result[i]*=rightprod;
        rightprod*=nums[i];
    }
    return result;
}