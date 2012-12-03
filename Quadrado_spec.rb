require './Quadrado.rb'

describe 'Quadrado' do

  it 'permite consultar lados do quadrado' do
    quadrado = Quadrado.new(4)
    quadrado.consultar_lados.should == 4
  end

  it 'permite alterar lados do quadrado' do
    quadrado = Quadrado.new(4)
    quadrado.consultar_lados.should == 4
    quadrado.alterar_lados(5)
    quadrado.consultar_lados.should == 5
  end

  it 'calcula area de um quadrado' do
    quadrado = Quadrado.new(4)
    quadrado.consultar_lados.should == 4
    quadrado.calcular_area.should == 16
    quadrado.alterar_lados(5)
    quadrado.calcular_area.should == 25
  end

  it 'nao aceita lado zero ou negativo' do
    expect { Quadrado.new(0) }.to raise_error
    expect { Quadrado.new(-2) }.to raise_error
  end
end
