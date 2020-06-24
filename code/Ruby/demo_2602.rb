puts "---带参数的方法-----------------------------"
class Animal
   def eat (food="狗粮",water="脉动")
     puts "动物在吃"+food
     puts "动物在喝"+water
   end
end

a=Animal.new
a.eat("馒头","泉水")
a.eat()