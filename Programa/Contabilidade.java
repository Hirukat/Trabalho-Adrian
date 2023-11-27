import java.util.ArrayList;
import java.util.List;

public class Contabilidade {
    private List<NotaFiscal> notasFiscaisEnviadas;

    public Contabilidade() {
        notasFiscaisEnviadas = new ArrayList<>();
    }

    public void receberNotaFiscal(NotaFiscal notaFiscal) {
        notasFiscaisEnviadas.add(notaFiscal);
        System.out.println("Nota fiscal recebida: " + notaFiscal.getNumero());
    }
}
