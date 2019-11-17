package examen_efre;
import java.util.*;
public class Examen_Efre {
public static void main(String[] args) {
      double a=20,b=15,h=30,k=20,y=0,x=0;
      double rx=100,ry=120;
      double y1=0,y2=0,y3=0;
      double x1=0,x2=0,x3=0;
      double i=0,j=0,i1=0,j1=0,i2=0,j2=0,i3=0,j3=0;
      String aux="";
      int auxInt = 0,cont=0;
      ArrayList<Double> yt = new ArrayList<>();
      ArrayList<Double> xt = new ArrayList<>();
      
        System.out.println("Para tabla sacando y=k+b");
        System.out.println("i     X        Y     X1      Y1       X2     Y2       X3     Y3      i        j       i1      j1       i2      j2     i3     j3");
        
        for (double q = h; q <= (h+a); q++) {//x
            x=q;
            y=(k+b*Math.sqrt( 1-  Math.pow((x-h),2)/Math.pow(a, 2)  )  );
            aux = String.valueOf(y);
            auxInt = Integer.parseInt(String.valueOf(aux.charAt(3)));
            yt.add(y);
            if(auxInt > 5){
                y = (int)y+1;
            }else{
                y = (int)y;
            }
            x1= 2*h-x;
            y1=y;
            x2=2*h-x;
            y2=2*k-y;
            x3=x;
            y3=y2;
            
            i=rx-y;
            i1=rx-y1;
            i2=rx-y2;
            i3=rx-y3;
            
            j=x;
            j1=x1;
            j2=x2;
            j3=x3;
            cont++;
            System.out.println(cont+" || "+x+" || "+y+" || "+x1+" || "+y1+" || "+x2+" || "+y2+" || "+x3+" || "+y3+" || "+i+" || "+j+" || "+i1+" || "+j1+" || "+i2+" || "+j2+" || "+i3+" || "+j3);
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        
        System.out.println();
        System.out.println("Para tabla sacando x=k+b");
        System.out.println("i     X        Y     X1      Y1       X2     Y2       X3     Y3      i        j       i1      j1       i2      j2     i3     j3");
         y1=0;y2=0;y3=0;
         x1=0;x2=0;x3=0;
         i=0;j=0;i1=0;j1=0;i2=0;j2=0;i3=0;j3=0;
         cont=0;
        
        for (double q = k; q <= (k+b); q++) {//x
            y=q;
            x=(h+a*Math.sqrt( 1-  Math.pow((y-k),2)/Math.pow(a, 2)  )  );
            aux = String.valueOf(x);
            auxInt = Integer.parseInt(String.valueOf(aux.charAt(3)));
            xt.add(x);
            if(auxInt > 5){
                x = (int)x+1;
            }else{
                x = (int)x;
            }
            
            x1= 2*h-x;
            y1= y;
            
            x2= 2*k-y;
            y2=2*h-x;
            x3=x;
            y3=y2;
            
            i=rx-y;
            i1=rx-y1;
            i2=rx-y2;
            i3=rx-y3;
            
            j=x;
            j1=x1;
            j2=x2;
            j3=x3;
            cont++;
            System.out.println(cont+" || "+x+" || "+y+" || "+x1+" || "+y1+" || "+x2+" || "+y2+" || "+x3+" || "+y3+" || "+i+" || "+j+" || "+i1+" || "+j1+" || "+i2+" || "+j2+" || "+i3+" || "+j3);
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        
        for (int l = 0; l < xt.size(); l++) {
            System.out.println((l+1)+" || X = "+xt.get(l));
        }
        for (int l = 0; l < yt.size(); l++) {
            System.out.println((l+1)+" || Y= "+yt.get(l));
        }
    }
}
