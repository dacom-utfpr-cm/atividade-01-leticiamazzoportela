package Exercicio04;

/**
 * Exercício 04 - ControlThread
 * 
 * @author Letícia Mazzo Portela
 * @since Mar/2020
 */
public class ControlThread extends Thread {
    String tName;

    public ControlThread(String name) {
        this.tName = name;
    }

	public void run() {
        while(true) {
            if (Thread.interrupted()) {
                System.out.println("Interrupted " + tName + " thread");
                break;
            }
        }
    }
}