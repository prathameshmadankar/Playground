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
  int a=0,b=0;
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
  		if(m[i][j]>m[a][b]){
  			a=i;
  			b=j;
		  }
	  }
  }
  cout<<"The maximum element is "<<m[a][b];
  return 0;
}