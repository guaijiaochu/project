# python异常处理
try:
	undef
except NameError as e:
	print "error:",e

try:
	a
except Exception as e:
	print "error:",e
