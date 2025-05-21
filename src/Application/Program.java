package Application;

import Entities.ContratoHora;
import Entities.Departamento;
import Entities.Trabalhador;
import Entities.enums.NivelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
    
public class Program {
    public static void main(String[] Args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Informe os dados do trabalhor: ");
        System.out.println("Nome: ");
        String nomeTrabalhador = sc.nextLine();

        System.out.println("Nível: ");
        String nivelTrabalhador = sc.nextLine();

        System.out.println("Salário base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));

        System.out.println("Quantos contratos este trabalhador tem?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Contrato numero #%d: \n", i + 1);
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.println("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.println("Duração(horas): ");
            int horas = sc.nextInt();

            ContratoHora contratoHora = new ContratoHora(dataContrato, valorPorHora, horas);

            trabalhador.adicionarContrato(contratoHora);
        }

        System.out.println();
        System.out.println("Entre com mês e ano para calcular ganhos (MM/YYYY): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Ganhos de " + mesEAno + ": " + String.format("%.2f", trabalhador.ganhos(ano, mes)));


    }
}











