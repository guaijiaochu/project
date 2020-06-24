puts "--线程的创建及操作----同步队列类"

require "thread"

qr=SizedQueue.new(25)
ms=qr.max
puts "队列的最大长度为：#{ms}"

qr.max=78
ms=qr.max
puts "修改后队列的最大长度为：#{ms}"

























































