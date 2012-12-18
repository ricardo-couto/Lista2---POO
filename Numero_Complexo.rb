class Numero_Complexo

  def initialize (real, imaginaria)
    @real = real
    @imaginaria = imaginaria
  end

  attr_reader :real, :imaginaria

  def somar(outro_numero)
    Numero_Complexo.new(@real + outro_numero.real, @imaginaria + outro_numero.imaginaria)
  end

  def subtrair(outro_numero)
    Numero_Complexo.new(@real - outro_numero.real, @imaginaria - outro_numero.imaginaria)
  end

  def multiplicar(outro_numero)
    Numero_Complexo.new((@real*outro_numero.real) - (@imaginaria*outro_numero.imaginaria), 
                        (@imaginaria*outro_numero.real) + (@real*outro_numero.imaginaria))
  end

  def retorna_string()
    "#{@real} + #{@imaginaria}i"
  end

  def ==(outro_numero)
    @real == outro_numero.real && @imaginaria == outro_numero.imaginaria
  end

  def parte_real()
    @real
  end

  def parte_imaginaria()
    @imaginaria
  end
end
