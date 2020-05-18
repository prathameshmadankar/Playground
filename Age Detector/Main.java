#include<iostream>
#include <cstdlib>

using namespace std;
int main()
{
  int x,y,age;
  cin>>x>>y;
  if (y==0)
    age=100-x;
    else if (x>y)
      age=100-x+y;
  else
    age=y-x;
  cout<<age;
  //Type your code here.
}