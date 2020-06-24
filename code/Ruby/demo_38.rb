puts "---duck typing------------------------"

class MusicAvi
  def play
    puts ".avi格式的视频已经添加到列表中"
  end
end

class Music3gp
  def play
    puts"mudic3gp格式的视频已经添加到列表中"
  end
end

class MusicRmv
    def play
    puts"musicRmv格式的视频已经添加到列表中"
  end
end

class MusicRmvb
    def play
    puts"musicRmvb格式的视频已经添加到列表中"
  end
end

def playmusic(music)
  music.play
end

playmusic MusicAvi.new
playmusic Music3gp.new
playmusic MusicRmvb.new
playmusic MusicRmv.new