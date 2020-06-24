puts "-在方法中使用块-------------------------"


def say
     name="张三"
     puts "123"
     yield name
     puts "789"
end
say do |name|
   puts "姓名是"+name
 end
puts "******"
say {|name|
   puts "姓名是"+name

 }