class Numeros

	def initialize(numero)
		@numero = numero
	end

	def primo?
		contador = 0
		if @numero == 1 || @numero == 2 
			true
		elsif @numero.modulo(2) == 0
			false
		else
			for i in (1..@numero)
				if @numero.modulo(i) == 0
					contador += 1
				end
			end
			contador == 2 ? true : false
		end
	end

	def perfeito?
		soma = 0
		for i in (1..@numero-1)
			if @numero.modulo(i) == 0
				soma += i
			end
		end
		soma == @numero ? true : false
	end

	def feliz?
		soma = 0
		anteriores = []
		numero_parcial = @numero ** 2
		soma = numero_parcial
		while soma != 1
			digitos_soma = []
			digitos_soma = soma.to_s.split("")
			soma = 0
			digitos_soma.each do |elemento|
				soma += elemento.to_i ** 2
			end
			if anteriores.include?(soma)
				return false
			elsif
				anteriores.push(soma)
			end
		end
		return true
	end
end
