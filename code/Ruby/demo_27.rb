puts "-实例变量和类变量-------------------------------"
puts "-实例变量-----------------------------"
@name="Tom"
class Cat
  @color="黄色"
      def init
        @wight="3kg"
      end
      def show
           puts "#@name 是一只 #@color 颜色的、体重为 #@wight 的懒猫"
      end
      puts "#@color"
end

puts "#@name"

cat=Cat.new
cat.init
cat.show 