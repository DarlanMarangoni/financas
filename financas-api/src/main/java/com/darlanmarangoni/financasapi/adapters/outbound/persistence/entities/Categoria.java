package com.darlanmarangoni.financasapi.adapters.outbound.persistence.entities;

public enum Categoria {
    TRANSFERENCIA("Transferência"),
    CONTAS("Contas"),
    COMPRAS("Compras"),
    CASA("Casa"),
    CREDITO_E_FINANCIAMENTO("Crédito e financiamento"),
    TRANSPORTE("Transporte"),
    PETS("Pets"),
    SAUDE("Saúde"),
    SALARIO("Salário"),
    IMPOSTOS_E_TRIBUTOS("Impostos e tributos"),
    TARIFAS("Tarifas"),
    EDUCACAO("Educação"),
    ALIMENTACAO("Alimentação"),
    SUPERMERCADO("Supermercado"),
    BONUS_E_PLR("Bônus e PLR"),
    INVESTIMENTOS("Investimentos"),
    VIAGEM("Viagem"),
    CUIDADOS_PESSOAIS("Cuidados pessoais");
    private final String description;
    Categoria(String description) {
        this.description = description;
    }

}
