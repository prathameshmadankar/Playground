#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int x,y,z;
  cin>>x>>y>>z;
  if (pow(x,y)>=z)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}