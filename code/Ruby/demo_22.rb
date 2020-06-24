#Hush对象
food=["黑米","紫米","大米","小米","白面"]
puts food[-3]
puts"------------------------------"
car=Array.new
car[0]="奔驰"
car[1]="宝马"
car[2]="奥迪"
car[3]="保时捷"
puts car[3]
puts"------------------------------"
puts car.size()
puts"------------------------------"
car[5]="劳斯莱斯"
puts car
puts"------------------------------"
str1=%W[上海\s自来水\s来自\s上海]
str2=%w[上海\s自来水\s来自\s上海]
puts str1
puts str2


puts"*******************************"
food_1=["小米","大米","黑米"]
food_2=%W[香蕉\n葡萄]
food_1.concat(food_2)
puts"输出food_1所有元素"
puts food_1
puts"输出food_2所有元素"
puts food_2
puts"*******************************"
food_1=["小米"+"大米"+"黑米"]
food_2=%W[香蕉\s葡萄]
food_1.concat(food_2)
puts"输出food_1所有元素"
puts food_1
puts"输出food_2所有元素"
puts food_2
