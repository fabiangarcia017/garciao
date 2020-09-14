class Fibonacci{
    public static void main(String[] args){
 int iteraciones=20, cont=0,num1=0, num2=1, num3=0;
     do
     {
          num3=num1+num2;
         System.out.println ("interacion "+cont+" "+num3 );
         num1=num2;
         num2=num3;
         cont += 1;
     }while(cont<iteraciones);
    }
}