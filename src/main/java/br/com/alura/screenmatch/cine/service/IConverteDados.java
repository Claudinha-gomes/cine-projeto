package br.com.alura.screenmatch.cine.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
