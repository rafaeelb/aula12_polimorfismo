public class Vaporeon extends Eevee {

    public Vaporeon(String tipo, int altura, int hp, double peso){
        super(tipo, altura, hp, peso);
    }

    @Override
    public String ataque() {
      return "Jato de água";
    }

    @Override
    public String defesa() {
        return "Capsula de bolha";
    }

    @Override
    public String especial() {
        return "Manto d'água";
    }
    
    @Override
    public void imprimir(){
        System.out.println("Meu nome é: Vaporeon");
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
