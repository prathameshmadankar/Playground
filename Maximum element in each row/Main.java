#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m[10][10],i,j;
  int r,c;
  cin>>r>>c;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
		cin>>m[i][j];
    }
  }
  for(i=0;i<r;i++){
    int max=0;;
  for(j=0;j<c;j++){
  		if(max<m[i][j])
  			max=m[i][j];
    }
    cout<<max<<endl;
  }
  
  return 0;
}