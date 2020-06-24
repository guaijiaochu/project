

puts "--方法（参数）------------------------------"

class Animal
   def eat(food,water)
     puts "动物在吃"+food
     puts "动物在喝"+water
   end
end

a=Animal.new
a.eat("馒头","泉水")
