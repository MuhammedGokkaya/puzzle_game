import java.util.Random;
import java.util.Scanner;


public class puzzle {

	final int[][] tablo = new int[4][4];
	
	public  void tabloCiz(){
		int[] dizi={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int indis,x=0;
		Random generator = new Random();
		int[] y_dizi=new int[16];
		for (int i=0;i<16;i++){
			indis = generator.nextInt(16);
			if(dizi[indis]==0){
				i--;
			}
			else{
				y_dizi[i]=dizi[indis];
				dizi[indis]=0;
			}
		}
		int temp;
	    for(int i=0;i<16;i++)
	    {
	        if(y_dizi[i]==16)
	            {
	                temp=y_dizi[i];
	                y_dizi[i]=y_dizi[15];
	                y_dizi[15]=temp;
	            }
	    }
		for (int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				tablo[i][j]=y_dizi[x];
				x++;
			}
		}
		tablo[3][3]=0;		
	}
	public void tabloYaz(){
		System.out.println("\n<<Kayan Puzzle Oyunu>>\n\n");
		  for(int i=0;i<4;i++)
		    {
			  System.out.println("");
			  for(int j=0;j<4;j++)
		        {
		            if(tablo[i][j]!=0)
		                System.out.print(tablo[i][j] + " ");
		            else{
		                System.out.print("_" + " ");
		            }
		            	
		        }
		    }
		}
	public  void degisimYap(int sayi){
		int i, j;
	    int temp1=0,temp2=0,tut1=0,tut2=0;
	    for( i = 0; i < 4; i++ ) {
	        for( j = 0; j < 4; j++ ) {
	             if(tablo[i][j]==sayi)
	             {
	                     tut1=i;
	                     tut2=j;
	             }
	             if(tablo[i][j]==0){
	                    temp1=i;
	                    temp2=j;
	             }

	        }
	    }
	    tablo[temp1][temp2]=sayi;
	    tablo[tut1][tut2]=0;
	}
	public int oyunBitis(){
		 if(tablo[0][0]==1&&tablo[0][1]==2&&tablo[0][2]==3&&tablo[0][3]==4
			        &&tablo[1][0]==5&&tablo[1][1]==6&&tablo[1][2]==7&&tablo[1][3]==8
			        &&tablo[2][0]==9&&tablo[2][1]==10&&tablo[2][2]==11&&tablo[2][3]==12
			        &&tablo[3][0]==13&&tablo[3][1]==14&&tablo[3][2]==15&&tablo[3][3]==0 ){
			 return 1;
	      }
		 return 0;
		
	}
	public int yerKontrol(int sayi){
		int i, j;
	    int sayac=0;
	    for( i = 0; i < 4; i++ ) {
	        for( j = 0; j < 4; j++ ) {
	           if(tablo[i][j]!=sayi)
	           {
	              sayac++;
	           }

	           if(tablo[i][j]==sayi)
	           {
	              return sayac;
	           }
	        }

	    }
		return sayac;
	}
	public int tasKontrol(int index){
		int i, j;
	    int sayac=0;
	    for( i = 0; i < 4; i++ ) {
	        for( j = 0; j < 4; j++ )
	        {
	            	if(index==0)
	            	{
	                	if( tablo[0][1]==0||tablo[1][0]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                    	}
	            	}
	            	else  if(index==1)
	            	{
	                	if( tablo[0][0]==0|| tablo[0][2]==0|| tablo[1][1]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                    	}
	            	}
	            	else  if(index==2)
	            	{
	                	if( tablo[0][1]==0|| tablo[0][3]==0|| tablo[1][2]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                    	}
	            	}
	            	else  if(index==3)
	            	{
	                	if( tablo[0][2]==0|| tablo[1][3]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                       	 	return 0;
	                    	}
	            	}
	            	else  if(index==4)
	            	{
	                	if(tablo[0][0]==0|| tablo[1][1]==0|| tablo[2][0]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                    	}
	            	}
	            	else  if(index==5)
	            	{
	                	if( tablo[1][0]==0|| tablo[0][1]==0|| tablo[1][2]==0|| tablo[2][1]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                    	}
	            	}
	            	else  if(index==6)
	            	{
	                	if( tablo[1][1]==0|| tablo[0][2]==0|| tablo[1][3]==0|| tablo[2][2]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                    	}
	            	}
	            	else  if(index==7)
	            	{
	                	if( tablo[0][3]==0|| tablo[1][2]==0|| tablo[2][3]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                   	 	}
	            	}
	            	else  if(index==8)
	            	{
	                	if( tablo[1][0]==0|| tablo[3][0]==0|| tablo[2][1]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                   	 	}
	            	}
	            	else  if(index==9)
	            	{
	                	if( tablo[2][0]==0|| tablo[2][2]==0|| tablo[1][1]==0 || tablo[3][1]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                   	 	{
	                    	    return 0;
	                 	   	}
	            	}
	            	else  if(index==10)
	            	{
	                	if( tablo[2][1]==0|| tablo[2][3]==0|| tablo[1][2]==0 || tablo[3][2]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                 	   	}
	            	}
	            	else  if(index==11)
	            	{
	                	if( tablo[2][2]==0|| tablo[1][3]==0|| tablo[3][3]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                    	}
	            	}
	            	else  if(index==12)
	            	{
	                	if( tablo[2][0]==0|| tablo[3][1]==0)
	                    	{
	                        	return 1;
	                    	}
	                	else
	                    	{
	                        	return 0;
	                    	}
	           	 	}
	            	else  if(index==13)
	            	{
	                	if( tablo[3][0]==0|| tablo[3][2]==0|| tablo[2][1]==0)
	                	{
	                    	return 1;
	                	}
	                	else
	                	{
	                    	return 0;
	                	}
	            	}
	           	 	else  if(index==14)
	            	{
	                	if( tablo[3][1]==0|| tablo[2][2]==0|| tablo[3][3]==0)
	                	{
	                    	return 1;
	                	}
	                	else
	                	{
	                    	return 0;
	                	}
	           		}    
	            	else if (index==15)
	            	{
	            		if (tablo[3][2]==0||tablo[2][3]==0)
	            		{
	            			return 1;
	            		}
	            		else
	            		{
	            			return 0;
	            		}
	            	
	            	}    
	            
	        }
	    }
	    return 0;
	}

	
	
public static void main(String[] args) {
	int secim=1,hamle=0;
	while(secim==1){
		puzzle nesne=new odev5();
		nesne.tabloCiz();
        nesne.tabloYaz();
        int kontrol=1;
        int rakam;
        while(kontrol==1)
        {
        	System.out.println("\n("+hamle+".hamle)Lutfen hareket ettirmek istediginiz rakami seciniz...:");
        	Scanner giris = new Scanner(System.in); 
        	rakam = giris.nextInt();
        	hamle++;

         
            int index=nesne.yerKontrol(rakam);
            if(nesne.tasKontrol(index)==1){
                nesne.degisimYap(rakam);

                nesne.tabloYaz();
                if(nesne.oyunBitis()==1)
                {
                    nesne.tabloYaz();
	                System.out.println("Tebrikler oyunu bitirdiniz.Tekrar oynamak ister misiniz(1/0)?"+"Hamle sayiniz:"+hamle);
    	        	Scanner scr = new Scanner(System.in); 
                    secim = scr.nextInt();
                    
                    break;
                }
            }
            else
            {
                System.out.println("\n\n hareket edemez!\n\n"+rakam);
            }
        }

    }
}
}
        
	
	    
	
