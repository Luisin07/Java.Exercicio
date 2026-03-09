public class Oculos {

    private String tamanho;
    private String modelo;
    private double grau;

    // Construtor
    public Oculos(String tamanho, String modelo, double grau) {
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.grau = grau;
    }

    // Getters e Setters
    public String getTamanho() {
        return tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public double getGrau() {
        return grau;
    }

    // Método 1 - altera atributo com validação
    public void ajustarGrau(double novoGrau) {
        if (novoGrau >= 0) {
            grau = novoGrau;
            System.out.println("Grau ajustado para: " + grau);
        } else {
            System.out.println("Valor inválido para grau.");
        }
    }

    // Método 2 - altera atributo com validação
    public void trocarModelo(String novoModelo) {
        if (novoModelo != null && !novoModelo.isEmpty()) {
            modelo = novoModelo;
            System.out.println("Modelo trocado para: " + modelo);
        } else {
            System.out.println("Modelo inválido.");
        }
    }

    public static void main(String[] args) {

        Oculos oculos = new Oculos("Médio", "Esportivo", 2.0);

        System.out.println("Modelo atual: " + oculos.getModelo());
        System.out.println("Grau atual: " + oculos.getGrau());

        // Testes válidos
        oculos.ajustarGrau(2.5);
        oculos.trocarModelo("Clássico");

        // Testes inválidos
        oculos.ajustarGrau(-1);
        oculos.trocarModelo("");
    }
}