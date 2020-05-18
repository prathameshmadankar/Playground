#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int s1=0;
 int  s3,  s2=1;
 
  if( n==1 or n==2)
    cout<<1;
  else
  {
    for(int i=3;i<=n;i++)
    {
      s3=s1+s2;
  		s1=s2;
  		s2=s3;
    }
  cout<<s2;
  }
  //Type your code here.
}