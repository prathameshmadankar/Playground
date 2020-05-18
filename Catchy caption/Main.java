#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  int ans=0,i=0;
  string s;
  getline(cin,s);
   // cout<<s;
  for(i=0;i<s.length();i++)
  {
  if (s[i]==' ')
    ans++;
  }
  if(ans>9)
    cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";
   
}