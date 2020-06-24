require "watir"
include Watir  
c=Watir::Browser.new :chrome
c.goto('http://www.baidu.com/')  
c.text_field(:id, 'kw').set('ruby')  
c.button(:id, 'su').click  