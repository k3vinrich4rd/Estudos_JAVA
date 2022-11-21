package datahora.calculodatahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-11-21");
        LocalDateTime d05 = LocalDateTime.parse("2022-11-21T01:30:26");
        Instant d06 = Instant.parse("2022-11-21T01:30:26Z");

        LocalDate passWeekLocalDate = d04.minusDays(7); //minus (menos) subtrai dias
        LocalDate nextWeekLocalDate = d04.plusDays(7); // plus (soma) adição de dias

        System.out.println("passWeekLocalDate = " + passWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println();

        LocalDateTime passWeekLocalDateTime = d05.minusDays(7); //minus (menos) subtrai dias
        // (Quando se trata de LocalDatTime, também podemos adicionar outra medida de horário
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); // plus (soma) adição de dias

        System.out.println("passWeekLocalDateTime = " + passWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println();

        Instant passWeekInstant = d06.minus(7, ChronoUnit.DAYS); //É necessário usar um tipo Enum
        //Para fazer a subtração de dias com um objeto Instant
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("passWeekInstant = " + passWeekInstant);
        System.out.println("nextWeekInstant " + nextWeekInstant);

        System.out.print("----------------------------------------");
        //Para calcular a duração (Não é possível fazer esse calculo com LocalDate
        //É necessário converter antes, para converter:
        Duration t1 = Duration.between(passWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
        System.out.println("\nt1 days = " + t1.toDays());
        //Outra forma de conversão
        Duration _t1 = Duration.between(passWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("t1 days = " + _t1.toDays());

        System.out.println("----------------------------------------");
        //Sem Conversão
        Duration t2 = Duration.between(passWeekLocalDateTime, d05);
        System.out.println("t2 days = " + t2.toDays());

        System.out.println("----------------------------------------");
        Duration t3 = Duration.between(passWeekInstant, d06);
        System.out.println("t3 days = " + t3.toDays());

        System.out.println("----------------------------------------");
        Duration t4 = Duration.between(d06, passWeekInstant);
        System.out.println("t4 days = " + t4.toDays());

    }
}
