public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee eevee = new Eevee("Evolução", 300,4,6.5);
        Jolteon jolteon = new Jolteon("Elétrico",800,4,24.5);
        Espeon espeon = new Espeon("Psíquico",900,4,26.5);
        Flareon flareon = new Flareon("Fogo",900,4,25);
        Glaceon glaceon = new Glaceon("Gelo", 800,4,25.9);
        Leafon leafon = new Leafon("Planta", 1000,4,25.5);
        Sylveon sylveon = new Sylveon("Estelar",1000,5,23.5);
        Umbreon umbreon = new Umbreon("Sombrio",1000,6,27);
        Vaporeon vaporeon = new Vaporeon("Água", 1000,8,29);

        eevee.imprimir();
        jolteon.imprimir();
        espeon.imprimir();
        flareon.imprimir();
        glaceon.imprimir();
        leafon.imprimir();
        sylveon.imprimir();
        umbreon.imprimir();
        vaporeon.imprimir();
    }
}
