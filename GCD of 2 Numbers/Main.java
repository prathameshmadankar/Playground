#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y;
  if (x<y)
    z=x;
  else
    z=y;
  while(z>0)
  {
  if(x%z==0 and y%z==0)
  {
    cout<<"G.C.D of "<<x<<" and "<<y<<" = "<<z;
    break;
  }
    z--;
    
  }
  //Type your code here.
}