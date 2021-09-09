import java.util.*;
class BestTeamScore {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int wick[]=new int[n];
        int ages[]=new int[n];
        for(int i=0;i<n;i++){
            wick[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            ages[i]=s.nextInt();
        }
        int n1=ages.length;
        int candidate[][]=new int[n1][2];
        for(int i=0;i<n1;i++){
            candidate[i][0]=ages[i];
            candidate[i][1]=wick[i];
        }
        
        Arrays.sort(candidate,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        int dp[]=new int[n1];
        dp[0]=candidate[0][1];
        int max=dp[0];
        for(int i=1;i<n1;i++){
            dp[i]=candidate[i][1];
            for(int j=0;j<i;j++){
                if(candidate[j][1]<=candidate[i][1]){
                    dp[i]=Math.max(dp[i],dp[j]+candidate[i][1]);
                }
            }
            max=Math.max(dp[i],max);
        }
        System.out.println(max);
        s.close();
    }    
}
