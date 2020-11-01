package TareaHilos;

public class MiHilo{
   public static void main(String args[]) {
	HiloRun Trabajo = new HiloRun();
	Thread Hilo1 = new Thread(Trabajo); 
	Thread Hilo2 = new Thread(Trabajo); 
	Thread Hilo3 = new Thread(Trabajo);
	Hilo1.setName("Hilo Video");
	Hilo2.setName("Hilo Musica");
	Hilo3.setName("Hilo Archivo");
	
	Hilo1.start();
	Hilo3.start();
	Hilo2.start();
	try {
		Hilo1.join();
		Hilo2.join();
		Hilo3.join();
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("Termina Hilo Principal");
	
}
}
class HiloRun implements Runnable{
	@Override
	public void run() {
		for(int x=0; x<10;x++)
		{
			String NombreDeHilo = Thread.currentThread().getName();
			System.out.println(NombreDeHilo);
		}
	}
}





