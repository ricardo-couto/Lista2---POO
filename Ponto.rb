class Ponto

attr_reader :x, :y

  def initialize(x,y)
    @x = x
    @y = y
  end

  def consultar_x()
    @x
  end

   def consultar_y()
    @y
  end

  def ==(outro)
    x == outro.x && y == outro.y
  end
end
