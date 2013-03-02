require './Numeros.rb'

describe 'Numeros' do 
	it 'verifica de um numero é primo' do
		Numeros.new(1).primo?.should == true
		Numeros.new(2).primo?.should == true
		Numeros.new(3).primo?.should == true
		Numeros.new(4).primo?.should == false
		Numeros.new(5).primo?.should == true
		Numeros.new(6).primo?.should == false
		Numeros.new(7).primo?.should == true
		Numeros.new(8).primo?.should == false
		Numeros.new(9).primo?.should == false
		Numeros.new(10).primo?.should == false
		Numeros.new(11).primo?.should == true
		Numeros.new(19).primo?.should == true
	end

	it 'verifica de um numero é perfeito' do
		Numeros.new(1).perfeito?.should == false
		Numeros.new(2).perfeito?.should == false
		Numeros.new(3).perfeito?.should == false
		Numeros.new(6).perfeito?.should == true
		Numeros.new(19).perfeito?.should == false
		Numeros.new(28).perfeito?.should == true
		Numeros.new(54).perfeito?.should == false
		Numeros.new(496).perfeito?.should == true
		Numeros.new(8128).perfeito?.should == true
	end

	it 'verifica de um numero é feliz' do
		Numeros.new(1).feliz?.should == true
		Numeros.new(7).feliz?.should == true
		Numeros.new(10).feliz?.should == true
		Numeros.new(13).feliz?.should == false
		Numeros.new(19).feliz?.should == false
		Numeros.new(23).feliz?.should == false
	end
end