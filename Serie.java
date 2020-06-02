import Generales.clsGenerales;

public class Punto2 {
	
	static clsGenerales objG = new clsGenerales();
   
    public static void main(String[] args) 
    	{
    		proceso();
    	}
    		
    private static void proceso()
    {
    int N;
    N=validarNumero();
    for(int i=0;i<N;i++)
    	{
    		
    	for(int j=N;j>0;j--)
    		{
    		if(j>i)	
    		System.out.print(" ");
    		else
    			System.out.print("*");
    	}
    
    		
    		System.out.println();
    	}
      for(int i=0;i<N;i++)
    	{
    		
    	for(int j=0;j<N;j++)
    		{
    		if(j<i)	{
    		System.out.print(" ");
    		}else{
    			System.out.print("*");
    	}
    
    		}	
    		System.out.println();
    	}
    
    		
    }
    
    private static int validarNumero()
    {
    	int Num;
    	do
    	{
    		Num=objG.leerEnteroPosMy0("Ingrese un numero positivo, impar y mayor o igual a 3 ");
    		if(Num %2 ==0||Num==1)
    			objG.Mensaje("Valor no valido; reintente ");
    	}while(Num %2 ==0||Num==1);
    	return Num;
    	}
    }
       
     
       
    

