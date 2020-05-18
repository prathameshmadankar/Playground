#include<iostream>
using namespace std;
void f(int &a,int &b)
{
a=a+b;
  b=a-b;
  a=a-b;
}
int main()
{
int x,y;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<< " and b="<<y<<"\n";
  f(x,y);
  cout<<"After swapping a= "<<x<< " and b="<<y<<"\n";
}