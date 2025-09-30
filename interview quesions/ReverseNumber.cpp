#include<iostream>
using namespace std;

int revNumber(int);

int main()
{
    int a = 123;
    cout<<"Reverse Number :"<<revNumber(a);
    return 0;
}

int revNumber(int n)
{
    int rev = 0;
    while(n != 0)
    {
        rev = rev*10 + n%10;
        n = n/10;
    }
    return rev;
}
