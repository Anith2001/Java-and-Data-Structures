import java.util.*;
class Mounika{
    static int findMaxForm(String strs[],int m,int n){
        return helper(strs,m,n,0);
    }
    static int helper(String strs[],int zero,int one,int index){
        if(index==strs.length || zero+one==0){
            return 0;
        }
        int count[]=freq(strs[index]);
        int consider=0;
        if(zero>=count[0] && one>=count[1]){
            System.out.println("consider = "+index);
            consider=1+helper(strs,zero-count[0],one-count[1],index+1);
        }
        System.out.println("skip = "+index);
        int skip=helper(strs,zero,one,index+1);

        return Math.max(consider,skip);
    }
    static int[] freq(String s1){
        int count[]=new int[2];
        for(char c:s1.toCharArray()){
            count[c-'0']++;
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String strs[]=s.nextLine().split(" ");
        int p=s.nextInt();
        int q=s.nextInt();
        System.out.println(findMaxForm(strs,q,p));
    }
}