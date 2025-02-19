public class PlanoOperadora {
    public static void main(String[] args) {
        /*int minutos = 100;
        double valor = 0.0;
        if(minutos < 100)
            valor = 50.0;
        else if(minutos < 200)
            valor = 70.0;
        else if(minutos < 300)
            valor = 90.0;
        else
            valor = 110.0;
        System.out.println("Valor da conta: " + valor); */

        String plano = "T"; //M/T

        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
                break;
            }
            case "M":{
                System.out.println("Whatsapp Ilimitado + Instagram Ilimitado");
                break;
            }
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
            default:{
                System.out.println("Plano inválido");
                break;
            }
        }
    }
}
