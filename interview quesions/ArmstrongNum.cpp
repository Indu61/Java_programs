#include<iostream>
using namespace std;
bool armstrongNum(int);
int countDig(int);

int main()
{
    if(armstrongNum(153))
        cout<<"num is armstrong";
    else
        cout<<"num is not armstrong";

    return 0;
}

int countDig(int num)
{
    int len = 0;
    while(num != 0)
    {
        len ++;
        num = num / 10;
    }
    return len;
}

bool armstrongNum(int n)
{
    int num = n;
    int mul = 1;
    int res = 0;

    while(num != 0)
    {
        mul = 1;
        for(int i=1; i<=countDig(num); i++)
        {
            mul = mul * n%10;
        }

        res = res + mul;
   }

    return res;
}
