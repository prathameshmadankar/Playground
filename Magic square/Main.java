#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,r;
  int m[10][10];
  cin>>r;
  for(i=0;i<r;i++){
  	for(j=0;j<r;j++){
  		cin>>m[i][j];
	  }
  }
  int d1=0,d2=0;
  int row[r],col[r];
  for(i=0;i<r;i++){
  	row[i]=0;
  	col[i]=0;
  }
  for(i=0;i<r;i++){
  	for(j=0;j<r;j++){
  		if(i==j)
  			d1+=m[i][j];
  		if(i+j==r-1)
  			d2+=m[i][j];
  		row[i]+=m[i][j];
  		col[j]+=m[i][j];
	  }
  }

	if(d1!=d2){
		cout<<"No";
		return 0;
	}
	for(i=0;i<r;i++){
		if(row[i]==d1)
			continue;
		cout<<"No";
		return 0;
	}
	for(i=0;i<r;i++){
		if(col[i]==d1)
			continue;
		cout<<"No";
		return 0;
	}
	cout<<"Yes";     
	return 0;
}