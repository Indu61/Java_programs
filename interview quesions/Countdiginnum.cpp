#include<iostream>
using namespace std;

int countDig(int);

int main()
{
    cout<<"Total digits in number : "<<countDig(124);
    return 0;
}

int countDig(int n)
{
    int count = 0;
    while( n != 0)
    {
        n = n/10;
        count ++;
    }
    return count;
}
