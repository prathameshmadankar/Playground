#include<iostream>
#include<sstream> 
using namespace std;
int main()
{
  int n,i,j,ans=1;
  string s="";
  cin>>n;
  for (i=1;i<=n ;i++)
  {
    if (i%2!=0){
  for (j=ans;j<i+ans-1;j++)
  cout<<j<<"*";
    cout<<j;
    ans=j;
    }
  else
  {
  for (j=ans+i;j-1>ans;j--)
  cout<<j<<"*";
    cout<<j;
    ans=ans+i+1;
  }
    //cout<<'\b';  //Cursor moves 1 position backwards
    //cout<<"";

    cout<<"\n";

  }
  
}