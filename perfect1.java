import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        int x[]=new int[n];
        int m=10,i;
        int a[]=new int[m];
        int count=0,sum=0;
        for(i=0;i<n;i++)
        {
            x[i]=d.nextInt();
        }
        System.out.print("The Perfect Square Values are ");
        for(i=0;i<n;i++)
        {
            if(x[i]==1||x[i]==4||x[i]==9||x[i]==16||x[i]==25||x[i]==36||x[i]==49||x[i]==64||x[i]==81||x[i]==100)
            {
                count++;
                a[i]=x[i];
            }
            else{
                continue;
            }
            System.out.print(a[i]+" ");
        }
        System.out.println("\nThe Number of Perfect Squares are "+count);
        for(i=0;i<m;i++)
        {
            sum+=a[i];
        }
        System.out.println("The Sum of Perfect Square is "+sum);
    }
}
