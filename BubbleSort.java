public class BubbleSort {
    public void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(i=0;i<n;i++){
            for(j=1;j<(n-i);j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[]={4,8,2,9,5,12,6,1};
        System.out.println("Array before sort : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr);
        System.out.println("\nArray after sort : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
