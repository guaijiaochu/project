puts "--创建异常类------------------"



class NewException<Exception
end


begin
    class Swim
        def swimming name
          @name=name
          puts "这是一条名为#@name 的美人鱼"
        end
    s=Swim.new
    s.swimming "2","3"

      rescue ArgumentError
      raise NewException,"参数不一致的异常"
    end
end
