public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    //Método Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    //Métodos Personalizados
    public void adicionarEstoque(int quantidade){
        this.quantidadeEmEstoque += quantidade;
    }

    public void removerEstoque(int quantidade){
        if(quantidade <= this.quantidadeEmEstoque){
            this.quantidadeEmEstoque -= quantidade;
        }else{
            System.out.println("Quantidade insuficiente em estoque!");
        }
    }

    public double calcularValorTotalEmEstoque(){
        return this.preco * this.quantidadeEmEstoque;
    }

    public void exibirDetalhes(){
        System.out.println("Produto: " + nome + ", Preço: R$ " + preco + ", Quantidade em estoque: " + quantidadeEmEstoque);
    }

    //Métodos getters & setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}