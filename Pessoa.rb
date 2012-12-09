class Pessoa

  def initialize(idade, peso, altura)
    @idade = idade
    @peso = peso
    @altura = altura
  end

  def engordar(quantidade)
    @peso += quantidade
  end

  def emagrecer(quantidade)
    @peso -= quantidade
  end

  def envelhecer()
    if @idade < 21
      @idade += 1
      crescer()
    elsif
      @idade += 1
      obter_altura()
    end
  end

  def obter_idade()
    @idade
  end

  def obter_peso()
    @peso
  end

  def obter_altura()
    @altura
  end

private

  def crescer()
    @altura += 0.015
  end
end

