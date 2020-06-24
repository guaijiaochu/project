puts "--线程的创建及操作----------------"

thread=Thread.start"hello"do |value|
  puts "start方法创建线程#{value}\n"
end
thread=Thread.fork"world"do |value|
  puts "fork方法创建线程#{value}"
end
