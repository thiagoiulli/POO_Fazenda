package fazenda.principal;

public class Teste {
    public static void main(String[] args){
        Fazenda mc = new Fazenda();
        Animal a1 = new Animal("Pato", "Preto", "Rex", "Ração A", 2.5);
        Animal a2 = new Animal("Ganso", "Marrom", "Max", "Ração B", 3.0);
        Animal a3 = new Animal("Arara", "Branco", "Bob", "Ração A", 1.5);
        mc.addAnimal(a1);
        mc.addAnimal(a2);
        mc.addAnimal(a3);
        System.out.println("Total de animais: " + mc.contarAnimais());
        System.out.println("Total de ração necessária: " + mc.exibirQuantidadeRacao());
        System.out.print(mc.exibirRacaoPorTipo());
        mc.remAnimal("Bob");
        System.out.println("Total de animais após remoção: " + mc.contarAnimais());
        System.out.println("Total de ração necessária após remoção: " + mc.exibirQuantidadeRacao());
        System.out.println(mc.exibirRacaoPorTipo());
    }
}
