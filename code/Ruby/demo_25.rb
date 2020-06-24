#创建类
class Animal
  puts "这是一个类"
end

puts "--------------------------------"

class Animal
  puts self
  puts self.class
  
  def put
      puts self
      puts self.class
  end

end
a=Animal.new
a.put
