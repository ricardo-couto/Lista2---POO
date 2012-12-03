class Quadrado

  def initialize(lados)
    validar_lados(lados)
    @lados = lados
  end

  def consultar_lados()
    @lados
  end

  def alterar_lados(novos_lados)
    @lados = novos_lados
  end

  def calcular_area()
    @lados**2
  end

private

  def validar_lados(lados)
    raise if lados <= 0
  end
end
