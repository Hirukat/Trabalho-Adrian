public class NotaFiscal {
    private String numero;
    private String conteudo;

    public NotaFiscal(String numero, String conteudo) {
        this.numero = numero;
        this.conteudo = conteudo;
    }

    public String getNumero() {
        return numero;
    }

    public String getConteudo() {
        return conteudo;
    }
}
