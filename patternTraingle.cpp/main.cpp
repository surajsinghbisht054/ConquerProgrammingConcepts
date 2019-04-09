/*  patternTriangle.cpp
*   Author : Arvind Sharma
*   Description : Program to print star Triangle pattern
*   contact : slowestwind@gmail.com
*
*/


//include header file
#include <iostream>
#include <stdlib.h>


using namespace std;

// funtion to print star
void printTriangle1(int n){
    int star = n;
    int space = 30; // total space
    int gap = 4;
    // iteration for the row
    for(int row=1; row<=5; row++){
        // iteration to column
        if(1<=n){
            // iteration for the no. of triangle
            for(int col=1; col<=n; col++){

                for(int i=gap; i>=1; i--){
                    cout<<" ";
                }
                // to print star
                for(int j=1; j<=row; j++){
                    cout<<"*";
                }
                cout<<" ";

            }
            gap=gap-1;
        }
        cout<<endl;
    }
}

// funtion to print star
void printTriangle2(int m){
    int star = m;
    int space = 30; // total space
    int gap = 0;
    // iteration for the row
    for(int row=5; row>=1; row--){
        // iteration to column
        if(1<=m){
            // iteration for the no. of triangle
            for(int col=1; col<=m; col++){

                for(int i=gap; i>=1; i--){
                    cout<<" ";
                }
                // to print star
                for(int j=row; j>=1; j--){
                    cout<<"*";
                }
                cout<<" ";

            }
            gap=gap+1;
        }
        cout<<endl;
    }
}



int main()
{
    // define variable
    int n=3;
    int m=2;
    printTriangle1(n);
    printTriangle2(m);
    return 0;
}
