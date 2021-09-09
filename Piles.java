import java.util.*;
class Piles{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str[]=s.nextLine().split(" ");
        int arr[]=Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int n=arr.length;
        Arrays.sort(arr);

        int sum=0;
        for(int i=n/3;i<n;i+=2){
            sum+=arr[i];
        }
        System.out.println(sum);
        s.close();
    }
}