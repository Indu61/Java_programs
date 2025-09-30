#include<iostream>

using namespace std;

int main()
{
    char s[] = "hello";
    cout<<s<<endl;

    int len = 0;
    for(int i=0; s[i] != '\0'; i++)
    {
        len ++;
    }
    cout<<len<<endl;

    int start = 0, end = len - 1;

    while( start < end)
    {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        start ++;
        end --;
    }

    cout<<s;
    return 0;
}
