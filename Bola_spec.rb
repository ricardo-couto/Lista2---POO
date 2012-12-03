require './Bola.rb'

describe 'Bola' do
  it 'permite consultar a cor de uma bola' do
    bola = Bola.new("verde")
    bola.consultar_cor.should == "verde"
  end

  it 'permite alterar a cor de uma bola' do
    bola = Bola.new("verde")
    bola.consultar_cor.should == "verde"
    bola.alterar_cor("preto")
    bola.consultar_cor.should == "preto"
  end
end
