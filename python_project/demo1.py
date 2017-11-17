# coding: utf-8

n=1
def pri(x):
	print "********","第",n,"次执行","**********************"
	print "有序集合为:",x
	print "第2个元素为：",x[1]
	print "最后一个元素为：",x[-1]

l=[1,2,3]
pri(l)
n=n+1

l.append(4)
pri(l)
n=n+1

l.insert(2,'中国')
pri(l)
n=n+1

l[2]='yidali'
pri(l)
n=n+1

l.pop(3)
pri(l)
n=n+1

t=(1,8,5,6,9,"d","ds","wt","wer")
pri(t)





