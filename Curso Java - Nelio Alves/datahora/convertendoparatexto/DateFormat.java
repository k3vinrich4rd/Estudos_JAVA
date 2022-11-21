package datahora.convertendoparatexto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Para fuso
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; //Data local
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; //Data local


        //Para converter a data para formato Br
        System.out.println("d01 = " + d01.format(fmt1)); //Forma de imprimir
        System.out.println("d01 = " + fmt1.format(d01)); //Forma de imprimir
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //Forma de imprimir

        System.out.println();

        System.out.println("d02 = " + d02.format(fmt1));
        System.out.println("d02 = " + d02.format(fmt2));

        System.out.println();
        System.out.println("d03 = " + fmt3.format(d03));

        System.out.println();
        System.out.println("d04 = " + d02.format(fmt4));

        System.out.println();
        System.out.println("d05 = " + fmt5.format(d03));
        System.out.println("d05 = " + d03);

    }
}
