#类型转换
pingpai="诺基亚"
yanse="黄色"
xinghao="009"
shangshi_date="2017年5月"
price="500"
sale=0.8

puts "品牌:"+pingpai
puts "颜色:"+yanse
puts "型号:"+xinghao
puts "上市时间:"+shangshi_date
puts "价格:"+price
puts "优惠价格:"+(price.to_i*sale).to_s


puts "*****************************"

pingpai="诺基亚"
yanse="黄色"
xinghao="009"
shangshi_date="2017年5月"
price=500
sale=0.8

puts "品牌:"+pingpai
puts "颜色:"+yanse
puts "型号:"+xinghao
puts "上市时间:"+shangshi_date
puts "价格:"+price.to_s
puts "优惠价格:"+(price*sale).to_s