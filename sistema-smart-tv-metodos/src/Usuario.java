public class Usuario {
   public static void main(String[] args) {
        SmartTV compotamento = new SmartTV();   

       

        System.out.println("TV Ligada ? " + compotamento.ligada);
        System.out.println("Canal atual: " + compotamento.canal);
        System.out.println("Volume atual: " + compotamento.volume);

        for(int i = 0; i < 3; i++){
            compotamento.aumentarCanal();
            compotamento.aumentarVolume();
            compotamento.ligar();
            
        }

        System.out.println("Status -> TV Ligada ? " + compotamento.ligada);
        System.out.println("Status -> Canal atual: " + compotamento.canal);
        System.out.println("Status -> Volume atual: " + compotamento.volume);




        }
}
