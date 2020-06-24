puts "--线程的创建及操作--------显示及停止线程--------"

i=1
t=Thread.new 10 do |value|
  while i<value 
    puts "#{i}"
    i=i+1
    if(i>5)
      Thread.kill t
    end
  end  
end

p=Thread.new do
  10.times do |a|
    puts"第#{a+1}次输出"
    if(a>=4)
    Thread.exit 
    end
  end
end

