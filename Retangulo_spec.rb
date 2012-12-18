require './Retangulo.rb'

describe 'Retangulo' do

  it 'permite consultar altura, largura e centro' do
    centro = Ponto.new(5,7)
    retangulo = Retangulo.new(3,4,centro)
    retangulo.altura().should == 3
    retangulo.largura().should == 4
    retangulo.centro().should == centro
  end

   it 'permite consultar os vertices do retangulo' do
    centro = Ponto.new(5,3)
    retangulo = Retangulo.new(2,4,centro)
    retangulo.consultar_vertices().should == [Ponto.new(3,2), Ponto.new(3,4), 
                                              Ponto.new(7,2), Ponto.new(7,4)]
  end

  it 'permite alterar o centro' do
    centro = Ponto.new(5,7)
    retangulo = Retangulo.new(6,4,centro)
    retangulo.centro().should == centro
    novo_centro = Ponto.new(4,3)
    retangulo.alterar_centro(novo_centro)
    retangulo.centro().should == novo_centro
    retangulo.consultar_vertices().should == [Ponto.new(2,0), Ponto.new(2,6), 
                                              Ponto.new(6,0), Ponto.new(6,6)]
  end
end
