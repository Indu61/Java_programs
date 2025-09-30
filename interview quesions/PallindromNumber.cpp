#include<iostream>
using namespace std;
bool palindrom(int);

int main()
{
    if(palindrom(121))
    {
        cout<<"number is palindrom";
    }
    else
    {
        cout<<"number is not palindrom";
    }

    return 0;
}

bool palindrom(int n)
{
    int num = n;
    int rev = 0;
    while(num != 0)
    {
        rev = rev*10 + num%10;
        num = num/10;
    }
    if(rev == n)
    {
        return true;
    }
    return false;
}
