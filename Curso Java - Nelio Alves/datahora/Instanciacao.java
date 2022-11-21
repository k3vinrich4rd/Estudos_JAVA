package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
public class Instanciacao {
    public static void main(String[] args) {

        //Dia, mês, ano e hora
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //Formata datas de String para objeto data hora

        LocalDate d01 = LocalDate.now(); //A partir do agora
        LocalDateTime d02 = LocalDateTime.now(); // A partir de agora com horário
        Instant d03 = Instant.now(); // A partir de agora com data e hora, e fuso horário(Z no final (GMT)
        LocalDate d04 = LocalDate.parse("2022-11-20"); //Para transformar um texto ISO, para data
        LocalDateTime d05 = LocalDateTime.parse("2022-11-20T17:36:20");  //Para transformar um texto ISO, para data e hora
        Instant d06 = Instant.parse("2022-11-21T09:04:26Z"); //Para transformar uma data hora no padrão UTC
        //Instant d07 = Instant.parse("2022-11-21T09:04:26-03:00"); //Horário equivalente no zulu
        LocalDate d08 = LocalDate.parse("20/11/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")); //Texto formato customizado
        // //Dia, mês, ano
        LocalDateTime d09 = LocalDateTime.parse("20/11/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 11, 21); //Para instanciar data a partir de dias isolados
        LocalDateTime d11 = LocalDateTime.of(2022, 11, 20, 1, 30); //Para instanciar data a partir de dias isolados

        System.out.println("d01 = " + d01.toString());
        System.out.println("\nd02 = " + d02.toString());
        System.out.println("\nd03 = " + d03.toString());
        System.out.println("\nd04 = " + d04.toString());
        System.out.println("\nd05 = " + d05.toString());
        System.out.println("\nd06 = " + d06.toString());
        //System.out.println("d07 = " + d07.toString());
        System.out.println("\nd08 = " + d08.toString());
        System.out.println("\nd09 = " + d09.toString());
        System.out.println("\nd10 = " + d10.toString());
        System.out.println("\nd11 = " + d11.toString());


    }
}
