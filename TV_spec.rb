require './TV.rb'

describe 'TV' do

  it 'permite ligar e desligar a TV' do
    tv = TV.new()
    tv.consultar_estado().should == false
    tv.ligar().should == true
    tv.desligar().should == false
    tv.ligar().should == true
    tv.desligar().should == false
  end

  it 'permite consultar canal e volume da TV' do
    tv = TV.new()
    tv.consultar_estado().should == false
    tv.consultar_canal().should == 1
    tv.consultar_volume().should == 0
  end

  it 'permite alterar canal e volume da TV' do
    tv = TV.new()
    tv.consultar_estado().should == false
    tv.consultar_canal().should == 1
    tv.consultar_volume().should == 0
    tv.alterar_canal(10)
    tv.consultar_canal().should == 10
    tv.alterar_canal(34)
    tv.consultar_canal().should == 34
    tv.aumentar_volume()
    tv.consultar_volume().should == 1
    tv.aumentar_volume()
    tv.consultar_volume().should == 2
    tv.diminuir_volume()
    tv.consultar_volume().should == 1
  end

  it 'permite alterar canal e volume da TV dentro de uma determinada faixa' do
    tv = TV.new()
    tv.consultar_estado().should == false
    tv.consultar_canal().should == 1
    tv.consultar_volume().should == 0
    tv.alterar_canal(10)
    tv.consultar_canal().should == 10
    expect { tv.alterar_canal(61) }.to raise_error
    expect { tv.alterar_canal(0) }.to raise_error
    tv.aumentar_volume()
    tv.consultar_volume().should == 1
    tv.diminuir_volume()
    tv.consultar_volume().should == 0
    expect { tv.diminuir_volume() }.to raise_error
    for i in 0..30
      tv.aumentar_volume()
    end
    tv.consultar_volume().should == 30
    expect { tv.aumentar_volume() }.to raise_error
  end
end
