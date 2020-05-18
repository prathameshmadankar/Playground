#include<iostream>
using namespace std;
int main()
{
  int r,c,x,j;
  cin>>r>>c;
  int m1[r][c];
  int m2[r][c];
    // Type your code here
  for(int i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>m1[i][j];
  for(int i=0;i<r;i++)
    for(j=0;j<c;j++)
    {cin>>x;
     m2[i][j]=m1[i][j]+x;
    }
  for(int i=0;i<r;i++)
  {for(j=0;j<c;j++)
      cout<<m2[i][j]<<" ";
   cout<<"\n";
  }
}