import java.util.*;
class StringSort {
    public static void sort(String w[], int c){
        String temp;
        for(int i=0;i<=c;i++){
            for(int j=i+1;j<=c;j++){
                if(w[i].compareTo(w[j])>0){
                    temp = w[i];
                    w[i] = w[j];
                    w[j] = temp;
                }
            }
        }
    }
    public static void display(String w[],int c){
        for(int i=0;i<=c;i++)
            System.out.println(w[i]);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the word count");
        int c = s.nextInt();
        String w[] = new String[c+1];
        System.out.println("Enter the words");
        for(int i=0;i<=c;i++){
            w[i] = s.nextLine();
        }
        System.out.println("\nWords before sorting");
        display(w,c);
        sort(w,c);
        System.out.println("\nWords after sorting");
        display(w,c);
    }
}