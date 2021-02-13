package exercicios01;

public class Diretor {

    private String nome;
    private int idade;
    private int qtdeDeFilmesProduzidos;
    private Genero genero;

    public Diretor(String nome, int idade, int qtdeDeFilmesProduzidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.qtdeDeFilmesProduzidos = qtdeDeFilmesProduzidos;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdeDeFilmesProduzidos() {
        return qtdeDeFilmesProduzidos;
    }

    public void setQtdeDeFilmesProduzidos(int qtdeDeFilmesProduzidos) {
        this.qtdeDeFilmesProduzidos = qtdeDeFilmesProduzidos;
    }

    public String getGenero() {
        return genero.getDescricao();
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void exibirDados() {
        System.out.printf("Nome: %s\nIdade: %02d\nGenero: %s\n",
                this.nome,
                this.idade,
                getGenero());
    }

    @Override
    public String toString() {
        return String.format("\tNome: %s\n\tIdade: %02d\n\tTotal de Filmes dirigidos: %02d",
                this.nome,
                this.idade,
                this.qtdeDeFilmesProduzidos);
    }
}
