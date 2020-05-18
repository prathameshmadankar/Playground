#include <iostream>
using namespace std;
int main() {
  int i=1,n,j;
  cin>>n;
  while(i<=n)
  {
  	if(i%2!=0)
    {
      for (j=0;j<n-1;j++)
        cout<<i;
    	cout<<i+1;
    }
    else
      {
       cout<<i+1;
      for (j=0;j<n-1;j++)
       cout<<i;
    	
    }
    i++;
    cout<<"\n";
  }
    // Type your code here
    return 0;
}