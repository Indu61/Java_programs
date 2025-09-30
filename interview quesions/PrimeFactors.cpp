#include<iostream>
using namespace std;
void primeFactors(int);
int main()
{
    primeFactors(156);

    return 0;
}

void primeFactors(int n)
{
    for(int i=2; i<=n; i++)
    {
        if(n%i == 0)
        {
            int flag = 0;
            for(int j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    flag ++;
                }
            }
            if(flag == 0)
            {
                cout<<"prime factor number is :"<<i<<"\n";
            }
        }
    }
}
