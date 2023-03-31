package br.com.alura.estudos.javacurso.poo.bytebank.template;

import java.text.DecimalFormat;

public class FormattingNumbers {

    public String getBehaviorNumberFormatting(Number number) {
        return DecimalFormat.getNumberInstance().format(number);
    }
}