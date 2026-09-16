import java.util.Scanner;
class LongestSubstring{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		int maxLength=0;
		for(int i=0;i<str.length();i++){
			String sub="";
			for(int j=i;j<str.length();j++){
				char ch=str.charAt(j);
				if(sub.indexOf(ch)!=-1){
					break;
				}
				sub+=ch;
				maxLength=Math.max(maxLength,sub.length());
			}
		}
		System.out.println("Length of longest substring without duplicate characters: "+maxLength);
	}
}