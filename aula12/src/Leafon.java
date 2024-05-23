public class Leafon extends Eevee {

    public Leafon(String tipo, int altura, int hp, double peso){
        super(tipo, altura, hp, peso);
    }

    @Override
    public String ataque() {
        return "Hálito de folhas";
    }

    @Override
    public String defesa() {
        return "Guarda folha";
    }

    @Override
    public String especial() {
        return "Hera astral";
    }
    
    @Override
    public void imprimir(){
        System.out.println("Meu nome é: Leafon");
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
