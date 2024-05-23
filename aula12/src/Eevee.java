public class Eevee {
    private String tipo;
    private int altura, HP;
    private double peso;

    public Eevee() {
    }

    public Eevee(String tipo, int altura, int hP, double peso) {
        this.tipo = tipo;
        this.altura = altura;
        HP = hP;
        this.peso = peso;
    }

    public String ataque(){
        return "Ataque rápido";
    }

    public String defesa(){
        return "Defesa";
    }

    public String especial(){
        return "Tri-ataque";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int hP) {
        HP = hP;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void imprimir(){
        System.out.println("=================================");
        System.out.println("Meu nome é: Eevee");
        System.out.println("Tipo: " +getTipo());
        System.out.println("Altura: " + getAltura() +" CM");
        System.out.println("HP: " + getHP());
        System.out.println("Peso: " + getPeso() + " KG");
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());
        System.out.println("=================================");
    }
}
