public class Espeon extends Eevee {

    public Espeon(String tipo, int altura, int hp, double peso){
        super(tipo, altura, hp, peso);
    }

    @Override
    public String ataque() {
        return "Feixe psíquico";
    }

    @Override
    public String defesa() {
        return "Disparo zen";
    }

    @Override
    public String especial() {
        return "Revelação solar";
    }

    @Override
    public void imprimir() {
        System.out.println("Meu nome é: Espeon");
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
