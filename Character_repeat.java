public class Character_repeat {
    String cadena = "";
    char caracter = ' ';

    public Character_repeat(char caracter, String cadena) {
        this.caracter = caracter;
        this.cadena = cadena;
    }

    public void metodo1(){
        char[] temp_cadena = this.cadena.toCharArray();
        int cont = 0;
        for (char c: temp_cadena
             ) {
            if (c==this.caracter){
                cont++;
            }
        }
        String message = String.format("El caracter %s se repite %d veces",this.caracter,cont);
        System.out.println(message);
    }

    public void metodo2(){

    }
}
