puts "---异常处理机制---------------不同异常不同处理块------"

begin
    class Swim
        def swimming name
          @name=name
          puts "这是一条名为#@name 的美人鱼"
        end
 



    s=Swim.new
    
    s.run
    #s.swimming 56
    s.swimming 


          rescue NoMethodError
            puts "没有此方法，出现异常"
            
          rescue ArgumentError
            puts "参数不一致，出现异常"
    end
end
