public class Sylveon extends Eevee {

    public Sylveon(String tipo, int altura, int hp, double peso){
        super(tipo, altura, hp, peso);
    }

    @Override
    public String ataque() {
        return "Voz desarmante";
    }

    @Override
    public String defesa() {
        return "Fita mágica";
    }

    @Override
    public String especial() {
        return "Chicote sinfônico";
    }
    
    @Override
    public void imprimir(){
        System.out.println("Meu nome é: Sylveon");
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
