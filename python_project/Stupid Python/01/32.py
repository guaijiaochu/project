# 习题 32: 循环和列表 77页

the_count = [1, 2, 3, 4, 5]
# this first kind of for-loop goes through a list
for number in the_count:
    print( "This is count %d" % number)
# -----------------------------------------------------
# we can also build lists, first start with an empty one
elements = []

# then use the range function to do 0 to 5 counts
for i in range(0, 6):
    print ( "Adding %d to the list." % i)
    elements.append(i)
# append方法用于在列表末尾添加新的对象
# list.append(object)  object是添加到列表末尾的对象  该方法无返回值


# now we can print them out too
for i in elements:
   print(  "Element was: %d" % i)

