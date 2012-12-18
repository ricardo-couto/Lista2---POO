require './Ponto.rb'

class Retangulo

attr_reader :altura, :largura, :centro 

  def initialize(altura, largura, centro)
    @altura = altura
    @largura = largura
    @centro = centro
  end

  def alterar_centro(novo_centro)
    @centro = novo_centro
  end

  def consultar_vertices()
    variacao_x = largura / 2
    variacao_y = altura / 2
    vertices = [Ponto.new(centro.x - variacao_x, centro.y - variacao_y), 
                Ponto.new(centro.x - variacao_x, centro.y + variacao_y),
                Ponto.new(centro.x + variacao_x, centro.y - variacao_y), 
                Ponto.new(centro.x + variacao_x, centro.y + variacao_y)]
  end

  def altura()
    @altura
  end

  def largura()
    @largura
  end

  def centro()
    @centro
  end
end
