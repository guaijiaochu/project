#表达式
#if 带返回值    while和unti不带返回值

age=12
res=if age<18
age.to_s+"岁是未成年"
else
age.to_s+"岁是成年"
end

puts res

puts"-------------------------------------------"
if age<18
puts age.to_s+"岁是未成年"
else
puts age.to_s+"岁是成年"
end

