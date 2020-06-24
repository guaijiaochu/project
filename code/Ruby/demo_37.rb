puts "---method_missing------------------------"

class Missing
  def miss
    puts "我没有丢失miss方法"
  end
  def method_missing pd
    puts "对不起，在Missing类中没有#{pd.to_s}实例方法"
  end
  def self.method_missing pd
     puts "对不起，在Missing类中没有#{pd.to_s}类方法"
  end
end
missing=Missing.new
puts missing.miss
puts missing.put
puts Missing.put
