

puts "1----------------------------------------------"
dcy="我不记得你"
ly=:dcy
puts ly==:"dcy"


def fangfa
  puts"我记得你"
end

show=:fangfa
puts show==:"fangfa"

puts "2----------------------------------------------"

dcy="我不记得你"  #字符串
ly=:"我不记得你"   #符号
puts ly.to_s==dcy
puts dcy.to_sym==ly

puts "3----------------------------------------------"

dcy="我不记得你"  #字符串
ly=:"我不记得你"   #符号
dcyandly=%s{dcy}
puts ly==dcyandly
puts dcy.to_sym==ly

puts "4----------------------------------------------"

dcy="我不记得你"  #字符串
ly=:dcy  #符号
dcyandly=%s{dcy}
puts ly==dcyandly
puts dcy.to_sym==ly
