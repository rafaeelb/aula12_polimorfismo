public class Flareon extends Eevee {

    public Flareon(String tipo, int altura, int hp, double peso){
        super(tipo, altura, hp, peso);
    }
    
    @Override
    public String ataque() {
        return "Chama reluzente";
    }

    @Override
    public String defesa() {
        return "Chama furacão";
    }

    @Override
    public String especial() {
        return "Hálito flamejante";
    }
    
    @Override
    public void imprimir(){
        System.out.println("Meu nome é: Flareon");
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
