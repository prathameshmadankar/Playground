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
  cout<<"Sum of rows is ";
  int max=0,d,imp[c];
  for(i=0;i<c;i++){
  	imp[i]=0;
  }
  for(i=0;i<r;i++){
    int ans=0;
  	for(j=0;j<c;j++){
    	ans+=m[i][j];
    	imp[j]+=m[i][j];
    }
    cout<<ans<<" ";
    if(ans>max){
    	max=ans;
    	d=i;
	}
  }
  cout<<"\nRow "<<d+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
  int grt=0;
  for(i=0;i<c;i++){
  	cout<<imp[i]<<" ";
  	if(imp[grt]<imp[i])
  		grt=i;
  }
  cout<<"\nColumn "<<grt+1<<" has maximum sum";
  
  
  return 0;
}