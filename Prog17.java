
package prog17;
import java.util.*;

public class Prog17 {
public void cmopare(int a[],int b[],int c[],int size1,int size2,int size3){
//   Scanner sc=new Scanner(System.in);
//   int size4=sc.nextInt();
//int d[]=new int[];
    int i=0;
   int j=0;
   int k=0;
   int l=0;
   int d[]=new int[size1];
   int e[]=new int[size1];
   // while(i<size1 && j<size2) && k<size3)
   for(i=0;i<size1;i++) 
   {
    for(j=0;j<size2;j++)
    {
        if(a[i]==b[j]){
            d[l]=b[j];
            j++;
            l++;
            System.out.println(l);
            //System.out.println("print"+d[0]+d[1]);
        }
        j++;
        
    }
    i++;
   }
    System.out.println("match1");
    for(int m=0;m<size1;m++){ 
        System.out.println(d[m]);
        m++;       
    }
    
    
    for(i=0;i<size1;i++) 
   {
    for(j=0;j<size2;j++)
    {
        if(d[i]==c[j]){
            e[l]=b[j];
            j++;
            l++;
            System.out.println(l);
            //System.out.println("print"+d[0]+d[1]);
        }
        j++;
        
    }
    i++;
   }
    System.out.println("match2");
    for(int m=0;m<size1;m++){ 
        System.out.println(e[m]);
        m++;       
    }
    
}


public void commonElements(int A[], int B[], int C[], int na, int nb, int nc)
{
    int i = 0, j = 0, k = 0;

    while (i < na && j < nb && k < nc)
    {
        if (A[i] == B[j] && B[j] == C[k])
        {
            System.out.println("match data");
            System.out.println(A[i]);
            //cout << A[i] << ” “;
            i++;
            j++;
            k++;
        }
        else
        {
            if (A[i] <= B[j] && A[i] <= C[k])
                i++;
            else if (B[j] <= A[i] && B[j] <= C[k])
                j++;
            else if (C[k] <= A[i] && C[k] <= B[j])
                k++;
        }
    }
}

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("size of 1st array");
        int size1=sc.nextInt();
        int a[]=new int[size1];
        System.out.println("enter element for first array");
        for(int i=0;i<size1;i++)
            a[i]=sc.nextInt();
        
        System.out.println("size of 2nd array");
        int size2=sc.nextInt();
         int b[]=new int[size2];
        System.out.println("enter element for 2nd array");
        for(int i=0;i<size2;i++)
            b[i]=sc.nextInt();
        
        System.out.println("size of 3rd array");
        int size3=sc.nextInt();
         int c[]=new int[size3];
        System.out.println("enter element for 3rd array");
        for(int i=0;i<size3;i++)
            c[i]=sc.nextInt();
        
        Prog17 e=new Prog17();
       // e.cmopare(a,b,c,size1,size2,size3);
        e.commonElements(a,b,c,size1,size2,size3);
    }
    
}
