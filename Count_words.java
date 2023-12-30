public class Count_words {
    String cadena = "";

    public Count_words(String cadena) {
        this.cadena = cadena;
    }

    public void contar_palabras(){
        int n =0;
        String texto = this.cadena.replaceAll("\s+"," ").trim();
        String[] array_cadena = texto.split(" ");
        n = array_cadena.length;
        System.out.println("La cantidad de palabras es:"+n);
    }
}
