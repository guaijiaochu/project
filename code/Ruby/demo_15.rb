#并行赋值和嵌套赋值
#并行赋值
puts"1----------------------------"
c="我是变量c"
d="我是变量d"
puts "交换前c:"+c,"交换前d:"+d
c,d=d,c
puts "交换后c:"+c,"交换后d:"+d


puts"2----------------------------"

subject=["文科","理科"]
subjectall=["历史","化学","物理","生物","计算机","数学"]

a,b=subject
puts "科目包含："+a+"和"+b

a,*b=subjectall
#puts "科目文科包含："+a+"\n科目理科包含"+b
puts "科目文科包含："+a+"\n科目理科包含:",b

#a,b="12345",*subject
#puts a,b
puts "000"
a,b=*subjectall
puts a,b



#嵌套赋值
puts"3----------------------------"

subject=["文科","理科","自然"]
q,(w,e),r=subject
puts "科目q:"+q,"科目w:"+w,"科目e:","科目r:"+r
puts"1111"

q,(w,*e),r="历史",["化学","物理","生物","计算机"],"数学"
puts "科目q:"+q,"科目w:"+w,"科目e:",e,"科目r:"+r





