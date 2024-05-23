public class Glaceon extends Eevee {

    public Glaceon(String tipo, int altura, int hp, double peso){
        super(tipo, altura, hp, peso);
    }

    @Override
    public String ataque() {
        return "Olhar congelante";
    }

    @Override
    public String defesa() {
        return "Carga de gelo";
    }

    @Override
    public String especial() {
        return "Granizo";
    }

    @Override
    public void imprimir(){
        System.out.println("Meu nome é: Glaceon");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Altura: " + getAltura());
        System.out.println("HP: " + getHP());
        System.out.println("Peso: " + getPeso());
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());
        System.out.println("=================================");
    }
    
}
