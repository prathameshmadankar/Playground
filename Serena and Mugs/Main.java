#include<iostream>
using namespace std;
int main()
{
  int n,s,x,ans=0,z=0;
  cin>>n>>s;
  for(int i=0;i<n;i++)
  {
  cin>>x;
    z+=x;
    if(x<=s)
      ans++;
  }
  if (z<=s)
    cout<<"YES";
  else
    cout<<"NO";
  //Type your code here.
}