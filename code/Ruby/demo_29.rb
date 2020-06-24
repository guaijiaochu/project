puts "-属性------------定义标识符-----------------"

class Car
  def initialize(brand,color)
    @brand=brand
    @color=color
  end
  def show
    puts "这是一辆 #@color 的 #@brand 汽车"
  end

end
car=Car.new("奔驰","白色")
car.show
