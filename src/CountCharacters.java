import java.util.Scanner;
public class CountCharacters {
    public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	String s=input.nextLine().toLowerCase();
	int vc=0,cc=0,dc=0,sp=0;
	for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                vc++;
                }
            
            	else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
                	cc++;
            	}
            
            	else if (ch>='0' && ch<='9') {
               	 	dc++;
            	}
            
            	else {
                	sp++;
            	}
	}
	System.out.println(vc+" "+cc+" "+dc+" "+sp);
        
    
	}
}
