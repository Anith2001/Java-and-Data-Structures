class Test{
	public static void main(String[] args) {
		//System.out.println(args[0]+" "+args[args.length]);
		byte a=1;
		char p='b'-'a';
		int pi=1;
		short ps=1;
		String s="1";
		Integer o1=new Integer(a);
		Integer o2=new Integer(p);
		Integer o3=new Integer(ps);
		Integer o4=new Integer(pi);
		Integer o5=new Integer(s);
		int res=o1.intValue()+o2.intValue()+o3.intValue()+o4.intValue()+o5.intValue();
		System.out.println(res);
	}
}