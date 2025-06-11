package br.com.erudio.math;

import br.com.erudio.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {
    public double sum(double numberOne, double numberTwo) {

        return numberOne + numberTwo;
    }

    public double sub(double numberOne, double numberTwo) {

        return numberOne - numberTwo;
    }

    public double mult(double numberOne, double numberTwo) {

        return numberOne * numberTwo;
    }

    public double div(double numberOne, double numberTwo) {

        return numberOne / numberTwo;
    }

    public double avg(double numberOne, double numberTwo) {

        return (numberOne + numberTwo) / 2;
    }

    public double sqrt (double number) {

        return Math.sqrt(number);
    }
}
