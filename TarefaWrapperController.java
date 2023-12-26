package br.ebac.TarefaWrappercontroller;

public class TarefaWrapper {

    public static void main(String[] args) {
       
        int valorPrimitivo = 42;

        System.out.println("Valor primitivo: " + valorPrimitivo);

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor wrapper: " + valorWrapper);
    }
}



