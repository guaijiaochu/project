#跳转语句
puts"-break-------------------"
i=0
loop{
puts "i的值是"+i.to_s
i+=1
if i>5 then
  break
end
}
puts"-next-------------------"
music=1
while (music<=5)do
  if(music==5)
    music+=1
    next
  end
  puts "《剪爱》这歌曲已循环播放了"+music.to_s+"次"
  music+=1
  yinyue=1
  while yinyue<=3 do
      if yinyue==2
        yinyue+=1
        next
      end
      puts "《曲终人散》这首音乐已经循环播放了"+yinyue.to_s+"次"
      yinyue+=1
    
    end
  
  end
puts"-redo-------------------"
puts"-return-------------------"