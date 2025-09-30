#include<iostream>
using namespace std;
int fact(int);

int main()
{
    int n = 3;
    cout<<"fact : "<<fact(n);
    return 0;
}

int fact(int n)
{
    if(n == 0)
       return 0;
    else if(n == 1)
        return 1;
    else{
        return n * fact(n-1);
    }
}

