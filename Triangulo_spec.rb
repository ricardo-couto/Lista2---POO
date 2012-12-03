require './Triangulo.rb'

describe 'Triangulo' do

  it 'permite consultar lados do triangulo' do
    triangulo = Triangulo.new(3,4,5)
    triangulo.consultar_lados().should == [3,4,5]
  end

  it 'permite alterar lados do triangulo' do
    triangulo = Triangulo.new(3,4,5)
    triangulo.consultar_lados().should == [3,4,5]
    triangulo.alterar_lados(2,3,4)
    triangulo.consultar_lados().should == [2,3,4]
  end

  it 'calcula area de um triangulo' do
    triangulo = Triangulo.new(3,4,5)
    triangulo.calcular_area().should == 6.0
  end

  it 'calcula o perimetro de um triangulo' do
    triangulo = Triangulo.new(3,4,5)
    triangulo.calcular_perimetro().should == 12
  end

  it 'nao aceita lados zero ou negativos e valida o triangulo' do
    expect { Triangulo.new(0,5,3) }.to raise_error
    expect { Triangulo.new(-2,2,4) }.to raise_error
    expect { Triangulo.new(6,2,3) }.to raise_error
  end
end
