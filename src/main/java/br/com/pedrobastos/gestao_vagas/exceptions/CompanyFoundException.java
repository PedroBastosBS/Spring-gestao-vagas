package br.com.pedrobastos.gestao_vagas.exceptions;

public class CompanyFoundException extends RuntimeException{
    public CompanyFoundException() {
        super("Compania já existe.");
    }
}
