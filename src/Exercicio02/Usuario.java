package Exercicio02;
public class Usuario{
    private String senha;
    private String nome;
    private int id;
    private String email;
    private char sexo;

    public Usuario(){
        this.id = 0;
        this.nome = " ";
        this.senha = " ";
        this.email = " ";
        this.sexo = '*';
    }

    public Usuario(int id, String nome, String email, String senha, char sexo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
   

    @Override
    public String toString(){
        return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", sexo=" + sexo + "]";
    }
} 