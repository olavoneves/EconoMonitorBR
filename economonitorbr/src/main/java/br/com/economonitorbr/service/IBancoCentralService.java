package br.com.economonitorbr.service;

public interface IBancoCentralService {
    <T> T obterDados(String json, Class<T> classe);
}
