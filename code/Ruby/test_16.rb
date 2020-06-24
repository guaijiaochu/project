#设置页面元素的操作

#click
require 'watir-webdriver'
browser.button(:id=>'kw').click
browser.link(:text=>'百度一下').click
browser.radio(:id=>'radio_1').click
browser.image(:id=>'img_1').click
browser.text_field(:id=>'text_field').click
#如果有时候 click 方法不管用，可以试试 click 的替代方法：fire_event
browser.button.fire_event('onclick')

#set
browser.text_field(:id=>'text_field1').set "watir-webdriver"
#check

#select
#这个方法选择对中文 的支持不是很好，选择的值为中文时可能抱错
browser.select_list(:id=>'s').select('Op1')
#这种方法想当于按值选择，比较靠谱
browser.driver.find_element(:id=>'s').find_elements(:tag_name=>'option')[1].click

#send_key
browser.send_keys("{ENTER}") #watir
browser.send_keys :enter #watir-webdriver
browser.element.send_keys [:control, 'a'], :backspace #多个步骤
browser.element.send_keys "1111" #输入一个 String 类型的值

#执行JS脚本
js<<=JS_1
#这里是你的 JS 脚本
document.write("<h1>这是标题</h1>");
document.write("<p>这是段落。</p>");
document.write("<p>这是另一个段落。</p>");
JS_1
#调用 execute_script 函数执行
@browser.execute_script(JS_1)

