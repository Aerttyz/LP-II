public class App {
    public static void obterMemoriaUsada(){
		int MB = 1024*1024;
		Runtime runtime = Runtime.getRuntime();
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB+"MB");
	}
    
    public static void main (String[] args) {
        Tarefa[] contatos = new Tarefa[100000];
        Tarefa contato;
        for (int i=0; i<contatos.length; i++){
        contato = new Tarefa("Contato"+i,"1234-5678"+i);
        contatos[i] = contato;
        }
        System.out.println("Contatos criados");
        obterMemoriaUsada();
        contatos = null;
        System.gc();
        System.out.println("Contatos removidos da memória");
        obterMemoriaUsada();
        }
}
