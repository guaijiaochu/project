puts "-方法返回值-------------------------------"
class Animal
     def eat 
         "肉"
     end
     
     def drink
       return "泉水"
     end
end

a=Animal.new
puts "狗吃#{a.eat}"
puts "狗喝"+"#{a.drink}"
