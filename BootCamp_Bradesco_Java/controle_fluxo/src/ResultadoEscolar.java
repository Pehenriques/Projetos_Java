public class ResultadoEscolar {
    public static void main(String[] args) {
       /* double nota1 = 7.0;
        double nota2 = 8.0;
        double nota3 = 6.0;
        double nota4 = 9.0;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 7.0)
            System.out.println("Aprovado");

        else if(media >= 5.0 && media < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");*/

        
        int nota = 3;
        String resultado = (nota >= 7) ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação": "Reprovado";
        System.out.println(resultado);
    }
    
}
