# 习题 39: 字典, 可爱的字典
stuff = {'name': 'Zed' ,  'age': 36  ,  'height': 6*12+2}
print (stuff['name'])
print(stuff['height'])

stuff['city'] = "San Francisco"
print (stuff['city'])

# 将物件放入字典
stuff[1] = "Wow"
print (stuff[1])

# 输出全部字典内容
print (stuff)

# 删除物件的方法，也就是使用 del这个关键字：
del stuff['city']
print (stuff)


# 
# 列表和字典有何不同？
# 列表是有序排列的一些物件，而字典是将一些物件（keys）对应到另外一些物件（values）
# 的数据结构。
# 字典能用在哪里？
# 各种你需要通过某个值去查看另一个值的场合。其实你可以把字典当做一个“查询表”。
# 列表能用在哪里？
# 列表是专供有序排列的数据使用的。你只要知道索引就能查到对应的值了。






