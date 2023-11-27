import java.util.Scanner;

public class EnvioNotaFiscal {

    public static void main(String[] args) {
        Autenticacao autenticacao = new Autenticacao();
        Contabilidade contabilidade = new Contabilidade();

        Scanner scanner = new Scanner(System.in);

        // Simula o login
        Usuario usuarioAutenticado = fazerLogin(autenticacao, scanner);

        if (usuarioAutenticado != null) {
            // Simula o envio de uma nota fiscal
            enviarNotaFiscal(usuarioAutenticado, contabilidade, scanner);
        } else {
            System.out.println("Login falhou. Verifique o nome de usuário e senha.");
        }
    }

    private static Usuario fazerLogin(Autenticacao autenticacao, Scanner scanner) {
        System.out.print("Digite o nome de usuário: ");
        String username = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        return autenticacao.autenticar(username, senha);
    }

    private static void enviarNotaFiscal(Usuario usuario, Contabilidade contabilidade, Scanner scanner) {
        System.out.print("Digite o número da nota fiscal: ");
        String numeroNota = scanner.nextLine();
        System.out.print("Digite o conteúdo da nota fiscal: ");
        String conteudoNota = scanner.nextLine();

        NotaFiscal notaFiscal = new NotaFiscal(numeroNota, conteudoNota);
        contabilidade.receberNotaFiscal(notaFiscal);
    }
}
