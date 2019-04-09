/****************************************************************
* triangle_pattern.java
* Author: Himanshu Sharma
* Contact: 9818805401hs@gmail.com
* Discription : This is Practice for creating Pattern on screen for learning purpose.
*
/******************************************************************/

import java.util.Scanner;
class triangle
{   int a,b;


    public void rep(int i,int n)
    {
            for(a=i;a<=2*n-i;a++)
            {
               System.out.print(" ");
            }
            for(b=1;b<=2*i-1;b++)
            {
                System.out.print("*");
            }

    }

    public static void main(String args[])
    {   triangle obj=new triangle();
        Scanner sc=new Scanner(System.in);
        int i,j,k,n,a,b,c;
        n=3;
        int t; //this variable is used to define no of triangle

        System.out.println("Enter no of triangle:");  
        t=sc.nextInt();
        int temp;
        temp=t;
        //this is used to count the up and downn triangle
        int u=0,d=0;
        while(t>=1)
        {
            if(t%2==0)
            {
                d=d+1;
            }
            else
            {
                u=u+1;
            }
                t--;
        }

        t=temp;//re initialize due to loop

        /* printing up triangle*/
        for(i=1;i<=n;i++)
        {       System.out.println();

            for(j=i;j<=n-1;j++)
            {System.out.print(" ");

            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            for(c=1;c<u;c++)
            {
                obj.rep(i,n);
            }

        }


        /*printing down triangle*/
        int x;
        if(d>0)
        {
          for(i=n;i>=1;i--)
           {       System.out.println();

             for(j=i;j<=n-1;j++)
             {System.out.print(" ");

             }
             for(k=1;k<=2*i-1;k++)
             {
                System.out.print("*");
             }
             for(c=1;c<d;c++)
             {
                obj.rep(i,n);
             }
          }
        }
    System.out.println();

    }


}
