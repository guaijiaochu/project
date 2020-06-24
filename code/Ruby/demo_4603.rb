puts "--线程的创建及操作-----线程的状态"

@num=200
@mutex=Mutex.new
def ticketNum (num)
  @mutex.synchronize do
  Thread.pass
  
  if (@num>=num)
    @num-=num
    puts "成功购票#{num}张"
    
  else
    puts "有#{num}张车票购买失败"
  end
 end
end
  
 t1=Thread.new(199){|num|ticketNum(num)}
 t2=Thread.new(2){|num|ticketNum(num)}
 t1.join
 t2.join