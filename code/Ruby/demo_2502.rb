

puts "--------------------------------"

class Animal
    class Head
          def put
              puts "这是puts方法"
          end
     end
end

a=Animal::Head.new
a.put
