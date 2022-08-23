import java.util.Scanner;

public class Test1 {




    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite aqui quantos alunos vão ser armazenados: ");
        int qntalunos = entrada.nextInt();
        
        System.out.print("Digite aqui a quantidade de notas avaliadas para a média: ");
        int qntnotas = entrada.nextInt();
        
        double notas[][]= new double[qntalunos][qntnotas];
        double media[]= new double[qntalunos];
        double notaf = 0;
        
        for (int a = 0; a < notas.length; a++) 
        {   
            for (int j = 0; j < notas[a].length; j++)
            {
                System.out.print("Digite a "+ (j+1) + "ª nota do "+ (a+1) +"º aluno: ");
                notaf += entrada.nextDouble();
            }
           
            media[a]= notaf/qntnotas;
            notaf = 0;            
        }
        System.out.println("=========================================");
        System.out.println("\tTABELA DE MÉDIA DOS ALUNOS");
        System.out.println("=========================================");
        for (int i = 0; i < qntalunos; i++) {
           System.out.print("| A média do "+ (i+1) +"º aluno é: "+media[i]); 
            if (media[i] >= 60.0) 
            {
                System.out.println(" --> Aprovado!");
            } else 
            {
                System.out.println(" --> Reprovado!");
            }
        }
        
        
        
        
        entrada.close();

    
}
    


}
