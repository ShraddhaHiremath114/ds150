public class ProductOfArrayExceptSelfElement {
    public static void method2(int[] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];

        prefix[0]=1;
        suffix[n-1]=1;

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]*suffix[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        
        int n=arr.length;
        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            int product=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    product*=arr[j];
                }
            }
            ans[i]=product;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        method2(arr);
    }
}
