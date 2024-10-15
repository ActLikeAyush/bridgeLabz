import java.util.Arrays;

public class SortMerge {
    static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,mid,r);

        }

    }

    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int arrL[]=new int[n1];
        int arrR[]=new int[n2];

        for(int i=0;i<n1;i++){
            arrL[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            arrR[j]=arr[mid+1+j];
        }

        int a=0;
        int b=0;
        int c=l;
        while(a<n1&&b<n2){
            if(arrL[a]<=arrR[b]){
                arr[c]=arrL[a];
                a++;
                
            }
            else{
                arr[c]=arrR[b];
                b++;
                
            }
            c++;

            
            
        }

        while (a < n1) {
            arr[c] = arrL[a];
            a++;
            c++;
        }

        // Copy remaining elements of arrR[], if any
        while (b < n2) {
            arr[c] = arrR[b];
            b++;
            c++;
        }



    }
    public static void main(String[] args) {
        int[] arr={3,8,6,2,4,1,5,7};

        int l=0;
        int r=arr.length-1;
        mergeSort(arr,l,r);
        System.out.println("after doing sorting : "+Arrays.toString(arr));
    }    
}
