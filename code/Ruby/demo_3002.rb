puts "-在方法中使用块-------------------------"


def say
     puts "123"
     puts "789"
     puts yield
end
say do
   "李四"
 end
