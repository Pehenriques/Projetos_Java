public class SmartTv {

    boolean ligada = false;
    boolean desligar = true;
    int volume = 25;
    int canal= 1;

    public void ligar() {
        ligada = true;
        
    }
    public void desligar() {
        desligar = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentendo o Volume para " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o Volume para " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentendo o Canal para " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo o Canal para " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        //System.out.println("Canal trocado para " + canal);
    }
}