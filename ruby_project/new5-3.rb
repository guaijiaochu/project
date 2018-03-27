# 定义输入搜索值的方法
def 搜索华为手机
	# 输入华为手机，点击搜索
	@dr.find_element(:id,'q').send_key "华为手机"
	# @dr.find_element(:class,'search-button').click
	puts 222
end

# def click (property,propertyvalue)
# 	# @dr.find_element("property","propertyvalue").click
# 	@dr.find_element(:class,'search-button').click
# end


# 定义点击的方法
def 点击搜索按钮
	@dr.find_element(:class,'search-button').click
end