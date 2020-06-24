

puts "--------------------------------"

class Animal
   
end
a=Animal.new
 class <<a
          def put
              puts "这是puts方法"
          end
 end

a.put
