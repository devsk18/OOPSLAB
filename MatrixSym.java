import java.util.*;
class MatrixSym
{
    public static void checkSym(int m[][],int r,int c)
    {
        int flag = 1;
        int t[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
               t[j][i] = m[i][j];
               
        if(r==c)
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(m[i][j] != t[i][j])
                    {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag==0)
                System.out.println("Matrix is not Symetric");
            else
                System.out.println("Matrix is Symetric");
        }
        else
            System.out.println("Matrix is not Symetric");
       
    }
    public static void main(String args[])
    {
        int r,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of row");
        r = s.nextInt();
        System.out.println("Enter the size of column");
        c = s.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        checkSym(a,r,c);
    }

}
