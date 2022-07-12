import java.util.*;
class ArraySearch {
    public static void display(int a[],int n){
        System.out.println("\nArray:");
        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");
    }
    public static void search(int a[],int n,int k){
        int flag=0,i;
        for(i=0;i<n;i++){
            if(a[i]==k){
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Element " + k + " Found At " + (i+1) +"th position");
        else
            System.out.println("Element not found");
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            a[i] = s.nextInt();
        display(a,n);
        System.out.println("\nEnter the elements for search:");
        int k = s.nextInt();
        search(a,n,k);
    }
}