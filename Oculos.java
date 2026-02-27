public class Oculos {

    String tamanho;
    String modelo;
    double grau;

    void melhorarVisao() {
        System.out.println("Melhorando a visão");
    }

    void protegerOlhos() {
        System.out.println("Protegendo os olhos");
    }

    public static void main(String[] args) {
        Oculos oculos = new Oculos();

        oculos.tamanho = "Médio";
        oculos.modelo = "Esportivo";
        oculos.grau = 2.0;

        oculos.melhorarVisao();
        oculos.protegerOlhos();
    }
}