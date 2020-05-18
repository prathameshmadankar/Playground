#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,r,c;
  int m[10][10];
  cin>>r>>c;
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
  		cin>>m[i][j];
	  }
  }
  int ans=0;
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
  		if(i==0 || i+j==c-1 || i==c-1)
  			ans+=m[i][j];
	  }
  }
  cout<<"Sum of Zig-Zag pattern is "<<ans;
  return 0;
}