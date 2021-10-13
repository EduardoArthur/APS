public class Usuario {
    private String nome;
    private String senha;
    private String outrasInformacoes;
    private DitaData dita_data;

    public Usuario(String nome, String senha, String outrasInformacoes) {
        this.nome = nome;
        this.senha = senha;
        this.outrasInformacoes = outrasInformacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getOutrasInformacoes() {
        return outrasInformacoes;
    }

    public void setOutrasInformacoes(String outrasInformacoes) {
        this.outrasInformacoes = outrasInformacoes;
    }

    public DitaData getDita_data() {
        return dita_data;
    }

    public void setDita_data(DitaData dita_data) {
        this.dita_data = dita_data;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", outrasInformacoes='" + outrasInformacoes + '\'' +
                ", dita_data=" + dita_data +
                '}';
    }
}
