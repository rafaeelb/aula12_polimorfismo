public class Umbreon extends Eevee {

    public Umbreon(String tipo, int altura, int hp, double peso){
        super(tipo, altura, hp, peso);
    }

    @Override
    public String ataque() {
        return "Projeto sombrio";
    }

    @Override
    public String defesa() {
        return "Miragem";
    }

    @Override
    public String especial() {
        return "Lança negra";
    }

    @Override
    public void imprimir(){
        System.out.println("Meu nome é: Umbreon");
        System.out.println("Tipo: " +getTipo());
        System.out.println("Altura: " + getAltura());
        System.out.println("HP: " + getHP());
        System.out.println("Peso: " + getPeso());
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());
        System.out.println("=================================");
    }
    
}
