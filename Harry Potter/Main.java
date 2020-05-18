#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  y=0;
  cin>>x;
  y = (int)(x/1000) + (int)(x%10);
  cout<<y;
}