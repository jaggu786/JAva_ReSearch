package research_java;

public class JaggedArray_concept
{
    public static void main(String[] args)
	{
    	//jaggged array 
    	int x[][]=new int[2][];

x[0]=new int[2];

x[1]=new int[3];
// 	Enter two 1D Array into x[0]

    x[0][0]=10;
    x[0][1]=12;
// 	Enter Three 1D Array into x[1]  
    x[1][0]=13;
    x[1][1]=14;
    x[1][2]=15;
    for(int i=0;i<=1;i++)
    {
    System.out.print(""+x[0][i]+" ,");
   
	}
    System.out.println();
    for(int j=0;j<=2;j++)
    {
    System.out.print(""+x[1][j]+" ,");
   
	}
      
    
    
}
}
