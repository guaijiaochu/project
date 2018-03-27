
# 输入华为手机，点击搜索
dr.find_element(:id,'q').send_key "华为手机"
dr.find_element(:class,'search-button').click

# 选择 移动4G/联通4G/电信4G
dr.find_element(:xpath,".//*[@id='J_NavCommonRowItems_2']/a[1]/span[2]").click

# 点击运行内存RAM
dr.find_element(:xpath,".//*[@id='spulist-nav']/div/div[2]/div/div[5]/div[2]/div/span").click

# 此处需要等待0.5秒
sleep 0.5

# 点击6G
dr.find_element(:xpath,".//*[@id='spulist-nav']/div/div[2]/div/div[5]/div[3]/div/a[2]").click
