#include<iostream>
using namespace std;

int main()
{
  //Type your code here.
  int m[10][10],n[10][10];
  int r,c;
  cin>>r>>c;
  int i,j;
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
  		cin>>m[i][j];
	  }
  }
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
  		cin>>n[i][j];
	  }
  }
  
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
  		cout<<m[i][j]+n[i][j]<<" ";
	}
	cout<<endl;
  }
  return 0;
  
}