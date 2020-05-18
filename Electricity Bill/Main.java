#include<iostream>
using namespace std;
int main()
{
  int u;
  cin>>u;
  float c;
  if (u<=200)
    c=u*.5;
  else if(u<=400)
    c=(u*.65)+100;
  else if(u<=600)
    c=(u*.80)+200;
  else if(u>600)
    c=(u*1.25)+425;
  cout<<"Rs."<<int(c);
  
  //Type your code here.
}