class Bomba_Combustivel

  def initialize(capacidade, preco_por_litro)
    validar_bomba(capacidade, preco_por_litro)
    @capacidade = capacidade
    @preco_por_litro = preco_por_litro
    @quantidade_presente_na_bomba = 0
  end

  def encher()
    @quantidade_presente_na_bomba = @capacidade
  end

  def abastecer_por_valor(valor)
    quantidade_abastecida = valor/@preco_por_litro
    validar_abastecimento(quantidade_abastecida)
    @quantidade_presente_na_bomba -= quantidade_abastecida
    quantidade_abastecida
  end

  def abastecer_por_litros(quantidade_litros)
    validar_abastecimento(quantidade_litros)
    @quantidade_presente_na_bomba -= quantidade_litros
    quantidade_litros * @preco_por_litro
  end

  def alterar_preco(novo_preco)
    @preco_por_litro = novo_preco
  end

  def retornar_capacidade()
    @capacidade
  end

  def retornar_preco_por_litro()
    @preco_por_litro
  end

  def retornar_quantidade_combustivel()
    @quantidade_presente_na_bomba
  end

private

  def validar_bomba(capacidade, preco_por_litro)
    raise if capacidade <= 0 || preco_por_litro <= 0
  end

  def validar_abastecimento(quantidade_litros)
    raise if quantidade_litros > @quantidade_presente_na_bomba
  end
end
