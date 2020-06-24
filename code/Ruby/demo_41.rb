puts "---异常处理机制----------------------"

begin
    class Swim
        def swimming name
          @name=name
          puts "这是一条名为#@name 的美人鱼"
        end
 



    s=Swim.new
    #s.swimming 56
    s.swimming 

          rescue
            puts "参数不一致，出现异常"
    end
end
