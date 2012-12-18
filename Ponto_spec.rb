require './Ponto.rb'

describe 'Ponto' do

  it 'possui as coordenadas x e y' do
    ponto = Ponto.new(1,2)
    ponto.consultar_x().should == 1
    ponto.consultar_y().should == 2
  end

  it 'verefica se um ponto é igual a outro ponto' do
    ponto = Ponto.new(1,2)
    ponto.should == Ponto.new(1,2)
    ponto.should_not == Ponto.new(2,2)
  end
end
