puts "--时间和日期-----------------"


time=Time.new
puts "当前时间为#{time}"
puts "年#{time.year}"
puts "月#{time.month}"
puts "日#{time.day}"
puts "时#{time.hour}"
puts "分#{time.min}"
puts "秒#{time.sec}"
puts "微秒#{time.usec}"

puts "**********gm******"
time1=Time.gm(2017,9,21,14,35,20)
puts "#{time1}"
puts "****************"
time1=Time.gm(2017,9,21,14,35,20).to_a
puts time1[2]
puts time1[5]
puts "*++++++++返回一年，月，周的第几天++++++++++++++++++++++"
puts "当前是一年的第#{time.yday}天"
puts "当前是一月的第#{time.mday}天"
puts "当前是一周的第#{time.wday}天"

puts "*+++++相隔时间+++++++++++++++++++++"
time2=Time.mktime(1999,9,9,9,9,9)
mktime1=time2+60
mktime3=time2+6000
mktime4=Time.now-time2


puts time2
puts "时间#{mktime1}"
puts "时间"+mktime3.to_s
puts "现在和约定时间相差#{mktime4}秒"


puts "*+++++日期的格式化+++++++++++++++++++"
puts time.strftime("现在是%c")
puts time.strftime("星期%A")
puts time.strftime("小时为%H")





