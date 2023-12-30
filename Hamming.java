public class Hamming{
    String cadena_a = "";
    String cadena_b = "";

    public Hamming(String cadena_a, String cadena_b) {
        this.cadena_a = cadena_a;
        this.cadena_b = cadena_b;
    }

    public void calcula_distancia(){
        char[] cadena_1 = this.cadena_a.toCharArray();
        char[] cadena_2 = this.cadena_b.toCharArray();
        if (cadena_1.length != cadena_2.length){
            System.out.println("Longitudes distintas");
        }
        else {
            int distancia = 0;
            for (int i=0; i<cadena_1.length;i++){
                if (cadena_1[i]!=cadena_2[i]){
                    distancia++;
                }
            }
            System.out.println("La distancia de hamming es de:"+distancia);
        }
    }
}
