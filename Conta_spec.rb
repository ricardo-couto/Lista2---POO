require './Conta.rb'

describe 'Conta' do

  it 'cria conta com nome do correntista, numero da conta e saldo inicial zero' do
    conta = Conta.new("Maria", 123)
    conta.consultar_saldo().should == 0
  end

  it 'consulta nome do correntista e numero da conta' do
    conta = Conta.new("Maria", 123)
    conta.consultar_nome_correntista().should == "Maria"
    conta.consultar_numero_conta().should == 123
  end

  it 'permite realizar depositos' do
    conta = Conta.new("Maria", 123)
    conta.consultar_saldo().should == 0
    conta.realizar_deposito(50)
    conta.consultar_saldo().should == 50
    conta.realizar_deposito(200)
    conta.consultar_saldo().should == 250
  end

  it 'permite realizar saques' do
    conta = Conta.new("Maria", 123)
    conta.consultar_saldo().should == 0
    conta.realizar_deposito(300)
    conta.consultar_saldo().should == 300
    conta.realizar_saque(100)
    conta.consultar_saldo().should == 200
    conta.realizar_saque(150)
    conta.consultar_saldo().should == 50
  end

  it 'permite realizar transferencias' do
    conta_origem = Conta.new("Maria", 123)
    conta_destino = Conta.new("Joao", 134)
    conta_origem.consultar_saldo().should == 0
    conta_destino.consultar_saldo().should == 0
    conta_origem.realizar_deposito(300)
    conta_origem.consultar_saldo().should == 300
    conta_origem.realizar_transferencia(conta_destino, 100)
    conta_origem.consultar_saldo().should == 200
    conta_destino.consultar_saldo().should == 100
  end

  it 'nao permite realizar saques e transferencias que deixam o saldo negativo' do
    conta_origem = Conta.new("Maria", 123)
    conta_destino = Conta.new("Joao", 134)
    conta_origem.consultar_saldo().should == 0
    conta_destino.consultar_saldo().should == 0
    conta_origem.realizar_deposito(300)
    conta_origem.consultar_saldo().should == 300
    expect { conta_origem.realizar_saque(301) }.to raise_error
    expect { conta_origem.realizar_transferencia(conta_destino, 350) }.to raise_error
  end
end
