require './Bomba_Combustivel.rb'

describe 'Bomba_Combustivel' do

  it 'criar uma de bomba de gasolina com capacidade e preço por litro' do
    bomba = Bomba_Combustivel.new(300, 2.50)
    bomba.retornar_capacidade().should == 300
    bomba.retornar_preco_por_litro().should == 2.50
    bomba.retornar_quantidade_combustivel().should == 0
  end

  it 'permite encher a bomba de gasolina completamente' do
    bomba = Bomba_Combustivel.new(300, 2.50)
    bomba.retornar_quantidade_combustivel().should == 0
    bomba.encher()
    bomba.retornar_quantidade_combustivel().should == 300
  end

   it 'permite abastecer por valor' do
    bomba = Bomba_Combustivel.new(300, 2.50)
    bomba.retornar_quantidade_combustivel().should == 0
    bomba.encher()
    bomba.retornar_quantidade_combustivel().should == 300
    bomba.abastecer_por_valor(100).should == 40
  end

  it 'permite abastecer por quantidade de litros' do
    bomba = Bomba_Combustivel.new(300, 2.50)
    bomba.retornar_quantidade_combustivel().should == 0
    bomba.encher()
    bomba.retornar_quantidade_combustivel().should == 300
    bomba.abastecer_por_litros(50).should == 125
  end

  it 'permite alterar o preco do litro de combustivel' do
    bomba = Bomba_Combustivel.new(300, 2.50)
    bomba.retornar_capacidade().should == 300
    bomba.retornar_preco_por_litro().should == 2.50
    bomba.alterar_preco(3.00)
    bomba.retornar_preco_por_litro().should == 3.00
  end

  it 'so realiza o abastecimento se existir combustivel suficiente na bomba' do
    bomba = Bomba_Combustivel.new(300, 2.50)
    bomba.retornar_quantidade_combustivel().should == 0
    bomba.encher()
    bomba.retornar_quantidade_combustivel().should == 300
    bomba.abastecer_por_litros(140).should == 350
    bomba.retornar_quantidade_combustivel().should == 160
    bomba.abastecer_por_valor(100).should == 40
    bomba.retornar_quantidade_combustivel().should == 120
    expect { bomba.abastecer_por_litros(170) }.to raise_error
    expect { bomba.abastecer_por_valor(301) }.to raise_error
  end

  it 'nao aceita criar uma bomba com capacidade e preco por litro zero ou negativo' do
    expect { Bomba_Combustivel.new(0, 2.50) }.to raise_error
    expect { Bomba_Combustivel.new(-5, 2.50) }.to raise_error
    expect { Bomba_Combustivel.new(30, 0) }.to raise_error
    expect { Bomba_Combustivel.new(30, -2.50) }.to raise_error
    expect { Bomba_Combustivel.new(0, -2.50) }.to raise_error
    expect { Bomba_Combustivel.new(-450, -2.50) }.to raise_error
  end
end
