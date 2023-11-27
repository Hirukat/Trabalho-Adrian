import java.util.HashMap;
import java.util.Map;

public class Autenticacao {
    private Map<String, Usuario> usuarios;

    public Autenticacao() {
        usuarios = new HashMap<>();
        // Adicione alguns usuários de exemplo (substitua com um banco de dados real em produção)
        usuarios.put("usuario1", new Usuario("usuario1", "senha1"));
        usuarios.put("usuario2", new Usuario("usuario2", "senha2"));
    }

    public Usuario autenticar(String username, String senha) {
        Usuario usuario = usuarios.get(username);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        }
        return null;
    }
}
