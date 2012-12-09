class Conta

  def initialize(nome_correntista, numero_conta)
    @nome_correntista = nome_correntista
    @numero_conta = numero_conta
    @saldo = 0
  end

  def consultar_saldo()
    @saldo
  end

  def consultar_nome_correntista()
    @nome_correntista
  end

  def consultar_numero_conta()
    @numero_conta
  end

  def realizar_deposito(valor)
    @saldo += valor
  end

  def realizar_saque(valor)
    sacar_ate_limite_zero(valor)
    @saldo -= valor
  end

  def realizar_transferencia(conta_destino, valor)
    sacar_ate_limite_zero(valor)
    realizar_saque(valor)
    conta_destino.realizar_deposito(valor)
  end

private

  def sacar_ate_limite_zero(valor)
    raise if valor > @saldo
  end
end
