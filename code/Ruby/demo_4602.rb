puts "--线程的创建及操作-----线程的状态"


mutex=Mutex.new

t1=Thread.new do
  mutex.lock
  sleep 30
end

t1=Thread.new do
  if mutex.try_lock
    puts "可用"
  else
    puts"不可锁定"
  end
end


























