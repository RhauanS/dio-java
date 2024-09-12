public class App {
    public static void main(String[] args) throws Exception {
        int numero = 1;
        int courtP = 0;
        int courtI = 0;
        

        for(int i = 1; i <= 77; i ++) {
            
            if (numero % 2 == 0) {               
                courtP = courtP + 1;               
            } 


            else{               
                courtI = courtI + 1;               
            }
            numero ++;        

                
        }
        System.out.println("Quantidade de numeros pares = " + courtP);
        System.out.println("Quantidade de numero impares = " + courtI);
       
    }
}
