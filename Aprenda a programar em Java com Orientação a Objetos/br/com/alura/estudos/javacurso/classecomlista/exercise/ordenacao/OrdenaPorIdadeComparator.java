package br.com.alura.estudos.javacurso.classecomlista.exercise.ordenacao;

import java.util.Comparator;

public class OrdenaPorIdadeComparator implements Comparator<Funcionario>{

    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }

}