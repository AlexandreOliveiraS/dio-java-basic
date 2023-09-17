public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "X";
        String segundoNome = "D";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        System.out.println("Pronto!");
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
