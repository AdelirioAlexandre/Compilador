//Alguma-lex
package compilador;
public class Lexi {
    public static void main(String[] args) {
        Lexico lex = new Lexico(args[0]);
        Token t = null;

        while ((t = lex.proximoToken()).nome != TipoToken.Fim) {
            System.out.print(t);
        }
    }
}
