import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count_numbers {
    String cadena = "";

    public Count_numbers(String cadena) {
        this.cadena = cadena;
    }

    public void cuenta_numeros(){
        Pattern myPattern = Pattern.compile("[0-9]");
        Matcher myMatcher = myPattern.matcher(this.cadena);

        int cantidad = 0;
        while (myMatcher.find()) {
            cantidad ++;
        }

        System.out.println("La cantidad de numeros es: "+ cantidad);
    }
}
