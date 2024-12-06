import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        preencherLista(list);
        Collections.sort(list);
        System.out.println("Lista Ordenada: ");
        mostrarLista(list);
        System.out.println("\nDigite o elemento que deseja buscar: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        buscaBinaria(list, x);
        

    }


    public static void preencherLista(ArrayList<Integer> list){
        System.out.println("Quantos elementos deseja adicionar?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Digite o elemento " + (i+1) + ": ");
            int x = sc.nextInt();
            list.add(x);
        }
    }
    public static void mostrarLista(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(" "+list.get(i));
        }
    }
    public static void buscaBinaria(ArrayList<Integer> list, int x){
        int inicio = 0;
        int fim = list.size() - 1;
        int meio = (inicio + fim) / 2;
        while(inicio <= fim){
            if(list.get(meio) == x){
                System.out.println("Elemento encontrado na posicao: " + meio);
                return;
            }
            else if(list.get(meio) < x){
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
            meio = (inicio + fim) / 2;
        }
        System.out.println("Elemento não encontrado");
    }
   
}
