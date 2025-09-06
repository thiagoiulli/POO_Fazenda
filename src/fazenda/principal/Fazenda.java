package fazenda.principal;

import java.util.HashMap;

public class Fazenda {
    private int count;
    private Animal[] animais;

    public Fazenda(){
        count = 0;
        animais = new Animal[count];
    }

    public void addAnimal(Animal animal){
        Animal[] aux = new Animal[count + 1];
        for(Object i : animais){
            i = new Animal();
        }
        System.arraycopy(animais, 0, aux, 0, count);
        aux[count] = animal;
        count++;
        animais = aux;
    }

    public void remAnimal(String nome){
        for(int i = 0; i < count; i++){
            if(animais[i].getNome().equals(nome)){
                for(int j = i; j < animais.length-1; j++){
                    animais[j] = animais[j + 1];
                }
                count--;
                Animal[] aux = new Animal[count];
                System.arraycopy(animais, 0, aux, 0, count);
                animais = aux;
            }
        }
    }

    public int contarAnimais(){
        return count;
    }

    public double exibirQuantidadeRacao(){
        double total = 0;
        for(Animal i : animais){
            total += i.getQtdRacao();
        }
        return total * 30;
    }

    public String exibirRacaoPorTipo(){
        HashMap tipos = new HashMap<String, Double>();
        for(int i = 0; i < count; i++) {
            if (!tipos.containsKey(animais[i].getTipoRacao())) {
                double qtd = animais[i].getQtdRacao();
                tipos.put(animais[i].getTipoRacao(), qtd);
            }
            else{
                double qtd = (double) tipos.get(animais[i].getTipoRacao());
                qtd += animais[i].getQtdRacao();
                tipos.put(animais[i].getTipoRacao(), qtd);
            }
        }
        String retornar = "";
        for (Object key : tipos.keySet()) {
            retornar = (retornar + key.toString() + ": " + tipos.get(key) + "\n");
        }
        return retornar;
    }
}
