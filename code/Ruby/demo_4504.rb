puts "--线程的创建及操作--------显示及停止线程--------"


t1=Thread.start do
  t1.pass
  puts "我是123"
end


Thread.start do
    puts "我是456"
end

puts "当前时间"+Time.now.to_s
sleep 2
puts "两秒后时间"+Time.now.to_s

