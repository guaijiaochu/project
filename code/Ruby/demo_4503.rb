puts "--线程的创建及操作----------------"

i=1
threadjoin1=Thread.new 10 do |value|
  while i<value 
    puts "#{i}"
    i+=1
  end  
end
threadjoin1.join

threadjoin2=Thread.new do
  10.times do |a|
    puts "第#{a+1}次输出"
  end
end

threadjoin2.join