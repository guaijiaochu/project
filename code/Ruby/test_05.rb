　 require ‘watir-webdriver‘
     @@b = Watir::Browser.new
     @@b.goto("http://www.baidu.com/")
     @@b.text_field(:name"word").set("ruby")
     @@b.button(:value, "百度一下").click