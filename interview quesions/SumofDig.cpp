#include<iostream>
using namespace std;

int sumOfDig(int);
int main()
{
    int a;
    cout<<"Enter number :";
    cin>>a;
    cout<<"sum = "<<sumOfDig(a);
    return 0;
}

int sumOfDig(int n)
{
    int sum = 0;
    while(n != 0)
    {
        sum = sum + n%10;
        n = n/10;
    }
    return sum;
}
