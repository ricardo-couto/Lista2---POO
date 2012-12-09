class TV

  def initialize()
    @estado = false
    @canal = 1
    @volume = 0
  end

  def ligar()
    @estado = true
  end

  def desligar()
    @estado = false
  end

  def alterar_canal(novo_canal)
    validar_canal(novo_canal)
    @canal = novo_canal
  end

  def aumentar_volume()
    @volume += 1
    validar_volume()
  end

  def diminuir_volume()
    @volume -= 1
    validar_volume()
  end

  def consultar_estado()
    @estado
  end

  def consultar_canal()
    @canal
  end

  def consultar_volume()
    @volume
  end

   PRIMEIRO_CANAL = 1
   ULTIMO_CANAL = 60

private

  def validar_canal(novo_canal)
    raise if novo_canal < PRIMEIRO_CANAL || novo_canal > ULTIMO_CANAL
  end

  def validar_volume()
    raise if @volume < 0 || @volume > 30
  end
end
