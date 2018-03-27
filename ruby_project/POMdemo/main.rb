#coding:utf-8
require "selenium-webdriver"
require "irb"
# require "openwebsite"

# 执行测试用例

# 调用另一个文件的内容
load "./pages/openwebsite.rb"
load "./common/com.rb.rb"


browser "chrome"
# browser "ff"
# browser "ie"
openwebsite "https://www.taobao.com"

property(id,q).send_key "华为手机"