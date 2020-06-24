puts "---异常处理机制---------------获得系统引发异常------"

begin
    class Swim
        def swimming name
          @name=name
          puts "这是一条名为#@name 的美人鱼"
        end
    s=Swim.new
    
    #s.swimming 56
    s.swimming "2","3"

rescue Exception=>e
  puts "程序异常"
  puts "#{e.backtrace}"
  puts "#{e.to_s}"
  puts "#{e.message}"
    end
end
