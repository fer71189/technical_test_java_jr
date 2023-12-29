public class Invertir_cadena {
    String cadena = "";
    public Invertir_cadena(String cadena){
        this.cadena = cadena;
    }

    public void invierte (){
        String n_cadena = new StringBuilder(this.cadena).reverse().toString();
        System.out.println(n_cadena);
    }
    public void invierte_loop(){
        char[] temp_cadena = this.cadena.toCharArray();
        int indice=temp_cadena.length - 1;
        StringBuilder solucion= new StringBuilder();
        for (int i=indice;i>=0;i--){
            solucion.append(temp_cadena[i]);
            //System.out.print(temp_cadena[i]);
        }
        System.out.print(solucion);
    }
}
