import java.util.regex.Pattern;

public class Expres {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Da un argumento.");
            return;
        }

        String cadena = args[0];
        String regexHolaMundo = "\\bHola mundo\\b";
        boolean valido = Pattern.matches(regexHolaMundo, cadena);

        System.out.println("Cadena proporcionada: " + cadena);
        System.out.println("Validación de la cadena:");
        System.out.println("Hola mundo: " + valido);
    }
}
