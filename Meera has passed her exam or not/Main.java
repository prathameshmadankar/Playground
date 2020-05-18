#include<iostream>
using namespace std;
int main()
{
  int n,t,f=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
  cin>>a[i];
  }
  cin>>t;
  for(int i=0;i<n;i++)
  {
  if(a[i]==t)
  {
    cout<<"She passed her exam";
    f=-1;
    break;
  }
  }
  if(f==0)
 cout<<"She failed";
  // Type your code here
}