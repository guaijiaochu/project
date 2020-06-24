puts "-在方法中使用块-------------------------"


def say
     
     puts "123"
     yield
     puts "789"
end
say{
  puts "456"
}
puts "------------"
say do
  puts "1.2.3"
end