require './Numero_Complexo.rb'

describe 'Numero_Complexo' do

  it 'consultar parte real e parte imaginária de um numero complexo' do
    numero = Numero_Complexo.new(1,2)
    numero.parte_real(). should == 1
    numero.parte_imaginaria().should == 2
  end

  it 'permite somar dois numeros complexos' do
    numero = Numero_Complexo.new(1,2)
    numero.somar(Numero_Complexo.new(3,6)).should == Numero_Complexo.new(4,8)
  end

  it 'permite subtrair dois numeros complexos' do
    numero = Numero_Complexo.new(4,7)
    numero.subtrair(Numero_Complexo.new(1,3)).should == Numero_Complexo.new(3,4)
  end

  it 'permite multiplicar dois numeros complexos' do
    numero = Numero_Complexo.new(1,2)
    numero.multiplicar(Numero_Complexo.new(3,2)).should == Numero_Complexo.new(-1,8)
  end

  it 'permite comparar a igualdade entre dois numeros complexos' do
    numero = Numero_Complexo.new(1,2)
    numero.should == Numero_Complexo.new(1,2)
    numero.should_not == Numero_Complexo.new(2,2)
    numero.should_not == Numero_Complexo.new(-1,2)
  end

  it 'retorna um numero complexo no formato da string "a + bi"' do
    numero = Numero_Complexo.new(4,7)
    numero.retorna_string().should == "4 + 7i"
  end
end
