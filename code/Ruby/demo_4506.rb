puts "--线程的创建及操作-----线程的状态"

t=Thread.start do
  puts "123"
end

puts "状态："+t.status.to_s