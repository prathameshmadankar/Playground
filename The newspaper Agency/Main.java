#include<iostream>
using namespace std;
int main()
{int w,x,y,selling,costing,profit;
 cin>>w>>x>>y;
  selling=w*x;
  costing=100+(y*w);
    profit=selling-costing;
  cout<<profit;
}