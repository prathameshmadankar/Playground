#include<iostream>
using namespace std;
int main()
{
  int x,n;
  int s1=0,s2=0;
  cin>>x;
  for(int i=0;i<x;i++)
  {
  cin>>n;
    if(n%2==0)
      s1+=n;
    else
      s2+=n;
  }
  cout<<"The sum of the even numbers in the array is "<<s1;
  cout<<"\nThe sum of the odd numbers in the array is "<<s2;
  //Type your code here.
}