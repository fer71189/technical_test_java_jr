public class Main {
    public static void main(String[] args) {
        Invertir_cadena invertir_cadena = new Invertir_cadena("Hola");
        Character_repeat characterRepeat = new Character_repeat('a', "asdfasaadfjks23423");
        Hamming hamming = new Hamming("taxto1","taxto2");
        Count_words contado_palabras = new Count_words("   La   hora   es       ahora   ");
        Count_numbers count_numbers = new Count_numbers("adfas1212as1das1%");

        invertir_cadena.invierte();
        invertir_cadena.invierte_loop();

        characterRepeat.metodo1();

        hamming.calcula_distancia();

        contado_palabras.contar_palabras();

        count_numbers.cuenta_numeros();

    }
}