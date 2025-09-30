#include<iostream>
using namespace std;
bool armstrongNum(int);

int main()
{
    if(armstrongNum(153))
        cout<<"num is armstrong";
    else
        cout<<"num is not armstrong";

    return 0;
}

bool armstrongNum(int n)
{
    int res = 0;
    while(n != 0)
    {
        int dig = n%10;
        res = res + dig*dig*dig;
        n = n/10;
    }
    return res;
}
