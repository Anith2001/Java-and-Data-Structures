class Remove{
	static int remove(int arr1[],int n,int x){
		int i;
		for( i=0;i<n;i++){
			if(arr1[i]==x){
				break;
			}
		}
			if(i<n){
				n=n-1;
				for(int j=i;j<n;j++){
					arr1[j]=arr1[j+1];
				}
			}
		return n;
	}
	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5,6};
		int arr2[]={3,6};
		int n=arr1.length;
		for(int i=0;i<arr2.length;i++){
			n=remove(arr1,n,arr2[i]);
		}
		for(int i=0;i<n;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}