class Triangulo

  def initialize(lado1, lado2, lado3)
    validar_triangulo(lado1, lado2, lado3)
    @lado1 = lado1
    @lado2 = lado2
    @lado3 = lado3
  end

  def consultar_lados()
    consultar()
  end

  def alterar_lados(lado1, lado2, lado3)
    @lado1 = lado1
    @lado2 = lado2
    @lado3 = lado3
  end

  def calcular_area()
    calcular()
  end

  def calcular_perimetro()
    @lado1 + @lado2 + @lado3
  end

private

  def consultar()
    lados = []
    lados.push(@lado1, @lado2, @lado3)
    #lados
  end

  def calcular()
    p = (@lado1 + @lado2 + @lado3)/2.0
    area = Math.sqrt(p * (p - @lado1) * (p - @lado2) * (p - @lado3))
    area
  end

  def validar_triangulo(lado1, lado2, lado3)
    raise if lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || lado1 > (lado2 + lado3) || lado2 > (lado1 + lado3) || lado3 > (lado1 + lado2)
  end
end
