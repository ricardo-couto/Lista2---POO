require './Pessoa.rb'

describe 'Pessoa' do

  it 'obtem idade, peso e altura de uma pessoa' do
    pessoa = Pessoa.new(30, 75, 1.78)
    pessoa.obter_idade().should == 30
    pessoa.obter_peso().should == 75
    pessoa.obter_altura().should == 1.78
  end

  it 'permite engordar' do
    pessoa = Pessoa.new(30, 75, 1.78)
    pessoa.engordar(5)
    pessoa.obter_peso().should == 80
  end

  it 'permite emagrecer' do
    pessoa = Pessoa.new(30, 75, 1.78)
    pessoa.emagrecer(5)
    pessoa.obter_peso().should == 70
  end

  it 'permite envelhecer' do
    pessoa = Pessoa.new(30, 75, 1.78)
    pessoa.envelhecer()
    pessoa.obter_idade().should == 31
    pessoa.envelhecer()
    pessoa.obter_idade().should == 32
    pessoa.envelhecer()
    pessoa.obter_idade().should == 33
  end

  it 'permite crescer dependendo da idade' do
    pessoa = Pessoa.new(15, 75, 1.78)
    pessoa.envelhecer()
    pessoa.obter_idade().should == 16
    pessoa.obter_altura().should == 1.795
    pessoa.envelhecer()
    pessoa.obter_idade().should == 17
    pessoa.obter_altura().should == 1.81

    pessoa2 = Pessoa.new(20, 75, 1.78)
    pessoa2.envelhecer()
    pessoa2.obter_idade().should == 21
    pessoa2.obter_altura().should == 1.795
    pessoa2.envelhecer()
    pessoa2.obter_idade().should == 22
    pessoa2.obter_altura().should == 1.795

    pessoa3 = Pessoa.new(22, 75, 1.78)
    pessoa3.envelhecer()
    pessoa3.obter_idade().should == 23
    pessoa3.obter_altura().should == 1.78
    pessoa3.envelhecer()
    pessoa3.obter_idade().should == 24
    pessoa3.obter_altura().should == 1.78
  end
end
