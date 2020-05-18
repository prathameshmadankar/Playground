#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,r,c;
  cin>>r>>c;
  int m[10][10];
 
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
  		cin>>m[i][j];
	  }
  }
	int d=0;
  for(j=0;j<c;j++){
  	for(i=0;i<r;i++){
  		if(m[i][j]>m[d][j])
  			d=i;
	  }
	  cout<<m[d][j]<<endl;
  }
}
