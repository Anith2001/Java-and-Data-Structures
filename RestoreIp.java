import java.util.*;
class RestoreIp{
	 static List<String> restoreIpAddresses(String s) {
        List<String>res=new ArrayList<String>();
        int val[]=new int[4];
        backtrack(res,s,val,0,0);
        return res;
    }
    static void backtrack(List<String>res,String s,int val[],int builderIndex,int seg){
        if(seg==4 && builderIndex==s.length()){
            res.add(val[0]+"."+val[1]+"."+val[2]+"."+val[3]);
            return ;
        }
        if(seg==4 || builderIndex==s.length()){
            return ;
        }
        for(int len=1;len<=3 && builderIndex+len<=s.length();len++){
            String segment=s.substring(builderIndex,builderIndex+len);
            int k=Integer.parseInt(segment);
            if(k>255 || len>=2 && (s.charAt(builderIndex)=='0')){
                break;
            }
            val[seg]=k;    //choose
            backtrack(res,s,val,builderIndex+len,seg+1);   //explore 
            val[seg]=-1;     //unexplore
        }
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(restoreIpAddresses(str));
	}
}