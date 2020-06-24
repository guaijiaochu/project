puts "--返回并挂起当前线程----------------"


Thread.fork do 
  t=Thread.current
  puts "使用start创建新线程，当前线程是"+t.to_s+"\n"
end

m=Thread.current
puts "主线程是"+m.to_s+"\n"















