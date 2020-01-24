import java.util.Scanner;

public class Banner {
	public static void main(String h[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String st=sc.nextLine();
	char[] ch=st.toUpperCase().toCharArray();
	for(int k=0;k<ch.length;k++) {
		switch(ch[k]) 
		{
		case 'A':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || i==1 || j==5 || i==3 )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'B':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || (i==1 && j<5) || j==5 || (i==5 && j<5) || i==3 )
					{
						if((i==1 && j==5)|| (i==5 && j==5)||(i==3 && j==5))
						{
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'C':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(i==1 ||j==1 ||i==5) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'D':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || (i==1 && j<5) || j==5 || (i==5 && j<5))
					{
						if((i==1 && j==5)|| (i==5 && j==5))
						{
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'E':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || i==1 || i==5 || i==3 )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'F':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || i==1 || i==3 )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'G':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || (i==1 && j<5) || j==5 || (i==5 && j<5) || (i==3 && j==1)||(i==3 && j==5)||(i==4&&j==3)||(i==4&&j==4))
					{
						if((i==1 && j==5)|| (i==5 && j==5)|| (i==5 && j==1) ||(i==1 && j==1)||(i==3 &&j==5))
						{
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'H':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || j==5 || i==3 )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'I':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==3 || i==1|| i==5)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'J':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(i==1 ||j==3||(i==4 && j==1)||(i==5&&j==2) )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'K':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=4;j++) {
					if(j==1||i+j==5 ||(i==4&&j==3)||(i==5&&j==4))
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'L':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || i==5 )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'M':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1||j==5 || (i==j && i<=3)|| (i+j==6 && i<4) )
					{
						System.out.print("*");
			}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'N':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || i==j || j==5)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'O':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || (i==1 && j<5) || j==5 || (i==5 && j<5) || (i==3 && j==1)||(i==3 && j==5) )
					{
						if((i==1 && j==5)|| (i==5 && j==5)|| (i==5 && j==1) ||(i==1 && j==1))
						{
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'P':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(i==1 || j==1 || i==3 ||(j==5&& i<=3) )
					{
						if((i==1 && j==5) || (i==3 && j==5)) {
							System.out.print(" ");
						}else {
							System.out.print("*");
						}
						
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'Q':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || (i==1 && j<5) || j==5 || (i==5 && j<5) || (i==3 && j==1)||(i==3 && j==5) )
					{
						if((i==1 && j==5)|| (i==5 && j==5)|| (i==5 && j==1) ||(i==1 && j==1))
						{
							if((i==5&&j==5))
							{
								System.out.print("\\");
							}
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'R':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(i==1 || j==1 || i==3 ||(j==5&& i<=3)||(i==4 && j==4)||(i==5 && j==5) )
					{
						if((i==1 && j==5) || (i==3 && j==5)) {
							System.out.print(" ");
						}else {
							System.out.print("*");
						}
						
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'S':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(i==1||i==3 ||i==5||(i==2&&j==1)||(i==4&&j==5) )
					{
						if((i==1 && j==1)||(i==5 &&j==5)||(i==3 && j==1)||(i==3 && j==5)) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
						
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'T':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(i==1 || j==3 )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'U':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1 || i==5 || j==5 )
					{
						if((i==5 && j==1) || (i==5 && j==5)) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
						
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'V':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if((j==1 && i<=3)|| i+j==8 || (j==5&& i<=3) || (i==4&& j==2) )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'W':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(j==1||j==5||(i==j&&i>=3)||(i+j==6 && i>=3) )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'X':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(i==j || i+j==6)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'Y':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if((i==j && i<=3)||(i+j==6 && j>=3)||(j==3&& i>=3))
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 'Z':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++) {
					if(i==1 || i==5 || i+j==6 )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case ' ':
			for(int i=1;i<=5;i++){
				for(int j=1;j<=3;j++) {
					if(true )
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("!");
		}
	System.out.println();
	}
	sc.close();
	}
}