puts "--自定义异常------------------"



class NewAngleExceptoin<Exception
  def ErrorMessage
   return "这是自定义的异常"
  end
end


begin
    class Swim
        def swimming name
          @name=name
          puts "这是一条名为#@name 的美人鱼"
          raise NewAngleExceptoin
        end
    s=Swim.new
    s.swimming "2"

      rescue NewAngleExceptoin=>e
        puts "异常出现在 #{e}"
        puts "异常信息为： #{e.ErrorMessage}"
    end
end
