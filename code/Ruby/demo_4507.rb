puts "--线程的创建及操作-----线程的状态"

t1=Thread.new do
  sleep 2
end

t2=Thread.new do
  if Threadcurrent=Thread.main
    puts"当前线程是主线程"
  end
end

num=Thread.list.size
puts "线程的数量是#{num}"

if Thread.list.include?(Thread.main)
  puts "正在运行主线程"
end
