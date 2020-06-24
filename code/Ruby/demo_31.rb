puts "-类的继承-------------------------"

class Bird
  def initialize
  @wing=2
  end
end
class Chick<Bird
  def show
  puts "小鸡有 #@wing 只翅膀"
  end
end
chick=Chick.new
chick.show